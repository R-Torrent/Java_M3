import java.util.Scanner;
import java.util.ArrayList;

public class Milestone1Fase4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrayCiutats = new ArrayList<>();
		
		System.out.println("Introdueix sis noms de ciutats:");
		for (int i = 6; i > 0 ; i--)
			arrayCiutats.add(sc.nextLine());
		
		ArrayList<char[]> arrayCiutatsInvertides = new ArrayList<>();
		// ArrayList amb 6 arrays char[] buits de mides fixes segons el cas
		for (String ciutat : arrayCiutats)
			arrayCiutatsInvertides.add(new char[ciutat.length()]);
		
		for (int i = 0; i < arrayCiutats.size(); i++) {
			String ciutat = arrayCiutats.get(i);
			char[] ciutat_inv = arrayCiutatsInvertides.get(i);
			
			// 'length' del array encara buit, no 'length()' de un String!
			int l_ciutat = ciutat_inv.length;
			
			// Omplir l'array lletra per lletra
			for (int j = 0; j < l_ciutat; j++)
				ciutat_inv[j] = ciutat.charAt(l_ciutat - j - 1);
			
			arrayCiutatsInvertides.set(i, ciutat_inv);
		}
			
		System.out.println("Ciutats invertides:");
		for (char[] ciutat_inv : arrayCiutatsInvertides)
			System.out.println(ciutat_inv);
		
		sc.close();
	}
}