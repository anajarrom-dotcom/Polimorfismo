package Mostrar.clases;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public void mostrarDescripccion() {
		System.out.println("Producto: " + nombre + "  precio: " + precio);
	}
	
}
