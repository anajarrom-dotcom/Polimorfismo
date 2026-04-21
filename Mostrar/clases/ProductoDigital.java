package Mostrar.clases;

public class ProductoDigital extends Producto{

	public ProductoDigital(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void mostrarDescripccion() {
		super.mostrarDescripccion();
		System.out.println("Un añejo de lujo con mas de tres años de maduracion.");
	}
	
}
