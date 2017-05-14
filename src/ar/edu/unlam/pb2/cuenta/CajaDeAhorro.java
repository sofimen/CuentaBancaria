package ar.edu.unlam.pb2.cuenta;

public class CajaDeAhorro extends CuentaSueldo{
	//variables
	protected Double conteoExtraccion;
	protected Double costoAdicional = 6.0;
	
	
	//constructor
	public CajaDeAhorro(Double saldo){
		super(saldo);		
	}
	
	//metodos
	@Override
	public Double cuentaExtraer(Double extraccion){
		if (this.saldo>extraccion)
		{
			this.saldo = this.saldo - extraccion;
			this.conteoExtraccion++;
			return extraccion;
		}
		//No devuelvo nada
		else
		{
			return null; 
		}
	}
		
	public void costoAdicionalPorQuintaExtraccion(){
		if(conteoExtraccion>=5){
			this.saldo = this.saldo - costoAdicional; 
			this.conteoExtraccion = (double) 0;
		}
		
		
	}
	
}
