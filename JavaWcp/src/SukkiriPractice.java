// weight == 60
// (age1 + age2) * 2 > 60
// age % 2 == 1
// name.equals("湊")
public class SukkiriPractice {
//practice 3-3
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "たこ焼き";  
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}
}
