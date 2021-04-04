package ejercicio1;

public class Empleado {
	
	//Attributes
	
    private int id;
    private String nombre;
    private int edad;
    
    private static int numeroEmpleado = 999;
    
    public Empleado() {
    	numeroEmpleado++;
    	this.id = numeroEmpleado;
    	this.nombre = "sin nombre";
    	this.edad = 99;
    }
    
    public Empleado(String nombre, int edad) {
    	numeroEmpleado++;
    	this.id = numeroEmpleado;
    	this.nombre = nombre;
    	this.edad = edad;
    }
    
    //Getters and Setters
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	@Override
	public String toString() {
		return "Empleado ID " + id + ", se llama " + nombre + " y tiene " + edad + " años de edad" ;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static int devuelveProximoID() {
		return numeroEmpleado + 1;
	}
}
