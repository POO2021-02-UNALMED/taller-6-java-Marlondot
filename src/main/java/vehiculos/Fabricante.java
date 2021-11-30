package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static List<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static List<Fabricante> getFabricantes() {
		return fabricantes;
	}
	public static void setFabricantes(List<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
	
	//
	//methods
	//
	public static void addFabricanteAndPais(Fabricante fabricante) {
		fabricantes.add(fabricante);
		Pais.addPais(fabricante.pais);
	}
	
	public static Fabricante fabricaMayorVentas() {
		List<Integer> cuenta = new ArrayList<Integer>();
		for(Fabricante fabrica: fabricantes) {
			int occ = Collections.frequency(fabricantes, fabrica);
			cuenta.add(occ);
		int maxim=Collections.max(cuenta);
		}
		return fabricantes.get(cuenta.indexOf(Collections.max(cuenta)));
	}
	

}
