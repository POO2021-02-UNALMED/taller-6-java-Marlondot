package vehiculos;

public class Vehiculo {
	private int placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	static int cantidadVehiculos;
	
	
	public Vehiculo(int placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,Fabricante fabricante) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.cantidadVehiculos+=1;
		Fabricante.addFabricanteAndPais(fabricante);
	}


	
	//
	//getting and setting
	//
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	//
	//methods
	//
	
	public static int getCantidadVehiculos() {
		return Vehiculo.cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {
		String string=String.format("Automoviles: %d\n"
				+ "Camionetas: %d\n"
				+ "Camiones: %d",
				Automovil.getCantidadAutomoviles(),
				Camioneta.getCantidadCamionetas(),
				Camion.getCantidadCamiones());
		return string;
	}
	
	

}