import java.time.LocalDateTime;

public class HelloWorld {
	//メッセージを表示します
	public static void main(String... args){
		System.out.println("Hello World!");
		/*
		このようにすれば
		複数行のコメントが記載できます。 
		*/
		int numberA = 100;
		int numberB = 200;
		int numberC = numberA + numberB;
		System.out.println(numberC);
		boolean result = numberA > numberB;
		System.out.println(result);
		int second = LocalDateTime.now().getSecond();
		if (second % 2 == 0){
			System.out.println(second +"は偶数");
		}else{
			System.out.println(second +"は奇数");
		}
	}
}
