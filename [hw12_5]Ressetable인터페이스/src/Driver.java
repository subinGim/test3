//******************************************************
// ���ϸ�: Driver.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.26
// ����: hw12_5�� ���θ޼ҵ��, ��������� �ܾװ� �̵��� ��ǥ���� ����ϴ� Ŭ����
//********************************************************
public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_5: �����\n");
		
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
