class  ConversionTest{
	public static void main(String[] args) {
	/*
		����ȯ
		-�ڷ����� �ϳ��� ���Ͻ�Ű�� ��
		-���� �� ���Կ��� �߻�
		
		[1] ����
			����� ���� ū �ڷ������� ����ȯ �����
			int/double => double/double = double
			(int�� double�� �ڵ� ����ȯ�Ǿ� ����)
		[2] ����
			���Խ� �¿캯�� Ÿ���� ��ġ�ؾ� ��
			��ġ���� �ʴ� ��� ����ȯ�� �߻���
			
			1)�ڵ� ����ȯ
			int a=10;
			double b=a; // a�� double�� ����ȯ �Ǿ�� �ϴµ�, ���� ������ �����͸�
			ū ������ �Ҵ��ϴ� ��쿡�� ���� �ս��� �߻����� �����Ƿ� �ڵ� ����ȯ ��
		*/
			/*2)����� ����ȯ
			int a=20;
			byte num=(byte)a; //a�� byte�� ����ȯ�Ǿ�� �ϴµ�, ū ������ �����͸�
							//���� ������ �Ҵ��ϴ� ��쿡�� �� �ս��� �߻��ϹǷ�
							//��������� ����ȯ�ؾ���

				   ��������� ����ȯ�� cast �������̿�
					�ڷ��� ����1=(�ڷ���)����2;
					
				  �� �ڵ� ����ȯ ��Ģ
				  byte -> short -> int -> long -> float -> double
						   char -> int ->
					
					�⺻���� �������� ���� ����ȯ�� �� ����
					
				*/
			
		//[1] ���� - �ڵ� ����ȯ
		int a=150;
		long b=a;
		
		//����� ����ȯ
		int age=20;
		byte num=(byte)age;

		float e=1.78F;
		int f=(int)e;


		System.out.println("a="+a+", b="+b);
		System.out.println("age="+age+", num="+num);
		System.out.println("e="+e+", f="+f);

		//[2]����
		long g=30L;
		double h=3.14;
		double d=g*h; //long*double -? double*double=double
						//long�� g�� double�� �ڵ� ����ȯ

		int i=1, j=2;
		float k=i/j; //	int/int=int ����� : 0 -> 0.0 
					//-> float���� ����� ����ȯ�� ���߱⶧�� �Ҽ����� ���ư�
		float m=(float)i/j;

		System.out.println("g="+g+", h="+h+", d="+d);
		System.out.println("k="+k+", m="+m);

	}
}
