package Mostrar.clases;

public class TrabajadorPorHora extends Trabajador{

	private int horasTrabajadas;

	public TrabajadorPorHora(int horasTrabajadas) {
		
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public double calcularPago() {
		double pagoPorHoras = horasTrabajadas * 100;
		return pagoPorHoras;
	}
	
}
