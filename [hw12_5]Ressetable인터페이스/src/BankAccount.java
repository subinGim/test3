//******************************************************
// 파일명: BankAccount.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.26
// 내용: hw12_5에서 은행계좌의 잔액을 초기화,리셋,입출금 하는 클래스
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
		return "잔액: "+balance;
	}
	
	
}
