//****************************************************
// ���ϸ�: Animal.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.26
// ����: sound�� newYear�߻�޼ҵ带 ������ �߻�Ŭ����
//****************************************************
public abstract class Animal 
{
	private String name;

	public Animal(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public abstract void sound();

	public abstract void newYear();
	
	@Override
	public String toString() 
	{
		return name;
	}
}
