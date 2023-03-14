class  ConversionTest{
	public static void main(String[] args) {
	/*
		형변환
		-자료형을 하나로 통일시키는 것
		-연산 및 대입에서 발생
		
		[1] 연산
			연산시 가장 큰 자료형으로 형변환 계산함
			int/double => double/double = double
			(int가 double로 자동 형변환되어 계산됨)
		[2] 대입
			대입시 좌우변의 타입이 일치해야 함
			일치하지 않는 경우 형변환이 발생함
			
			1)자동 형변환
			int a=10;
			double b=a; // a가 double로 형변환 되어야 하는데, 작은 범위의 데이터를
			큰 범위에 할당하는 경우에는 값의 손실이 발생하지 않으므로 자동 형변환 됨
		*/
			/*2)명시적 형변환
			int a=20;
			byte num=(byte)a; //a가 byte로 형변환되어야 하는데, 큰 범위의 데이터를
							//작은 범위에 할당하는 경우에는 값 손실이 발생하므로
							//명시적으로 형변환해야함

				   명시적으로 형변환시 cast 연산자이용
					자료형 변수1=(자료형)변수2;
					
				  ★ 자동 형변환 규칙
				  byte -> short -> int -> long -> float -> double
						   char -> int ->
					
					기본형과 참조형은 서로 형변환할 수 없다
					
				*/
			
		//[1] 대입 - 자동 형변환
		int a=150;
		long b=a;
		
		//명시적 형변환
		int age=20;
		byte num=(byte)age;

		float e=1.78F;
		int f=(int)e;


		System.out.println("a="+a+", b="+b);
		System.out.println("age="+age+", num="+num);
		System.out.println("e="+e+", f="+f);

		//[2]연산
		long g=30L;
		double h=3.14;
		double d=g*h; //long*double -? double*double=double
						//long인 g가 double로 자동 형변환

		int i=1, j=2;
		float k=i/j; //	int/int=int 결과는 : 0 -> 0.0 
					//-> float으로 명시적 형변환을 안했기때매 소수점이 날아감
		float m=(float)i/j;

		System.out.println("g="+g+", h="+h+", d="+d);
		System.out.println("k="+k+", m="+m);

	}
}
