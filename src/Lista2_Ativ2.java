import javax.swing.JOptionPane;

public class Lista2_Ativ2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número para a Divisão "));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número para a Disivão "));
		
		int a = rec(n, m);
		JOptionPane.showMessageDialog(null, "O resto de " + n + " / "+ m + " é: " + a);

	}

	public static int rec(int n, int m) {
		if (n < m) {
			return n;
		} else {
			return  rec(n - m, m);
			
		}
	}
}
