public class VarTest3
{
	public static void main(String[]args)
	{
		//2. 실수형 - 소수점 이하 정밀도와 관련 있다
		//float : 뒤에 F를 붙여야함
		float a=3.14F;	//F를 붙이지 않으면 double로 인식
		double b = 3.1415;
		double c = a*b;	//float*double	=>	double*double=>double

		System.out.println("a="+a+", b="+b);
		System.out.println("c="+c);
	
		//소수점 이하 정밀도 확인
		float x=22f, y=7f;
		float z=x/y;
		System.out.println("float z="+z);

		double i=22, j=7;
		double k=i/j;
		System.out.println("double k="+k);

		float f=.567F, g=456;
		//=> float형은 정수(int)를 입력받더라도 자동으로 float형으로 소수점 .0이 붙게된다

		System.out.println("f="+f+", g="+g); //f=0.567, g=456.0
	
	
	}
}
