class  ToStringTest{
	public static void main(String[] args) {

		//�������� ���ڿ��� ��ȯ�� ���� toString() �̿�
		
		//Integer.toString() , Double.toString() emd
		
		//public static string toString(int i)
		
		int n=123;
		String str=Integer.toString(n);
		
		System.out.println("int n+10:"+(n+10)+", String str+10:"+(str+10));

		double d = 3.14;
		str=Double.toString(d);

		char ch='A';
		str=Character.toString(ch);

		boolean bool=true;
		
		str=Boolean.toString(bool);
		
		System.out.println("str="+str); //true�� "true"���ڿ��� ���
		
	}
}
