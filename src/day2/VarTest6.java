class VarTest6 
{
	public static void main(String[] args) 
	{
		//������ - ���ڿ� �ڷ��� Sting
		//-> ���� ���� ���ڿ��� �ִ´�
		//ū ����ǥ(")�� �����ش�

		String name="ȫ�浿";
		String className="������ Ǯ���� ����";
		
		System.out.println("������ : "+className);
		System.out.println("�̸� : "+name);


		int year=2023;
		System.out.println("���ش� "+year+"�� �Դϴ�.");

		/*
		
		+������
		1) ���ϱ� ������ : �ǿ����ڰ� �����϶��� ����
		2) ���ڿ� ���� ������ : �ǿ����ڿ� ���ڿ��� ���� ���� ���ڿ� ���� ������
		*/

		int n1=8, n2=9;
		System.out.println(n1+n2+" <=���"); //17 <=���
		System.out.println("��� => " +n1+n2); //��� => 89
		System.out.println("��� => " +(n1+n2)); //��� +> 17



	}
}
