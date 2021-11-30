package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidadAutomoviles;

	public Automovil(String placa, String nombre, int precio, int peso,Fabricante fabricante, int puestos) {
		super(placa, 4, 11, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.cantidadAutomoviles+=1;
	}

	//
	//getting and setting
	//
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	//
	//methods
	//
	
	public static int getCantidadAutomoviles() {
		return Automovil.cantidadAutomoviles;
	}
	
	

}
