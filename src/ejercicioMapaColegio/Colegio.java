package ejercicioMapaColegio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

import EjercicioColecciones.Asignatura;
import EjercicioColecciones.Estudiante;







public class Colegio {
	private String nombre;
	private String direccion;
	
	 List<Alumno> estudiantes1 = new ArrayList<>();
	 List<Alumno> estudiantes2 = new ArrayList<>();
	 Map<Colegio,List<Alumno>> mapa1 = new HashMap<Colegio,List <Alumno>>();
	 Set<Entry<Colegio, List<Alumno>>> entrySet = mapa1.entrySet();
	
	//-------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//-----------------------------------------------
	
	public Colegio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Colegio() {
		super();
	}
	@Override
	public String toString() {
		return "\nColegio [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	//-----------------------------------------------
	private void crearCole() {
		//List<Alumno> estudiantes1 = new ArrayList<>();

		//Alumno1 - Cole 1
		Alumno estudiante1 = new Alumno("pepe", "brbrbr", "1111111A");
		estudiantes1.add(estudiante1);
		
		//Alumno2 - Cole 1
		
		Alumno estudiante2 = new Alumno("Ramon", "Apellidos", "2222222B");
		estudiantes1.add(estudiante2);
		
		//Alumno3 - Cole 1
		
		Alumno estudiante3 = new Alumno("Maria", "Apellidos", "33333C");
		estudiantes1.add(estudiante3);
		
		Colegio colegio1 = new Colegio("Colegio 1"," Calle sin nombre");
		mapa1.put(colegio1,estudiantes1);
		
		//Alumno1 - Cole 2
		Alumno estudiante1Cole2 = new Alumno("jaime", "padilla", "55555A");
		estudiantes2.add(estudiante1Cole2);
		
		//Alumno2 - Cole 2
		
		Alumno estudiante2Cole2 = new Alumno("Beatriz", "Gomez", "8888888B");
		estudiantes2.add(estudiante2Cole2);
		
		//Alumno3 - Cole 2
		
		Alumno estudiante3Cole2 = new Alumno("Angel", "Lopez", "12345P");
		estudiantes2.add(estudiante3Cole2);
		Colegio colegio2 = new Colegio("Colegio 2"," Calle no me acuerdo");
		mapa1.put(colegio2,estudiantes2);
		
	}
	
	//------------------------------------------------------
	
	public static void main(String[] args) {
		
		Colegio InicioCole = new Colegio(); 
		InicioCole.crearCole();
		InicioCole.mostrarColegio();
		InicioCole.pedirDNI();
		
	}
	
	//--------------------------------------------------------
	private void mostrarColegio() {
		
		
		System.out.println("\n\tColegio ");
		System.out.println("\t===========");
		for (Entry<Colegio, List<Alumno>> entry : entrySet) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
			
		}
	}
	
	//--------------------------------------------------------
	private void pedirDNI() {
		Scanner sc = new Scanner(System.in);
		
        // entrada de una cadena
		int i =0;
        System.out.println("\n¿Escribe un DNI ? ");
        String dni = sc.nextLine();
        for (Colegio c : mapa1.keySet()) { {
    		List<Alumno> alumnos = mapa1.get(c);
    		for(i =0; i < alumnos.size(); i ++) {
        		if(alumnos.get(i).getDni().equals(dni))
        			System.out.println("El alumno pertenece al : " + c.getNombre()+ " ");
    		}

			
		}
	}
	
}
}
