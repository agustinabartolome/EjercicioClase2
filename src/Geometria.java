import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo circulo = new Circulo();
		
		Rectangulo rectangulo = new Rectangulo();
	
		
		System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
		
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

	}
	
	
	
	public interface calculosFormas {
		double valorPI = 3.141593;
		
		double calcularArea ();
		double calcularPerimetro() ;
	}
	
	
	
	public static class Circulo implements calculosFormas{
		
		private double valorRadio;
		
		 public Circulo() {
				Scanner scanner = new Scanner(System.in);
	            System.out.println("Ingrese el valor del radio:");
	            this.valorRadio = scanner.nextDouble();
	        }
	     
		@Override
		public double calcularArea() {
			// TODO Auto-generated method stub
						
		     return valorPI * (valorRadio * valorRadio);
		}

		@Override
		public double calcularPerimetro() {
			// TODO Auto-generated method stub
			return 2 * valorPI * valorRadio;
		}		
		
}
	
	public static class Rectangulo implements calculosFormas{
		
		private double valorBase;
		private double valorAltura;
		
		public Rectangulo() {
			Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el valor de la base:");
            this.valorBase = scanner.nextDouble();

            System.out.println("Ingrese el valor de la altura:");
            this.valorAltura = scanner.nextDouble();
        }

		@Override
		public double calcularArea() {
			// TODO Auto-generated method stub
			return valorBase * valorAltura;
		}

		@Override
		public double calcularPerimetro() {
			// TODO Auto-generated method stub
			return (valorBase * valorAltura)/2;
		}
		
		
		
	}
	
}

