class Student {
	int score;
	String name;
	static final int MAX_SCORE = 100;
	
	String getName(){
		return name;
	}
	
	//名前と点数を渡すコンストラクタ
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	//名前だけを渡すコンストラクタ（点数は0にする）
	Student(String name){
		//以下はStudent(String name, int score)コンストラクタを呼び出している
		this(name, 0);  
		/* Student(String name)コンストラクタの中に直接初期化処理を書くこともできますが
		 * 複数のコンストラクタの中に似たようなコードを毎回書くのはメンテナンス性が悪いので
		 * コードを共有化できる場合は最も引数が多いコンストラクタに必要な処理を記述し、
		 * 引数の少ないコンストラクタでは、this(・・・)を使って
		 * 別のコンストラクタを呼び出す様にするとよい
		 * 今回のStudentクラスでは、引数が最も多い
		 * Student(String name, int score)コンストラクタに
		 * フィールドの初期化処理を記述し、引数の少ない
		 * Student(String name)コンストラクタではthis(・・・)を使っています
		 * */
		
	}
	
	void setName(String name){
		//thisを付けることで引数のnameではなくフィールドのnameを使用
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
		Student murata = new Student("村田");
		//murata.score = 40;
		murata.printScore();
		
		Student okada = new Student("岡田", 80);
		okada.printScore();
	}
}
