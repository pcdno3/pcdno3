class IncrementOp {
	public static void main(String[] args) {
		/*
			���׿����� - ����������
			++, --

			[1]++
			++a : ������, �������� 1����
			a++ : ������, �����Ŀ� 1����
				a=a+1 �� ����
			
			[2]--
			--a : ������, �������� 1����
			a-- : �İ���, �����Ŀ� 1����
				a=a-1 �� ����
		*/
		//� ���Ŀ� ���Ե� ���� �ƴ϶� �ܵ����� ���Ǵ� ���
		//-> ������, ������ ����� ����
		int a=7;
		a++;	//a=a+1�� ���� �ǹ�,
		System.out .println("a="+a);
		a=7;
		++a;
		System.out.println("a="+a);

			System.out.println("Hello World!");
	}
}
