import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Milestone1Fase3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrayCiutats = new ArrayList<>(), arrayCiutatsModificades = new ArrayList<>();
		
		System.out.println("Introdueix sis noms de ciutats:");
		for (int i = 6; i > 0 ; i--)
			arrayCiutats.add(sc.nextLine());
		
		for (String ciutat : arrayCiutats)
			arrayCiutatsModificades.add(ciutat.replace('a', '4'));
		
		Collections.sort(arrayCiutatsModificades);
		
		System.out.println("Ciutats modificades ordenades alfabèticament:");
		for (String ciutat : arrayCiutatsModificades)
			System.out.println(ciutat);
		
		sc.close();
	}
}