public class VarTest4
{	
	public static void main (String[]args)
	{
		//������ - char : ���� �ϳ��� �����ؼ� ���
		char ch='A';	/*�ݵ�� ���� ����ǥ('x')�� ���ξ� ��, ����� �ѱ��ڰ� 1byte
							������ A�� �ش��ϴ� �����ڵ� ���� 65�� ��*/
		char a='��';	 //�ѱ��� 1���ڰ� 2byte
		//char b='xyz';	//error:char�� ���� �ϳ��� �����ؾ���

		System.out.println("ch="+ch+", a="+a);
		
		System.out.println(ch+1); //ch���� 65�� ���Ƿ� 65+1=>66
		//=>�����δ� �ش� ������ �����ڵ尪�� ����ǹǷ� char�� �ǻ��� ������ �ڷ���=>���굵 ����

		int c=ch+2;	//c=65  > 65+2=67 char+int -> int+int = int
		char d=(char)c;	//�����ڵ� 67�� �ش��ϴ� ������ C
		System.out.println("c="+c+", d="+d);

		char e=65; //���� �����ڵ尪�� �־ �� 'A'=65
		System.out.println("e="+e); //A

		System.out.println((int)ch);	//65


	}
}