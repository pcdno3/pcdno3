class ParseIntTest  {
	public static void main(String[] args) {
		//���ڿ��� �������·� ����ȯ : Integer.parseInt()�޼��� �̿�
		//public static int parseInt(String s)
		String str="123";
		//��int num=(int)str;//error, : �������� �⺻���� Cast�����ڷ� ����ȯ �Ұ�
		//error: incompatible types: String cannot be converted to int
		
		int n= Integer.parseInt(str);//123

		System.out.println("String str+10="+(str+10)); //12310
		System.out.println("int n+10="+(n+10)); //133

		str="3.14";
		double d=Double.parseDouble(str); 
		System.out.println("d+10="+(d+10));//13.14

		str="abc";
		n= Integer.parseInt(str); //�������� ������ ���࿡�� �߻� -> ���ڸ� ����
		//.NumberFormatException: For input string: "abc"
	}
}
