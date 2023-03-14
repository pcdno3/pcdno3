class VarTest6 
{
	public static void main(String[] args) 
	{
		//참조형 - 문자열 자료형 Sting
		//-> 여러 개의 문자열을 넣는다
		//큰 따옴표(")로 감싸준다

		String name="홍길동";
		String className="지능형 풀스택 과정";
		
		System.out.println("과정명 : "+className);
		System.out.println("이름 : "+name);


		int year=2023;
		System.out.println("올해는 "+year+"년 입니다.");

		/*
		
		+연산자
		1) 더하기 연산자 : 피연산자가 숫자일때는 덧셈
		2) 문자열 연결 연산자 : 피연산자에 문자열이 있을 때는 문자열 연결 연산자
		*/

		int n1=8, n2=9;
		System.out.println(n1+n2+" <=결과"); //17 <=결과
		System.out.println("결과 => " +n1+n2); //결과 => 89
		System.out.println("결과 => " +(n1+n2)); //결과 +> 17



	}
}
