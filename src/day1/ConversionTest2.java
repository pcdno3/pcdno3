class ConversionTest2 {
	public static void main(String[] args) {
		char ch1='A', ch2='Z';

		int num1=ch1;	//char => int로 자동형변환
		int num2=(int)ch2;	//char와 int간에는 명시적 형변환을 하기도 함


		System.out.println("문자 A의 유니코드 값:"+num1);
		System.out.println("문자 Z의 유니코드 값:"+num2);

		int n = ch1+1;		//char+int -> int+int -> int, int로 자동형변환되서 계산
		//	'A'+1 = 65 +1 = 66

		char ch3=(char)(ch1+2); // 65+2=67 -> char로 형변환
		//char ch4=(char)ch1+2;	 //비교, 에러남 ㅋㅋ int를 char에 못넣어요~ 넘 int가 커버려잇~ 

	}
}
