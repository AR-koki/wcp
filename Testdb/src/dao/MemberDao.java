package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import test.User;
public class MemberDao {
	private Connection con = null;
	private Statement stmt = null;
	private ConnectionManager cm;
	
	private void getConnection() throws DAOException{
        if ( this.con != null ){ return;    }
        cm = ConnectionManager.getInstance();
        con = cm.getConnection();
    }
	private void createStmt() throws DAOException{
        if ( this.stmt != null){    return; }
        try {
            stmt =con.createStatement();
        } catch (SQLException e) {
            throw new DAOException("[createStmt]異常", e);
        }
    }
	public int insertMember(User user) throws DAOException {
        getConnection();
        int count = 0;
        String sql = "INSERT INTO member (id, name, pass) VALUES(?, ?, ?)";
        int id = Integer.parseInt(user.getId());
        String name = user.getName();
        String pass = user.getPass();
 
        try(PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, pass);
            count += pstmt.executeUpdate();
        } catch(SQLException e) {
            throw new DAOException("[UserDAO#insertMember]異常", e);
        } finally {
            close();
        }
        return count;
    }
	private void close() throws DAOException {
        try {
            if (stmt != null) { stmt.close(); }
        } catch (SQLException e) {
            throw new DAOException("[closeStatement]異常", e);
        } finally {
            this.stmt = null;
            this.cm = null;
        }
    }
}
