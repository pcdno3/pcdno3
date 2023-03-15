class ConversionTest3 {
	public static void main(String[] args) {
			
		byte a=10, b=20;
		//byte c=a+b;
		//java:5: error: incompatible types: possible lossy conversion from int to byte
		/*
			CPU는 int형 정수연산을 가장 시속으로 처리하도록 설계되어 있다.
			따라서 정수형 연사을 진행할 때, 모든 피연산자를 int형으로 변환하는 과정을 거친다
			*/

			/*
				연산의 경우 형변환 정리
				[1] int 보다 작은 자료형 연산시에는 int로 형변환된 후에 연산을 수행함
				[2]	int 보다 큰 자료형은 연산시에는 가장 큰 자료형으로 형변환된 후 연산함 
			*/
			
		int d= a+b; // byte+byte -> int+int=int
		System.out.println("d="+d);

		long x=500L;
		int y=70;
		long z=x+y; //long+int-> long+long=long
		System.out.println("z="+z);

		byte i=127;
		short j=32000;
		int k=2100000000; //0 8개(21억)
		
		long m3=i*j*k;	//byte*short*int=int (i*j*k = int 범위를 넘어서 garbage값이 나옴)	
	
		long m=(long)i*j*k;//long*short*int=long -> (long범주 내라서 정상값이 나옴)
		
		long m2=(long)(i*j*k);//가로(i*j*k)가 먼저 계산 되기때문에 garbage값이 long으로 형변환해도 garbage값)
		
		System.out.println("m="+m+"\nm2="+m2+"\nm3="+m3);
		
		long e=Long.MAX_VALUE;
		long f=(int)e;	//int값을 초과하는것을 int로 형변환하기 때문에 garbage값이 나옴 하면안됨
		
		long g=78900L;
		int h=(int)g;	//개발자 책임으로 범주내에서는 형변환 가능함.
		System.out.println("f="+f+", h="+h);
		System.out.println(e);
	}
}
