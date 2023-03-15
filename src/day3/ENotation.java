class  ENotation{
	public static void main(String[] args) {
		/*\
			-자바는 소수부가 큰 실수 표현의 편의를 위해 e표기법을 지원함
			-16진수와 8진수 표현법도 지원함
		*/
		
		double d1=1.5e-3; //e표기법, 1.5*10^-3 -> 0.0015
		double d2=1.5e+3; //1.5*10^3 => 1500
		double d3=1.5e3; //1.5*10^3

		int n1=0xA0E;// 16진수- 0x로 시작하면 16진수 표현
		//=> 10*256+0*16+14 = 10진수 2574
		int n2=0125;// 8진수 - 0으로 시작하면 8진수 표현
		//=> 1*64+2*8+5 = 10진수 85

		System.out.println("d1="+d1+", d2="+d2+", d3="+d3);
		System.out.println("n1="+n1+", n2="+n2);
	}
}
