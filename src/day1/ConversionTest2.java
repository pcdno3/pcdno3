class ConversionTest2 {
	public static void main(String[] args) {
		char ch1='A', ch2='Z';

		int num1=ch1;	//char => int�� �ڵ�����ȯ
		int num2=(int)ch2;	//char�� int������ ����� ����ȯ�� �ϱ⵵ ��


		System.out.println("���� A�� �����ڵ� ��:"+num1);
		System.out.println("���� Z�� �����ڵ� ��:"+num2);

		int n = ch1+1;		//char+int -> int+int -> int, int�� �ڵ�����ȯ�Ǽ� ���
		//	'A'+1 = 65 +1 = 66

		char ch3=(char)(ch1+2); // 65+2=67 -> char�� ����ȯ
		//char ch4=(char)ch1+2;	 //��, ������ ���� int�� char�� ���־��~ �� int�� Ŀ������~ 

	}
}
