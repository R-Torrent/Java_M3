import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Milestone1Fase2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrayCiutats = new ArrayList<>();
		
		System.out.println("Introdueix sis noms de ciutats:");
		for (int i = 6; i > 0 ; i--)
			arrayCiutats.add(sc.nextLine());
		
		Collections.sort(arrayCiutats);
		
		System.out.println("Ciutats ordenades alfabèticament:");
		for (String ciutat : arrayCiutats)
			System.out.println(ciutat);
		
		sc.close();
	}
}