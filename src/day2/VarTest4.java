public class VarTest4
{	
	public static void main (String[]args)
	{
		//문자형 - char : 문자 하나를 저장해서 사용
		char ch='A';	/*반드시 작은 따옴표('x')로 감싸야 함, 영어는 한글자가 1byte
							실제로 A에 해당하는 유니코드 값인 65가 들어감*/
		char a='가';	 //한글은 1글자가 2byte
		//char b='xyz';	//error:char는 문자 하나만 저장해야함

		System.out.println("ch="+ch+", a="+a);
		
		System.out.println(ch+1); //ch에는 65가 들어가므로 65+1=>66
		//=>실제로는 해당 문자의 유니코드값이 저장되므로 char는 실상은 숫자형 자료형=>연산도 가능

		int c=ch+2;	//c=65  > 65+2=67 char+int -> int+int = int
		char d=(char)c;	//유니코드 67에 해당하는 문자인 C
		System.out.println("c="+c+", d="+d);

		char e=65; //직접 유니코드값을 넣어도 됨 'A'=65
		System.out.println("e="+e); //A

		System.out.println((int)ch);	//65


	}
}