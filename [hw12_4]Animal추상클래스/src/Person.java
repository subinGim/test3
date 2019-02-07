//****************************************************
// 파일명: Person.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.26
// 내용: hw12_4의 Animal클래스를 상속받는 클래스
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
		System.out.println("안녕 "+getName());
	}

	public void newYear()
	{
		this.age++;
	}
	
	@Override
	public String toString() 
	{
		return getName()+" "+age+"세";
	}
}
