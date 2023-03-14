public class VarTest5
{
	public static void main(String[] args) 
	{
		//3.논리형
		//자바의 논리형은 0,1로 호환되지 않음
		boolean bool=true;
		System.out.println("bool="+bool);
		
		int a=5, b=9;
		boolean c = (a>b); //false
		System.out.println("a="+a+", b="+b);
		System.out.println("a>b : " +c);

	}
}
