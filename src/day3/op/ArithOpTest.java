class ArithOpTest{
	public static void main(String[] args) {

		/*
			연산자 - 변수나 값의 연산을 위해 사용되는 부호
			피연산자 - 연산의 대상이 되는 것 예) x+y에서 연산자는 + 이고 피연산자는 x,y
					피연산자가 2개 있으면 이항연산자
			연산자의 우선순위
				[1]	산술		>			비교			>	논리		>	대입
				+,-,*,/,%		>,<,>=,<=,==,!==		&&,||,		==
				
				[2]단항	>	이항	>	삼항
				
				연산자의 진행방향
					-단항 연산자와 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다.
		*/

		//	산술연산자
		//	+, -, *, %
		//	% : 나머지 연산자
		int a=7+3;
		int b=7-3;
		int c=a*b;
		double d= 7.0/3;
		int e= 7/3; //몫
		int f= 7%3; //나머지

		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("실수 나눗셈 : "+d);
		System.out.println("정수 나눗셈 결과(몫) : "+e+", 나머지 : "+f);
		System.out.println("");
	}
}
