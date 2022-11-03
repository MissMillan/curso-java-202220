package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import EjercicioColecciones.Asignatura;
import EjercicioColecciones.Estudiante;

public class ServicioFichero {
	
	//---------------------------------------------------------
    public String leerArchivo(String nombreArchivo){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombreArchivo);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
        	ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
            String linea;
            String nombre = null;
            String apellido = null;
            String dni = null;
            while ( (linea = reader.readLine()) != null){
             	     
                	String[] parts = linea.split("\\|");
                    for (int i = 0; i <parts.length; i++)    {     
                         System.out.println(parts[i]); 
                         nombre = parts[0];
                         apellido = parts[1];
                         dni = parts[2];
                    } 
            		
            	    Set<Asignatura> asignaturas = new HashSet<Asignatura>();
            	    String[] partsAsignaturas = linea.split("\\;");  
            	    for (int a = 0;a < partsAsignaturas.length; a++)    {     
                     
                        Asignatura asig = new Asignatura(partsAsignaturas[a]);
                       // System.out.println(partsAsignaturas[a]); 
                        asignaturas.add(asig);
                    } 
            	   
            		
            			for(int j =0; j < estudiantes.size(); j++) {
                			Estudiante e = new Estudiante(nombre,apellido, dni,asignaturas);
                			estudiantes.add(e);
                			System.out.println(e);
                			System.out.println("Los estudiantes en total son : " + estudiantes.get(j).getNombre());
                		}
            		
            
            		
            		
            		sb.append(linea).append("\n");
            		
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    //----------------------------------------------------------
}
