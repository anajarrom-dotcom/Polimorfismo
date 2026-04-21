package Mostrar.clases;

public class Estudiante extends  Persona{

	private String carnet;
	private String carrera;
	
	public Estudiante(String nombre, String carnet, String carrera) {
		super(nombre);
		this.carnet = carnet;
		this.carrera = carrera;
	}
	
	@Override
	public void presentarse() {
		super.presentarse();
		System.out.println(  " mi Carnet: " + carnet + " y estudio: " + carrera);
	}
}
