package co.bank.bbva.application.view;

import java.util.Scanner;


public class VistaConsola {

	private Scanner sc;
	
	
	public VistaConsola() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
	}
	
	public void print(String mensaje) {
		System.out.println(mensaje + "\n");
	
		
	}
	
	public String readText(String mensaje) {
		this.print(mensaje);
		String input = this.sc.nextLine();
		return input;
	}
	
	public int readNum(String mensaje) {
		this.print(mensaje);
		int input = this.sc.nextInt();
		return input;
	}
	
}
