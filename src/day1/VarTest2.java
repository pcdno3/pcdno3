public class VarTest2
{
	public static void main(String[]args)
	{
		/*
         �⺻�ڷ���
         [1] ������
            1) ������
               byte   1����Ʈ   -128~127
               short   2����Ʈ   �뷫 +-32000
               int      4����Ʈ   21��
               long   8����Ʈ   922��
            2) �Ǽ��� - ���� ���е��� ���� ����
               floot   4����Ʈ   �뷫 �Ҽ����� 7�ڸ����� ��ȿ
               double   8����Ʈ      �Ҽ����� 15�ڸ����� ��ȿ
         
         [2] ������
            char   2����Ʈ

         [3] ���� - true, false�� ��
            boolean   1����Ʈ
      */
		byte a=127;
		short b=32000;
		int c=2100000000; //21�ﰳ 0�� 8��
		long d=21000000000L; //0 �� 9�� in�� ���� ������ �Ѿ�� ��� L���̱�

		long e = a*b*c; // ����ÿ��� ������ ��� Ÿ���� ���� ū �ڷ������� ��ġ���Ѽ� �����
		//=> byte*short*int = int*int*int => ����� int

		System.out.println("a="+ a +", b="+b);
		System.out.println("c="+ c +", d="+d);
		System.out.println("a*b*c => " + e);

		byte y=127;
		y++;
		System.out.println("y" +y);
	}

}