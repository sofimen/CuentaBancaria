package ar.edu.unlam.pb2.cuenta;

public class CuentaSueldo {
	//variables
	protected Double saldo;
	protected Double extraccion;
	
	//constructor
	public CuentaSueldo(Double saldo){
		this.saldo=saldo;
	}
	
	//metodos
	
	//deposito
	public void cuentaDepositar(Double deposito){
		this.saldo = this.saldo + deposito;
	}
	
	//extraccion
	public Double cuentaExtraer(Double extraccion){
		if (this.saldo>extraccion)
		{
			this.saldo = this.saldo - extraccion;
			return extraccion;
		}
		//No devuelvo nada
		else
		{
			return null; 
		}
	}
	
	//muestra el saldo que tengo disponible
	public Double getSaldo(){
     return this.saldo;
}
}
