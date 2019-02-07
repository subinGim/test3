//****************************************************
// 파일명: Dog.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.26
// 내용: hw12_4의 Animal클래스를 상속받는 클래스
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
		System.out.println("멍멍 "+getName());
	}

	public void newYear()
	{
		this.speed += 5;
	}

	@Override
	public String toString() 
	{
		return getName()+" 시속"+speed+"km";
	}


}
