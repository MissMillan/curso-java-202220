package ejercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("nombre 1","apellidos 1","111A");
		Cliente cliente2 = new Cliente("nombre 2","apellidos 2","222A");
		Cliente cliente3 = new Cliente("nombre 3","apellidos 3","333A");
		Cliente cliente4 = new Cliente("nombre 4","apellidos 4","444A");

		
		cliente1.comprar(100);
		cliente1.comprar(10);
		
		cliente2.comprar(120);
		
		cliente3.comprar(70);
		
		cliente4.comprar(40);
		
		Cliente[] clientes = {cliente1,cliente2,cliente3,cliente4};
		
		 for (int i=0;i<clientes.length;i++){
	            //Mostramos la direccion del objeto
	            System.out.println("este es el cliente : "+ (i+1)+ clientes[i]);
	           
	        }
		 
		 //--------------------------------------
		 System.out.println("\n");
		 for(Cliente cliente : clientes) {
			 System.out.println(cliente.getNombre());
		 }
		 
		 totalClientes(clientes);
		 
		 
	}
	
	//Estatic estara crerado siempre en la meoria nunca va a desaparecer
	
	//Lo que creamos de manera dinamica son nuestros objetos
    static void totalClientes(Cliente [] clients) {
		 double totalImporte =0.0;
		 for(Cliente cliente : clients) {
			 totalImporte += cliente.getImporteCompre();
		 }
		 
		 System.out.println("El total de la compra de todos los clientes es : "+ totalImporte);
	 }
}
