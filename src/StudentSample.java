class Student {
	String name;
	int score;
	static final int MAX_SCORE = 100;
	
	String getName(){
		return name;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	int getScore(){
		return score;
	}
	
	void setScore(int score){
		this.score = score;
	}

	void printScore() {
		System.out.println(name + "さんは" + MAX_SCORE + "満点中" + score + "点です。");
	}
}



public class StudentSample {
	public static void main(String... args){
		Student murata = new Student();
		murata.name ="村田";
		murata.score = 40;
		murata.printScore();
	}
}
