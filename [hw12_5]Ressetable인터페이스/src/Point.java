//******************************************************
// 파일명: Point.java
// 작성자: 201634002 김수빈
// 작성일: 18.05.26
// 내용: hw12_5에서 좌표값을 초기화,리셋,좌표이동 기능을 하는 클래스
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
		return "좌표: ("+pointX+", "+pointY+")";
	}
}
