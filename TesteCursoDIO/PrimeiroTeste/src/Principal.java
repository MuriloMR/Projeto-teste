import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String funcionario = sc.next();
		int horaTrabalhada = sc.nextInt();
		int valorHora = sc.nextInt();

		System.out.println(funcionario + " Recebe: " + valorHora*horaTrabalhada);

		sc.close();

	}

}
