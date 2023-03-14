public class VarTest1
{
	public static void main(String[]args)
	{
		/*
			변수 - 데이터를 저장하기 위해서 메모리에 공간을 만들어 할당하고, 이름을 부여 한 것
			자료형(데이터 타입, data type)
				- 변수 공간을 얼마나 확보할 것인지 크기와 종류를 정하는것
			변수의 선언
				데이터타입 변수명(개발자가 원하는 의미있는이름);
			
				ex)int num;
				
		*/
	
		//변수선언
		int a;
		a=10; //값할당
		
		int b=20; // <  이건 선언과 동시에 값 할당
		
		int c=30, d=40; // < 이건 여러 개 동시에 선언과 할당

		int e, f;
		e=100;
		f=200;	//여러 개를 선언 한 후 , 할당

		int k=45;
		int n = k;	//변수끼리의 할당

		System.out.println("a="+a+", b="+b);	// a=10, b=20
		System.out.println("k + n = " + (k+n));	// k + n = 90
		
		//a변수의 값 변경 가능
		a=300;
		
		// int a =40; //error : 같은 이름의 변수를 다시 선언할 수 없다.
	}
}