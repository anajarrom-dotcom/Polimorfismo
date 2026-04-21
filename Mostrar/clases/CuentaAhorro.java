package Mostrar.clases;

public class CuentaAhorro extends Cuentaa{

	public CuentaAhorro(double saldo) {
		super(saldo);	
	}
@Override
public double depositar(double monto) {
	return saldo = saldo + (monto * 0.6);
}
}

