import java.util.*;
class  ScannerTest5{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �׷��� �Է��ϼ���:");
		int fat=sc.nextInt();

		System.out.println("ź��ȭ���� �׷��� �Է��ϼ���:");
		int carbohydrate=sc.nextInt();
		
		System.out.println("�ܹ����� �׷��� �Է��ϼ���:");
		int protein=sc.nextInt();
		int calory=(fat*9)+(protein*4)+(carbohydrate*4);
		
		System.out.println("�� Į�θ� : "+calory);
		System.out.println("Kcal : "+(calory/1000f));
	}
}
