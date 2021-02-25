import java.util.Scanner;

public class Milestone1Fase1 {
	public static void main(String args[]) {
		String ciutat1 = "";
		String ciutat2 = "";
		String ciutat3 = "";
		String ciutat4 = "";
		String ciutat5 = "";
		String ciutat6 = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix sis noms de ciutats:");
		ciutat1 = sc.nextLine();
		ciutat2 = sc.nextLine();
		ciutat3 = sc.nextLine();
		ciutat4 = sc.nextLine();
		ciutat5 = sc.nextLine();
		ciutat6 = sc.nextLine();
		
		System.out.println("Resultats:");
		System.out.println(ciutat1);
		System.out.println(ciutat2);
		System.out.println(ciutat3);
		System.out.println(ciutat4);
		System.out.println(ciutat5);
		System.out.println(ciutat6);
		
		sc.close();
	}
}