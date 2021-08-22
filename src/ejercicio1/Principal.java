package ejercicio1;


public class Principal {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado();
		System.out.println(emp1.toString());

		Empleado emp2 = new Empleado("Facu", 20);
		System.out.println(emp2.toString());		
		Empleado.devuelveProximoID();
		
		Empleado emp3 = new Empleado("Facundo", 28);
		System.out.println(emp3.toString());		
		Empleado.devuelveProximoID();
		
		Empleado emp4 = new Empleado("Maty", 20);
		System.out.println(emp4.toString());		
		Empleado.devuelveProximoID();
		
		Empleado emp5 = new Empleado();
		System.out.println(emp5.toString());		
		Empleado.devuelveProximoID();

	}

}
