class ConversionTest2 {
   public static void main(String[] args) {
      char ch1 = 'A', ch2 = 'Z';

      int num1 = ch1; //char => int�� �ڵ�����ȯ��
      int num2 = (int)ch2; //chardhk int������ ����� ����ȯ�ϱ⵵ ��

      System.out.println("���� A�� �����ڵ� �� : " + num1);
      System.out.println("���� Z�� �����ڵ� �� : " + num2);

      int n = ch1 + 1; //chat + int => int + int => int, int�� �ڵ�����ȯ�Ǿ ���
      //=> 'A' + 1 = 65 => 65 + 1 = 66

      char ch3 = (char)(ch1 + 2); //65 + 2 => 67 => char�� ����ȯ
      //char ch4 = (char)ch1 + 2;   //��, Char + int => int�� char�� �ȴ��
 
	  int a=97;
	  char b=(char)a;
	  int c=122;
	  char d=(char)c;
	  char d2=(char)c; 
	  //char d2=c;	error, int -> char�� �ڵ� ����ȯ �ȵ� !!

	  System.out.println("�����ڵ�"+a+" �� �ش��ϴ� ���� : " +b);
	  System.out.println("�����ڵ�"+c+" �� �ش��ϴ� ���� : " +d);

		
		
   }
}