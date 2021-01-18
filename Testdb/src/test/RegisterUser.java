package test;
import dao.DAOException;
import dao.MemberDao;

public class RegisterUser {
	MemberDao memberDao = new MemberDao();
    public boolean exute(User user){
        boolean registCheck = false;
        try {
            memberDao.insertMember(user);
            registCheck = true;
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return registCheck;
    }

}
