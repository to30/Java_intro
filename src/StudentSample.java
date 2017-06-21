class Student {
	int score;
	String name;
	static final int MAX_SCORE = 100;
	
	String getName(){
		return name;
	}
	
	//���O�Ɠ_����n���R���X�g���N�^
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	//���O������n���R���X�g���N�^�i�_����0�ɂ���j
	Student(String name){
		//�ȉ���Student(String name, int score)�R���X�g���N�^���Ăяo���Ă���
		this(name, 0);  
		/* Student(String name)�R���X�g���N�^�̒��ɒ��ڏ������������������Ƃ��ł��܂���
		 * �����̃R���X�g���N�^�̒��Ɏ����悤�ȃR�[�h�𖈉񏑂��̂̓����e�i���X���������̂�
		 * �R�[�h�����L���ł���ꍇ�͍ł������������R���X�g���N�^�ɕK�v�ȏ������L�q���A
		 * �����̏��Ȃ��R���X�g���N�^�ł́Athis(�E�E�E)���g����
		 * �ʂ̃R���X�g���N�^���Ăяo���l�ɂ���Ƃ悢
		 * �����Student�N���X�ł́A�������ł�����
		 * Student(String name, int score)�R���X�g���N�^��
		 * �t�B�[���h�̏������������L�q���A�����̏��Ȃ�
		 * Student(String name)�R���X�g���N�^�ł�this(�E�E�E)���g���Ă��܂�
		 * */
		
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
		Student murata = new Student("���c");
		//murata.score = 40;
		murata.printScore();
		
		Student okada = new Student("���c", 80);
		okada.printScore();
	}
}
