//***********************************************
// ���ϸ�: MainTest.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.28
// ����: java.util��Ű���� �ִ� Ŭ�������� �̿��Ͽ� ������ �ذ��غ���.
//***********************************************
package example;
import java.util.*;
public class MainTest {

	public static void main(String[] args) {
		System.out.println("hw20_1: �����\n");

		System.out.println("�������� 1.5�� ���� ����: "+(1.5*1.5*Math.PI));
		System.out.println("3�� 10��: "+Math.pow(3, 10));
		System.out.println("��Ʈ8: "+Math.sqrt(8));
		System.out.println("0.0 ~ 1.0������ �����ѹ�: "+Math.random());

		Scanner scan = new Scanner(System.in);
		System.out.print("�ֹι�ȣ(-����) �Է�: ");
		String str = scan.nextLine();

		String first = str.substring(0, 6);
		String second = str.substring(7);

		System.out.println("���ڸ�: "+first);
		System.out.println("���ڸ�: "+second);

		System.out.println("�� = "+(Integer.valueOf(first)+Integer.valueOf(second)));
	}

}
