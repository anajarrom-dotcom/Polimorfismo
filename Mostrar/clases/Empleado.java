package Mostrar.clases;

public class Empleado {
	
private String nombre;

public Empleado(String nombre) {
	super();
	this.nombre = nombre;
}

public String resumen() {
	return " Empleado: " + nombre;
}
}
