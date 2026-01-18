package co.bank.bbva.application.model.dto;

public class ContactoDTO {
	private int id;
	private String nombre;
	private int numero;

	//data mapper
	
	public ContactoDTO() {
		// TODO Auto-generated constructor stub
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

	
}
