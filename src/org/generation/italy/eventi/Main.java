package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	
	System.out.print("Titolo evento: ");
	String title = sc.nextLine();
	
	System.out.print("Data evento(anno-mese-giorno): ");
	String dateStr = sc.nextLine();
	LocalDate date = LocalDate.parse(dateStr);
	
	System.out.print("Numero posti totali: ");
	int totalSeats = sc.nextInt();
	
	System.out.println("----------------------------------------");
	
	try {
		Evento e = new Evento(title, date, totalSeats);
		System.out.println(e);
		
		System.out.println("----------------------------------------");
		
		System.out.print("Quante prenotazioni vuole effettuare? ");
		int reservedSeats = sc.nextInt();
		e.prenota(reservedSeats);
		System.out.println("Posti prenotati: " + e.getReservedSeats());
		System.out.println("Posti disponibili: " + e.getTotalSeats());
		
		System.out.println("----------------------------------------");
		
		System.out.print("Quante disdette vuole effettuare? ");
		int cancelSeats = sc.nextInt();
		e.disdici(cancelSeats);
		System.out.println("Posti prenotati: " + e.getReservedSeats());
		System.out.println("Posti disponibili: " + e.getTotalSeats());
		
	}catch (Exception e) {
		System.err.println(e.getMessage());
	}
		
	
}
}
