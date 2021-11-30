package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int cantidadCamiones;

	public Camion(int placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.cantidadCamiones+=1;
	}

	
	//
	//getting and setting
	//
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	//
	//methods
	//
	public static int getCantidadCamiones() {
		return Camion.cantidadCamiones;
	}
	
	

}
