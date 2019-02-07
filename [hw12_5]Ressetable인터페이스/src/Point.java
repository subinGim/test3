//******************************************************
// ���ϸ�: Point.java
// �ۼ���: 201634002 �����
// �ۼ���: 18.05.26
// ����: hw12_5���� ��ǥ���� �ʱ�ȭ,����,��ǥ�̵� ����� �ϴ� Ŭ����
//********************************************************
public class Point implements Resettable
{
	private double pointX;
	private double pointY;
	private double resetPointX;
	private double resetPointY;
	
	public Point(double x, double y) 
	{
		pointX = x;
		pointY = y;
		resetPointX = x;
		resetPointY = y;
	}
	
	public void reset() 
	{
		pointX = resetPointX;
		pointY = resetPointY;
	}
	
	public void move(double moveX,double moveY)
	{
		pointX += moveX;
		pointY += moveY;		
	}
	
	@Override
	public String toString() 
	{
		return "��ǥ: ("+pointX+", "+pointY+")";
	}
}
