import java.util.Scanner;

	class ScannerTest  {
		public static void main(String[] args) {
			//����ڷκ��� �Է� ���� ���� ScannerŬ������ nextInt(), nextLine(), nextDouble(),
			//���� �޼��带 �̿��Ѵ�
			//public int nextInt()
			//public String nextLine()
			
			//����ڷκ��� �̸�, ���̸� �Է¹޾Ƽ� ����ϱ�

			Scanner sc= new Scanner(System.in);
			System.out.println("�̸��� �Է��ϼ���");
			String name=sc.nextLine();
			
			System.out.println("���̸� �Է��ϼ���");
			int age=sc.nextInt();

			System.out.println("�̸��� "+name+"�̰�, ���̴� "+age);

			
	}
}
