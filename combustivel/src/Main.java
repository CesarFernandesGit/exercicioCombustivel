import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int contagemAlcool = 0;
		int contagemGasolina = 0;
		int contagemDiesel = 0;

		while (true) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			int codigo = scanner.nextInt();

			if (codigo == 1) {
				contagemAlcool += 1;
			} else if (codigo == 2) {
				contagemGasolina += 1;
			} else if (codigo == 3) {
				contagemDiesel += 1;
			} else if (codigo == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + contagemAlcool);
				System.out.println("Gasolina: " + contagemGasolina);
				System.out.println("Diesel: " + contagemDiesel);
				break;
			}

		}
		
		scanner.close();
	}

}
