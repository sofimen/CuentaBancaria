package ar.edu.unlam.pb2.cuenta;

public class CuentaCorriente extends CajaDeAhorro{
	private Double descubierto;


	//constructor
 	public CuentaCorriente(Double saldo) 
 	    {
 		super(saldo);
 		}

 	
   	//metodos
 	
 	public void cuentaDepositar(Double deposito){
 		if(saldo>0)
 		{
		this.saldo = this.saldo + deposito;
 		}
 		else
 		{
 		this.saldo=this.saldo+deposito-(5*descubierto)/100;
 		this.descubierto= (double) 0;
 		}
 		
	}
	
	
 	public Double cuentaExtraer(Double extraccion){
		if (this.saldo>extraccion)
		{
			this.saldo = this.saldo - extraccion;
			this.conteoExtraccion++;
			return extraccion;
		}
		//Devuelvo con recargo
		else
		{
			this.saldo = this.saldo - extraccion;
			this.descubierto = this.saldo *(-1);
			this.conteoExtraccion++;
			return extraccion;
		}
	}
 	}
	

	