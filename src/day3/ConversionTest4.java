class ConversionTest4 {
	public static void main(String[] args) {
		
		byte a=10;
		short b=20;
		int c=b-a;

		int d=100;
		long e=100000L;
		long f=d*e;

		long g=10000L;
		double h=g;

		float i=4.4444F;
		long j=(long)i;

		char k='a';
		int x=(int)k;

		
		System.out.println("c="+c);
		System.out.println("f="+f);
		System.out.println("h="+h);
		System.out.println("j="+j);
		System.out.println("x="+x);
		
	}
}
