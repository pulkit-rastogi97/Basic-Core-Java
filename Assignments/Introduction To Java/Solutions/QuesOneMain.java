import java.util.Scanner;
public class QuesOneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the keyword to be searched : ");
		String key = sc.next();
		boolean ans = QuesOne.isPresent(QuesOne.initProductNames(),key);
		if(ans)
			System.out.println("Is Present");
		else
			System.out.println("Not Present");
		sc.close();
		

	}

}
