package ejercicios;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String dni;
	private double importeCompre=0;
	
	
	
	
	
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





	public double getImporteCompre() {
		return importeCompre;
	}





	public void setImporteCompre(double importeCompre) {
		this.importeCompre = importeCompre;
	}



//------------------------------------------------------------
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	
	}
	
		public Cliente() {
			super();
		}





//---------------------------------------------------------------------------
	void comprar(double valorCompra) {
		
		this.importeCompre += valorCompra;
		
	}





	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", importeCompre="
				+ importeCompre + "]";
	}






}
