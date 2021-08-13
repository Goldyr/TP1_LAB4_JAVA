package ejercicio1;


public class Main {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado();
		System.out.println(emp1.getId()+ " " + emp1.getNombre() + " "+ emp1.getEdad());
		
		
		Empleado emp2 = new Empleado("nombre", 300);
		System.out.println(emp2.getId() + " " + emp2.getNombre() + " " +emp2.getEdad());

	}

}
