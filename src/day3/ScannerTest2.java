import java.util.*;

class ScannerTest2{
	public static void main(String[] args) {
		//�簢���� �ʺ�(����)�� ����(����)�� �Է� �޾� ���̸� ����Ͽ� ����Ͻÿ� 

		Scanner sc=new Scanner(System.in);
		
		System.out.println("�簢���� �ʺ� �Է��ϼ���:");
		int width=sc.nextInt();

		System.out.println("�簢���� ���̸� �Է��ϼ���:");
		int height=sc.nextInt();

		//2. ���� ó�� - �簢�� ���� ���ϱ�
		int area = width*height;


		//3. ��� ���
		System.out.println("�簢�� ���� : "+width);
		System.out.println("�簢�� ���� : "+height);
		System.out.println("�簢�� ���� : "+area);
	}
}
