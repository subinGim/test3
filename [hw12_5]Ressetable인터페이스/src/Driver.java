//******************************************************
// 파일명: Driver.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.26
// 내용: hw12_5의 메인메소드로, 은행계좌의 잔액과 이동한 좌표값을 출력하는 클래스
//********************************************************
public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_5: 김수빈\n");
		
		BankAccount bankAccount = new BankAccount(1000);
		
		bankAccount.inMoney(500);
		bankAccount.outMoney(200);

		System.out.println(bankAccount.toString());
		
		bankAccount.reset();
		
		System.out.println(bankAccount.toString());
		
		Point point = new Point(1.5, 2.5);
		
		point.move(2.1, 2.1);
		point.move(10.0, 10.0);
		
		System.out.println(point.toString());
		
		point.reset();
		
		System.out.println(point.toString());
	}

}
