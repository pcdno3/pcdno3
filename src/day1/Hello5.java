import java.lang.*;
public class Hello5
{
	public static void main(String[]args)
	{
		System.out.println("2+5="+2+5); // 문장을 왼쪽순서로 하기때문에 문자열 다음 나온+는 이어주는
		System.out.println("2+5="+(2+5)); // 문장을 가로를 우선으로 하기때문에 숫자 다음 문자열이라서
	}
}
	/*
	   + :
		
		1) 더하기 연산자
			피연산자가 숫자인 경우
			예) 3+5 = 8
		2) 문자열 연결 연산자
			피연산자 중 하나라도 문자열인 경우
			예) 3+ "5" = 35
	*/
