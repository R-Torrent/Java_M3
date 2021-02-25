import java.util.Scanner;

public class Milestone2 {
	public static void main(String args[]) {
		double[][] notes = new double[3][5];
		Scanner sc = new Scanner(System.in);
				
		for (int alumne = 0; alumne < 3; alumne++) {
			System.out.println("Notes d'alumne " + (alumne + 1) + ":");
			for (int examen = 0; examen < 5; examen++) {
				System.out.println("\tResultat examen " + (examen + 1) + ":");
				notes[alumne][examen] = sc.nextDouble(); // *** El signe decimal és la coma ***
			}
		}
		
		int i = 1;
		System.out.println("RESULTATS:"); 
		for (double[] alumne : notes) {
			double mitjana = 0.0;
			for (double examen : alumne)
				mitjana += examen;
			mitjana /= alumne.length;
			System.out.printf("Alumne %d: %.2f " + (mitjana >= 5.0 ? "APROVAT" : "SUSPÈS") + "\n", i++, mitjana);
		}
			
		sc.close();	
	}
}