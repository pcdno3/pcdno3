class  VarKind {
	/*
		������ ����
		1) ������� (instance����)
		2) Ŭ�������� (static����)
		3) �������� (local����)
			- �ż��峪 {}���ȿ��� ����� ����
			- ���������� �ݵ�� �ʱ�ȭ�ؾ� ��, �ʱ�ȭ���� �ʰ� ����ϸ� error��!
			- ��������� Ŭ���� ������ �ʱ�ȭ ���� �ʾƵ� default���� ��
	*/
	
	//�������
	int x;
	//Ŭ��������
	static int y;

	public static void main(String[] args) {
		//��������
		int z=0;
		String s="", s2="null";
		double d=0.0;
		boolean bool=false;
		int k;

		System.out.println("Ŭ���� ���� y = "+VarKind.y);
		
		VarKind obj = new VarKind();
		
		System.out.println("�������� z = "+z+", s="+s+", s2="+s2);
		
		System.out.println("d="+d+",bool="+bool);
		System.out.println("k="+k);
		//error: variable k might not have been initialized �ʱ�ȭ ���ϸ� �̿���������

	}
}
