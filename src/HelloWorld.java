import java.time.LocalDateTime;

public class HelloWorld {
	//���b�Z�[�W��\�����܂�
	public static void main(String... args){
		System.out.println("Hello World!");
		/*
		���̂悤�ɂ����
		�����s�̃R�����g���L�ڂł��܂��B 
		*/
		int numberA = 100;
		int numberB = 200;
		int numberC = numberA + numberB;
		System.out.println(numberC);
		boolean result = numberA > numberB;
		System.out.println(result);
		int second = LocalDateTime.now().getSecond();
		if (second % 2 == 0){
			System.out.println(second +"�͋���");
		}else{
			System.out.println(second +"�͊");
		}
	}
}
