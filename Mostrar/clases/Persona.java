package Mostrar.clases;

public class Persona {
	
private String nombre;

	public Persona(String nombre) {
	super();
	this.nombre = nombre;
}

	public void presentarse() {
		System.out.println("Hola, mi nombre es: " + nombre);
	}
}
