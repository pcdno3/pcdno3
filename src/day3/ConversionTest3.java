class ConversionTest3 {
	public static void main(String[] args) {
			
		byte a=10, b=20;
		//byte c=a+b;
		//java:5: error: incompatible types: possible lossy conversion from int to byte
		/*
			CPU�� int�� ���������� ���� �ü����� ó���ϵ��� ����Ǿ� �ִ�.
			���� ������ ������ ������ ��, ��� �ǿ����ڸ� int������ ��ȯ�ϴ� ������ ��ģ��
			*/

			/*
				������ ��� ����ȯ ����
				[1] int ���� ���� �ڷ��� ����ÿ��� int�� ����ȯ�� �Ŀ� ������ ������
				[2]	int ���� ū �ڷ����� ����ÿ��� ���� ū �ڷ������� ����ȯ�� �� ������ 
			*/
			
		int d= a+b; // byte+byte -> int+int=int
		System.out.println("d="+d);

		long x=500L;
		int y=70;
		long z=x+y; //long+int-> long+long=long
		System.out.println("z="+z);

		byte i=127;
		short j=32000;
		int k=2100000000; //0 8��(21��)
		
		long m3=i*j*k;	//byte*short*int=int (i*j*k = int ������ �Ѿ garbage���� ����)	
	
		long m=(long)i*j*k;//long*short*int=long -> (long���� ���� ������ ����)
		
		long m2=(long)(i*j*k);//����(i*j*k)�� ���� ��� �Ǳ⶧���� garbage���� long���� ����ȯ�ص� garbage��)
		
		System.out.println("m="+m+"\nm2="+m2+"\nm3="+m3);
		
		long e=Long.MAX_VALUE;
		long f=(int)e;	//int���� �ʰ��ϴ°��� int�� ����ȯ�ϱ� ������ garbage���� ���� �ϸ�ȵ�
		
		long g=78900L;
		int h=(int)g;	//������ å������ ���ֳ������� ����ȯ ������.
		System.out.println("f="+f+", h="+h);
		System.out.println(e);
	}
}
