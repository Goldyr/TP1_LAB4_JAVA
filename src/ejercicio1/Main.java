package ejercicio1;


public class Main {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado();
		System.out.println(emp1.toString());

		
		Empleado emp2 = new Empleado("Sergio", 20);
		System.out.println(emp2.toString());		
		Empleado.devuelveProximoID();
		
		
		Empleado emp3 = new Empleado("Enzo", 20);
		System.out.println(emp3.toString());		
		Empleado.devuelveProximoID();

	}

}
