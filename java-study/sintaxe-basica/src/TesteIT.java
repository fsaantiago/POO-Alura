
public class TesteIT {
	public static void main(String[] args) {

		double salario = 7300.0;

		if (salario < 1900.0) {
			System.out.println("Você não tem desconto de IR");
			
		} else if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota é de 7,5%");
			System.out.println("Você pode deduzir R$ 142");
			
		} else if (salario > 2800.0 && salario <= 3751.00) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir R$ 350");
			
		} else if (salario > 3751.0 && salario <= 4664.0) {
			System.out.println("A sua aliquota é de 22,5%");
			System.out.println("Você pode deduzir R$ 636");
		} else {
			System.out.println("A sua aliquota é de 27,5%");
			System.out.println("Você pode deduzir R$ 776");
		}
	}
}
