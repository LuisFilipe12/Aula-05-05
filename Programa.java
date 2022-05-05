import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Calcular calcular;
		calcular = new Calcular();
		
		
		System.out.println("Entre com um número: ");
		calcular.numero1 = leia.nextInt();
		System.out.println("Entre com + ou /: ");
		calcular.operador = leia.next().charAt(0);
		
		System.out.println("Entre com mais um número: ");
		calcular.numero2 = leia.nextInt();
		
		System.out.println(calcular.Calculadora());
		
		
		leia.close();
	}

}
