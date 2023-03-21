package Practica2;

public class Autor extends Libro{
	String nombre;
	String libro;
	int edad;
	 Libro  a = new Libro(libro, libro);

	public Autor(){	}
	
	public Autor(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;	
		super
		}

	public String getNombre() {
		return nombre;	}

	public void setNombre(String nombre) {
		this.nombre = nombre;	}

	public int getEdad() {
		return edad;	}

	public void setEdad(int edad) {
		this.edad = edad;	}
	
	public String getLibro() {
		return libro;	}
	
	public void setLibro()	{
		this.libro = libro;	}

	public String toString() {
		return "Autor [nombre=" + nombre + ", edad=" + edad + "]";	}
	
	
}
