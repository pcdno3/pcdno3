public class VarTest3
{
	public static void main(String[]args)
	{
		//2. 실수형 - 소수점 이하 정밀도와 관련 있다
		//float : 뒤에 F를 붙여야함
		float a=3.14F;
		double b = 3.1415;
		double c = a*b;	//float*double	=>	double*double=>double

		System.out.println("a="+a+", b="+b);
		System.out.println("c="+c);
	}
}
