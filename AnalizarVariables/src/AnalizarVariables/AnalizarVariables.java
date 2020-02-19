package AnalizarVariables;

public class AnalizarVariables {

	public static void main(String[] args) {
		int numero;
		System.out.print("Introduce un número: ");
		numero = Entrada.entero();
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = " + numero * i);

		}
	}
}
