import java.util.*;
class  ScannerTest5{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("지방의 그램을 입력하세요:");
		int fat=sc.nextInt();

		System.out.println("탄수화물의 그램을 입력하세요:");
		int carbohydrate=sc.nextInt();
		
		System.out.println("단백질의 그램을 입력하세요:");
		int protein=sc.nextInt();
		int calory=(fat*9)+(protein*4)+(carbohydrate*4);
		
		System.out.println("총 칼로리 : "+calory);
		System.out.println("Kcal : "+(calory/1000f));
	}
}
