package Colecciones;

import java.util.ArrayList;

import ejercicioManiquies.Boton;

public class ListasJava {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista1 = new ArrayList<String>();
		
		lista1.add("hola");
		//lista1.add(1);//
		//lista1.add(new Boton(" "," "));
		lista1.add("que");
		lista1.add("tal");
		
		//en el arraylist puedes agregar una pocision donde quieras.
		lista1.add(1, "Hoy es viernes por fin");
		lista1.set(0,"esto sustituido");
		for(String texto:lista1) {
			System.out.println(texto);
		}
		System.out.println(lista1.isEmpty());
		System.out.println(lista1.contains("como"));
		System.out.println(lista1.get(2));
		//con esto puedo sustituir
		System.out.println("hola");
		
		
	}
}
