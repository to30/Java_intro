class Student {
	String name;
	int score;
	static final int MAX_SCORE = 100;
	
	String getName(){
		return name;
	}
	
	void setName(String name){
		//this��t���邱�Ƃň�����name�ł͂Ȃ��t�B�[���h��name���g�p
		this.name = name;
	}
	
	int getScore(){
		return score;
	}
	
	void setScore(int score){
		this.score = score;
	}

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
