import java.util.Scanner;

public class Cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cuenta = new Cuenta ();
		cuenta.crearCuenta ();
	}
	
		
	
	
	private int numeroCuenta;
	private int numeroDocumento;
	private double saldo;
	
	private double ingreso;
	
	
	public Cuenta (int numeroCuenta, int numeroDocumento, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.numeroDocumento = numeroDocumento;
		this.saldo = saldo;
	}

	public Cuenta() {
		this.numeroCuenta = 0000000000001;
		this.numeroDocumento = 100000000;
		this.saldo = 0.00;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public int getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}

	public void crearCuenta() {
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Por favor ingrese su número de cuenta:");
		this.numeroCuenta = scanner.nextInt();
		System.out.println("Por favor ingrese su número de documento:");
		this.numeroDocumento = scanner.nextInt();
		System.out.println("El saldo actual de su cuenta es: ");
		this.saldo = scanner.nextDouble();
	}
	
	public double ingresar(double ingreso) {
		return  saldo + ingreso;
		
	}
	
	public void retirar (double retiro) {
		if (retiro < saldo || retiro == saldo) {
			return;
		}else {
			System.out.println("No hay suficiente saldo para realizar esta operación");
			System.out.println("Su saldo actual es de $ " + saldo);
		}
		
	}

	public void extraccionRapida() {
		
		double extraccion = saldo * 0.2;
		
		return;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	

	public void consultarDatos() {
		System.out.println("El numero de su cuenta bancaria es: " + numeroCuenta);
		System.out.println("Su DNI es: " + numeroDocumento);
		System.out.println("El saldo disponible en su cuenta bancaria es: " + saldo);
	}


}
