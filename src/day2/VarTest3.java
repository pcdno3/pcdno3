public class VarTest3
{
	public static void main(String[]args)
	{
		//2. �Ǽ��� - �Ҽ��� ���� ���е��� ���� �ִ�
		//float : �ڿ� F�� �ٿ�����
		float a=3.14F;	//F�� ������ ������ double�� �ν�
		double b = 3.1415;
		double c = a*b;	//float*double	=>	double*double=>double

		System.out.println("a="+a+", b="+b);
		System.out.println("c="+c);
	
		//�Ҽ��� ���� ���е� Ȯ��
		float x=22f, y=7f;
		float z=x/y;
		System.out.println("float z="+z);

		double i=22, j=7;
		double k=i/j;
		System.out.println("double k="+k);

		float f=.567F, g=456;
		//=> float���� ����(int)�� �Է¹޴��� �ڵ����� float������ �Ҽ��� .0�� �ٰԵȴ�

		System.out.println("f="+f+", g="+g); //f=0.567, g=456.0
	
	
	}
}
