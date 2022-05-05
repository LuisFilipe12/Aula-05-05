
public class Calcular {

	public int numero1;
	public int numero2;
	public char operador;
	

	public double Soma() {
	return numero1 + numero2;
	}
	public double Divisao() {
		return numero1 / numero2;
	}
	public String Calculadora() {
		if(operador == '+') {
			return ""+(numero1 + numero2);
			
		}else if(operador == '/') {
			return ""+Divisao();
			
		}else {
			return "Errado";
		}
	}
}
