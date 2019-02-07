//****************************************************
// 파일명: Animal.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.26
// 내용: sound와 newYear추상메소드를 가지는 추상클래스
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
