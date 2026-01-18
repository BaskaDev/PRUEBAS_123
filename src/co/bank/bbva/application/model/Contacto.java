package co.bank.bbva.application.model;

public class Contacto {
	
	private int id;
	private String nombre;
	private int numero;
	
	
	public Contacto(int id, String nombre, int numero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
	}
	
	
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
	public int getNumero() {
		return numero;
	}
	public void setNumbero(int numbero) {
		this.numero = numbero;
	}


	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", numero=" + numero + "]";
	}
	
	
	
	

}
