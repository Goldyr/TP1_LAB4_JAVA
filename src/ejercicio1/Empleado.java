package ejercicio1;

public class Empleado {
	
	private int id;
	private String nombre;
	private int edad;
	
	public Empleado() {
		this.setNombre("sin nombre");
		this.setEdad(99);
	}
	
	public Empleado(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	

}
