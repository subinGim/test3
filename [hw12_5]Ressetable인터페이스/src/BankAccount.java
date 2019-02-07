//******************************************************
// ���ϸ�: BankAccount.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.26
// ����: hw12_5���� ��������� �ܾ��� �ʱ�ȭ,����,����� �ϴ� Ŭ����
//********************************************************
public class BankAccount 
{
	private int balance;
	private int resetBalance;
	
	public void reset() 
	{
		balance = resetBalance;
	}
	
	public BankAccount(int balance) 
	{
		this.balance = balance;
		resetBalance = balance;
	}
	
	public void inMoney(int m) 
	{
		balance += m;
	}
	
	public void outMoney(int m) 
	{
		balance -= m;
	}
	
	@Override
	public String toString() {
		return "�ܾ�: "+balance;
	}
	
	
}
