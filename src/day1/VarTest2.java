public class VarTest2
{
	public static void main(String[]args)
	{
		/*
         기본자료형
         [1] 숫자형
            1) 정수형
               byte   1바이트   -128~127
               short   2바이트   대략 +-32000
               int      4바이트   21억
               long   8바이트   922경
            2) 실수형 - 값의 정밀도에 따라 결전
               floot   4바이트   대략 소수이하 7자리까지 유효
               double   8바이트      소수이하 15자리까지 유효
         
         [2] 문자형
            char   2바이트

         [3] 논리형 - true, false가 들어감
            boolean   1바이트
      */
		byte a=127;
		short b=32000;
		int c=2100000000; //21억개 0이 8개
		long d=21000000000L; //0 이 9개 in형 값의 범위를 넘어서는 경우 L붙이기

		long e = a*b*c; // 연산시에는 변수의 모든 타입을 제일 큰 자료형으로 일치시켜서 계산함
		//=> byte*short*int = int*int*int => 결과는 int

		System.out.println("a="+ a +", b="+b);
		System.out.println("c="+ c +", d="+d);
		System.out.println("a*b*c => " + e);

		byte y=127;
		y++;
		System.out.println("y" +y);
	}

}