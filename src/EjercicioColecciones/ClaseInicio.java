package EjercicioColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ClaseInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asignatura asig1 = new Asignatura("Matematicas",8.5);
		Asignatura asig2 = new Asignatura("Lengua",2.5);
		
				
		Asignatura asig4 = new Asignatura("Matematicas",4.5);
		Asignatura asig5 = new Asignatura("Geografia",4.5);
		
		Asignatura asig6 = new Asignatura("Matematicas",9);
		Asignatura asig7 = new Asignatura("Lengua",3);
		
		Asignatura asig8 = new Asignatura("Historia",5);
		Asignatura asig9 = new Asignatura("Matematicas",9);
		
		Asignatura asig10 = new Asignatura("Historia",7);
		Asignatura asig11 = new Asignatura("Quimica",6);
		
		Set<Asignatura> asignaturas1 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturas2 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturas3 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturas4 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturas5 = new HashSet<Asignatura>();
		
		Set <Estudiante> estudiantes = new  HashSet<Estudiante>();
		
		asignaturas1.add(asig1);
		asignaturas1.add(asig2);
		
		asignaturas2.add(asig4);
		asignaturas2.add(asig5);
		
		asignaturas3.add(asig6);
		asignaturas3.add(asig7);
		
		asignaturas4.add(asig8);
		asignaturas4.add(asig9);
		
		asignaturas5.add(asig10);
		asignaturas5.add(asig11);
		//añadimos las asignaturas
		/*for (String colorin : colores) {
			System.out.println(colorin);
		}*/
		
		Estudiante est1 = new Estudiante("Luis","Perez","111-A",asignaturas1);
		Estudiante est2 = new Estudiante("Ana","Pardo","222-B",asignaturas2);
		Estudiante est3 = new Estudiante("Jose","Mendez","333-C",asignaturas3);
		Estudiante est4= new Estudiante("Mario","Cantero","444-D",asignaturas4);
		Estudiante est5 = new Estudiante("Omar","Heredia","555-E",asignaturas5);
		

			estudiantes.add(est1);
			estudiantes.add(est2);
			estudiantes.add(est3);
			estudiantes.add(est4);
			estudiantes.add(est5);
			
		System.out.println("\n\t-------> Aumnos en general <------");
		for (Estudiante e : estudiantes) {
				System.out.println(e.getNombre()+ " :  "+ e.getAsignaturasArray());	
			
		}	
		

		
	
		ClaseInicio inicio = new ClaseInicio();
		inicio.alumnosCursadoMates(estudiantes);
		inicio.notaMediaAprobados(estudiantes);
		inicio.alumnosSuspendidos(estudiantes);
	}
	
	//------------------------------------------------
	public  void alumnosCursadoMates(Set<Estudiante> estudiantes) {
		System.out.println("\n\t-------> Alumnos que han cursado Mates <------");
		for (Estudiante e : estudiantes) {
			// System.out.println(e.getAsignaturasArray());

			for (Asignatura a : e.getAsignaturasArray()) {
				if (a.getNombre().equals("Matematicas")) {
					System.out.println(e.getNombre() + " " + e.getApellidos() + " " + a);
				}

			}

		}
	}
	
	//------------------------------------------------
	public void notaMediaAprobados(Set<Estudiante> estudiantes) {
		
		double notaAlumno =0;
		double suma =0;
		double media =0;
	    ArrayList<Estudiante> aprobados = new ArrayList<>();
	    Set<Asignatura> asignaturas = new HashSet<Asignatura>();
	    
	    
		System.out.println("\n-------> Nota media de alumnos <------");
		for (Estudiante e : estudiantes) {

			suma = 0;
			 System.out.println("\n======== Las notas de : " + e.getNombre()+ " ========");
			for (Asignatura a : e.getAsignaturasArray()) {
			   System.out.println(a.getNombre() + " " + a.getNota());
			   suma = suma + a.getNota();
			}
			media = suma/2;
			System.out.println(media);	
			

			if(media >= 5) {
				aprobados.add(e);
				System.out.println("El alumno : " + e.getNombre()+ " "+ media + " ----> ha aprobado");
			}else {
				System.out.println("El alumno : " + e.getNombre()+ " "+ media + " ----> no ha aprobado");
			}
	
			
		}
		//System.out.println(aprobados);
		System.out.println("\n========= Los estudiantes que aprobaron son : ========");
		for(int i = 0; i < aprobados.size(); i++) {
			System.out.println(aprobados.get(i).getNombre());
		}
		
			
	
			
		

	}
	
	//------------------------------------------------
	public void alumnosSuspendidos(Set<Estudiante> estudiantes) {
		

		
		
		System.out.println("==========Los estudiantes que han reprobado Lengua : =============");
		for (Estudiante e : estudiantes) {
			for (Asignatura a : e.getAsignaturasArray()) {
				if (a.getNombre().equals("Lengua")&& a.getNota() < 5) {
					
						estudiantes.remove(e);
					
				}

			}
		}

	
		//-------------------------------
		   Iterator<Estudiante> iter = estudiantes.iterator();
		   
	        // Displaying the values
	        // after iterating through the list
	        System.out.println("\nThe iterator values"
	                           + " of list are: ");
	        while (iter.hasNext()) {
	       
	        }
		 	
	}
	
}
