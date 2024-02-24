import java.util.Scanner;

public class Operacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacion operacion = new Operacion();
	        operacion.crearOperacion();
	    
	        System.out.println("La suma es: " + operacion.sumar());
	        System.out.println("La resta es: " + operacion.restar());
	        System.out.println("La multiplicación es: " + operacion.multiplicar());
	        System.out.println("La división es: " + operacion.dividir());
	    
 }
	
	private int numero1;
    private int numero2;
    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion(){
    	this.numero1=0;
    	this.numero2=0;
    }
	
	public int getNumero1() {
		return numero1;
	}
	
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public int getNumero2() {
		return numero2;
		}
	
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	 public void crearOperacion() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Ingrese el primer número:");
	     this.numero1 = scanner.nextInt();
	     System.out.println("Ingrese el segundo número:");
	     this.numero2 = scanner.nextInt();
	    }
	 
	 public int sumar() {
	     return numero1 + numero2;
	    }
	
	 public int restar() {
		 if (numero2 > numero1) {
			return numero2 - numero1;
		} else {
			return numero1 - numero2;
		}
	 	 	 
	 }
	 
	 public int multiplicar() {
		 if (numero1 == 0 || numero2 == 0) {
	            
			System.out.println("Error: No se puede multiplicar por cero.");
	        return 0;
	        }
	        
		 return numero1 * numero2;
	    }
	 
	 public double dividir() {
		 if (numero1 == 0 || numero2 == 0) {
			
			 System.out.println("Error. Recuerda que no se puede dividir por cero.");
	        return 0;
	        }
	        return (double) numero1 / numero2;
	    }
	 	 
	 
	}


