package movimientos;

public class Movimientos {
	private float saldoCuenta=0;
	private float cantidad;
	private String concepto;
	private int idMovimiento=0;
	private String getIdMovimiento;
	
	public Movimientos (float cantidad, String concepto) {
		this.saldoCuenta+=cantidad;
		this.concepto=concepto;
		this.idMovimiento++;
	}
	
	public float getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(float cantidad) {
		this.saldoCuenta += cantidad;
	}
	public float getCantidad() {
		return cantidad;
	}
	public String getConcepto() {
		return concepto;
	}
	public int getIdMovimiento() {
		return idMovimiento;
	}
	
	public static void main (String[] args) {
		Movimientos movimiento = new Movimientos(1200, "Nómina");
		System.out.println("El saldo de la cuenta es: "+movimiento.getSaldoCuenta()+" con id de Movimiento: "+movimiento.getIdMovimiento);
	}

	
	
	
	

}
