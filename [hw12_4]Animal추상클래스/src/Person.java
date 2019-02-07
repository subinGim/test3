//****************************************************
// ���ϸ�: Person.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.26
// ����: hw12_4�� AnimalŬ������ ��ӹ޴� Ŭ����
//****************************************************
public class Person extends Animal
{
	private int age;
	
	public Person(String name, int age) 
	{
		super(name);
		this.age = age;

	}

	public void sound() 
	{
		System.out.println("�ȳ� "+getName());
	}

	public void newYear()
	{
		this.age++;
	}
	
	@Override
	public String toString() 
	{
		return getName()+" "+age+"��";
	}
}
