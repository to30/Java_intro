class Student {
	String name;
	int score;
	static final int MAX_SCORE = 100;
	
	void printScore() {
		System.out.println(name + "�����" + MAX_SCORE + "���_��" + score + "�_�ł��B");
	}
}



public class StudentSample {
	public static void main(String... args){
		Student murata = new Student();
		murata.name ="���c";
		murata.score = 40;
		murata.printScore();
	}
}
