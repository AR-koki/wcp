
public class Chapter07 {
	public static void main(String[] args) {
		int a = 13;
		if (a < 5) {
			System.out.print("とても近いです。");
		} else if( (5 < a)&&(a < 10) ){
			System.out.print("近いです");
		} else if( (10 < a) && (a < 15)) {
			System.out.println("遠いです");
		} else {
			System.out.println("遠いです");
		}
	}
}
