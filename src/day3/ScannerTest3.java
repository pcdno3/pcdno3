import java.util.*;

class ScannerTest3{
	public static void main(String[] args) {
		//�簢���� �ʺ�(����)�� ����(����)�� �Է� �޾� ���̸� ����Ͽ� ����Ͻÿ� 

		Scanner sc=new Scanner(System.in);
		
		System.out.println("�簢���� �ʺ� �Է��ϼ���:");
		String w=sc.nextLine();

		System.out.println("�簢���� ���̸� �Է��ϼ���:");
		String h=sc.nextLine();


		//2. ���� ó�� - �簢�� ���� ���ϱ�
		//���ڿ��� ���ڷ� ����ȯ �� ����
		int width=Integer.parseInt(w);
		int height=Integer.parseInt(h);
		int area = width*height;


		//3. ��� ���
		System.out.println("�簢�� ���� : "+width);
		System.out.println("�簢�� ���� : "+height);
		System.out.println("�簢�� ���� : "+area);
	}
}
