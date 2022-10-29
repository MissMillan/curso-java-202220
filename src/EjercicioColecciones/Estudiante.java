package EjercicioColecciones;

import java.util.Set;

public class Estudiante {

	private String nombre;
	private String apellidos;
	private String dni;
	private Set<Asignatura> asignaturasArray;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Set<Asignatura> getAsignaturasArray() {
		return asignaturasArray;
	}
	public void setAsignaturasArray(Set<Asignatura> asignaturasArray) {
		this.asignaturasArray = asignaturasArray;
	}
	
	public Estudiante(String nombre, String apellidos, String dni, Set<Asignatura> asignaturasArray) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.asignaturasArray = asignaturasArray;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", asignaturasArray="
				+ asignaturasArray + "]";
	}
	
	
	
	
}
