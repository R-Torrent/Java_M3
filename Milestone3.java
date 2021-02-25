import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Milestone3 { // Fibonacci
	public static void main(String args[]) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un n�mero N > 1",
			"Fibonacci(N)", JOptionPane.QUESTION_MESSAGE));
		
		ArrayList<Integer> fib = new ArrayList<>();
		fib.add(0); fib.add(1);
		for(int m = 2; fib.size() < n; m++)
			fib.add(fib.get(m-1) + fib.get(m-2));
		
		String fib_string = "";		
		for (Integer m : fib )
			fib_string += m + " ";
		
		// Mantener N relativamente bajo; la salida no est� formateada adecuadamente
		JOptionPane.showMessageDialog(null, fib_string, "Fibonnacci(N)", JOptionPane.INFORMATION_MESSAGE);
	}
}