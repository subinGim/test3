//***********************************************
// 파일명: MainTest.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.28
// 내용: java.util패키지에 있는 클래스들을 이용하여 문제를 해결해본다.
//***********************************************
package example;
import java.util.*;
public class MainTest {

	public static void main(String[] args) {
		System.out.println("hw20_1: 김수빈\n");

		System.out.println("반지름이 1.5인 원의 면적: "+(1.5*1.5*Math.PI));
		System.out.println("3의 10승: "+Math.pow(3, 10));
		System.out.println("루트8: "+Math.sqrt(8));
		System.out.println("0.0 ~ 1.0사이의 랜덤넘버: "+Math.random());

		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호(-포함) 입력: ");
		String str = scan.nextLine();

		String first = str.substring(0, 6);
		String second = str.substring(7);

		System.out.println("앞자리: "+first);
		System.out.println("뒷자리: "+second);

		System.out.println("합 = "+(Integer.valueOf(first)+Integer.valueOf(second)));
	}

}
