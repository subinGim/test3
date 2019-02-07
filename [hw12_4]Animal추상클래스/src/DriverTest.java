//****************************************************
// 파일명: DriverTest.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.26
// 내용: 추상 클래스를 이용하여 각 클래스마다 재정의하여 출력하는 연습을 한다.
//****************************************************
public class DriverTest 
{

	public static void main(String[] args) 
	{
		System.out.println("hw12_4: 김수빈\n");
		
		Animal[] animals= new Animal[4];
		
		animals[0]=new Dog("진돌이", 13.5);
		animals[1]=new Dog("진순이", 12.5);
		animals[2]=new Person("홍길동", 20);
		animals[3]=new Person("박길동", 25);

		for(int i=0; i<4; i++) 
		{
			System.out.println(animals[i].toString());
		}
		System.out.println();//줄바꿈
		
		for(int i=0; i<4; i++) 
		{
			animals[i].sound();
		}
		
		for(int i=0; i<4; i++) 
		{
			animals[i].newYear();
		}
		
		System.out.println("\n-------1년 후-------");
		for(int i=0; i<4; i++) 
		{
			System.out.println(animals[i].toString());
		}
		
		for(int i=0; i<4; i++) 
		{
			animals[i].newYear();
		}
		
		System.out.println("\n-------2년 후-------");
		for(int i=0; i<4; i++) 
		{
			System.out.println(animals[i].toString());
		} 
	}

}
