import java.util.Scanner;

	class ScannerTest  {
		public static void main(String[] args) {
			//사용자로부터 입력 받을 때는 Scanner클래스의 nextInt(), nextLine(), nextDouble(),
			//등의 메서드를 이용한다
			//public int nextInt()
			//public String nextLine()
			
			//사용자로부터 이름, 나이를 입력받아서 출력하기

			Scanner sc= new Scanner(System.in);
			System.out.println("이름을 입력하세요");
			String name=sc.nextLine();
			
			System.out.println("나이를 입력하세요");
			int age=sc.nextInt();

			System.out.println("이름은 "+name+"이고, 나이는 "+age);

			
	}
}
