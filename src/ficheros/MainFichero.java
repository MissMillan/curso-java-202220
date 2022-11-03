package ficheros;



public class MainFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreArchivo = "./recursos/alumnos.txt";;
        ServicioFichero servicio = new  ServicioFichero();

        
        System.out.println(servicio.leerArchivo(nombreArchivo));

	}

}
