package co.bank.bbva.application.controller;

import co.bank.bbva.application.model.Contacto;
import co.bank.bbva.application.model.dao.ContactoDAO;
import co.bank.bbva.application.model.dto.ContactoDTO;
import co.bank.bbva.application.view.VistaConsola;

public class Controller {

	private VistaConsola vc;
	private ContactoDAO cdao;
	
	public Controller() {
		// TODO Auto-generated constructor stub
		
		this.vc = new VistaConsola();
		cdao = new ContactoDAO();
		this.vc.print("BIENVENIDO AL SISTEMA DE CONTACOS");
	    String nombre =	this.vc.readText("Ingrese su nombre:");	
	    String numero =	this.vc.readText("Ingrese su numero:");	
	    int x = Integer.parseInt(numero);
	    
	   
	    
	  Contacto c = new Contacto(1, nombre , x);
	  ContactoDTO cdto = new ContactoDTO();
	    
	    cdto.setId(1);
	    cdto.setNombre(nombre);
	    cdto.setNumbero(x);
	    
	    
	    
	if( this.cdao.add(c)) {
		for (Contacto con :this.cdao.readAll()) {
			this.vc.print(con.toString());
		}
		 
		}else {
			System.out.println("ERROR 404 , 405 ");
		}
	
	}
	
		
	
	
}
