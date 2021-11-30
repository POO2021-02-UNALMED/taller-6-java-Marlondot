package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int cantidadCamionetas;

	public Camioneta(int placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.cantidadCamionetas+=1;
	}

	
	//
	//getting and setting
	//
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	//
	//methods
	//
	
	public static int getCantidadCamionetas() {
		return Camioneta.cantidadCamionetas;
	}
	

}
