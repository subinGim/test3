//****************************************************
// ���ϸ�: DriverTest.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.26
// ����: �߻� Ŭ������ �̿��Ͽ� �� Ŭ�������� �������Ͽ� ����ϴ� ������ �Ѵ�.
//****************************************************
public class DriverTest 
{

	public static void main(String[] args) 
	{
		System.out.println("hw12_4: �����\n");
		
		Animal[] animals= new Animal[4];
		
		animals[0]=new Dog("������", 13.5);
		animals[1]=new Dog("������", 12.5);
		animals[2]=new Person("ȫ�浿", 20);
		animals[3]=new Person("�ڱ浿", 25);

		for(int i=0; i<4; i++) 
		{
			System.out.println(animals[i].toString());
		}
		System.out.println();//�ٹٲ�
		
		for(int i=0; i<4; i++) 
		{
			animals[i].sound();
		}
		
		for(int i=0; i<4; i++) 
		{
			animals[i].newYear();
		}
		
		System.out.println("\n-------1�� ��-------");
		for(int i=0; i<4; i++) 
		{
			System.out.println(animals[i].toString());
		}
		
		for(int i=0; i<4; i++) 
		{
			animals[i].newYear();
		}
		
		System.out.println("\n-------2�� ��-------");
		for(int i=0; i<4; i++) 
		{
			System.out.println(animals[i].toString());
		} 
	}

}
