package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
	private String nombre;
	private static List<Pais> paises = new ArrayList<Pais>();
	
	
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static List<Pais> getPaises() {
		return paises;
	}
	public static void setPaises(List<Pais> paises) {
		Pais.paises = paises;
	}
	
	//
	//methods
	//
	public static void addPais(Pais pais) {
		paises.add(pais);
	}
	
	public static Pais paisMasVendedor() {
		List<Integer> cuenta = new ArrayList<Integer>();
		for(Pais pais:paises) {
			int occ = Collections.frequency(paises, pais);
			cuenta.add(occ);
		int maxim=Collections.max(cuenta);
		}
		return paises.get(cuenta.indexOf(Collections.max(cuenta)));
	}

}
