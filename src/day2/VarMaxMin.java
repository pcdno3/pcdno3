class VarMaxMin
{
	public static void main(String[] args) 
	{
		/*
			Wrapper Ŭ����
			- �ڷ��� ��ü Ŭ����
			- �⺻�� �����鵵 ���δ� ��ü�� �ٷ������ �ϴ� ��찡 �ִµ�,
			  �̶� ���Ǵ� ���� Wrapper Ŭ����

			  Boolean, Character, Byte, Short, Integer, Long, Float, Double
		*/
		byte b_min=Byte.MIN_VALUE;
		byte b_max=Byte.MAX_VALUE;

		int i_min=Integer.MIN_VALUE;
		int i_max=Integer.MAX_VALUE;
		int i=i_max+1;	// garbage��

		char c_min=Character.MIN_VALUE;
		char c_max=Character.MAX_VALUE;

		System.out.println("byte min="+b_min+", byte max="+b_max);
		System.out.println("int min="+i_min+", int max="+i_max+", i="+i);
		System.out.println("char min="+c_min+", char max="+c_max);
		System.out.println("char min code="+(int)c_min+", char max="+(int)c_max);
	}
}
