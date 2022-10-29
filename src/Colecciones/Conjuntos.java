package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> colores = new HashSet<>();
		
		colores.add("amarillo");
		colores.add("azul");
		colores.add("amarillo");//no se pueden meter duplicados
		System.out.println(colores);
	}

}
