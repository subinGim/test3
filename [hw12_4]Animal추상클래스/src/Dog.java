//****************************************************
// ���ϸ�: Dog.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.26
// ����: hw12_4�� AnimalŬ������ ��ӹ޴� Ŭ����
//****************************************************
public class Dog extends Animal{
	private double speed;

	public Dog(String name, double speed) 
	{
		super(name);
		this.speed=speed;
	}

	public void sound() 
	{
		System.out.println("�۸� "+getName());
	}

	public void newYear()
	{
		this.speed += 5;
	}

	@Override
	public String toString() 
	{
		return getName()+" �ü�"+speed+"km";
	}


}
