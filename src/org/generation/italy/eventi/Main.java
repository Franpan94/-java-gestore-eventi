package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	 //Milestone 1 e 2
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Titolo evento: ");
	String title = sc.nextLine();
	
	System.out.print("Data evento(anno-mese-giorno): ");
	String dateStr = sc.nextLine();
	LocalDate date = LocalDate.parse(dateStr);
	
	/*System.out.print("Numero posti totali: ");
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
		System.out.println("Posti disdetti: " + cancelSeats);
		System.out.println("Posti prenotati: " + e.getReservedSeats());
		System.out.println("Posti disponibili: " + e.getTotalSeats());
		
	}catch (Exception e) {
		System.err.println(e.getMessage());
	}
	
	System.out.println("----------------------------------------");*/
	
	   
	 //----- Milestone 3 -----
	 /*try {
		 Evento e1 = new Evento("Concerto di Cremonini", LocalDate.of(2023, 12, 5), 22);  
		 Evento e2 = new Evento("Concerto di Ligabue", LocalDate.of(2023, 2, 6 ), 25);
		 Evento e3 = new Evento("Concerto di Baglioni", LocalDate.of(2023, 2, 6), 80);
		 Evento e4 = new Evento("Concerto di Boomdabash", LocalDate.of(2023, 12, 5), 120);
		 Evento e5 = new Evento("Concerto di Alessandra Amoroso", LocalDate.of(2023, 8, 10), 34);
		   
		ProgrammaEventi pe = new ProgrammaEventi("Festivalbar");
		
		pe.addEventList(e1);
		pe.addEventList(e2);
		pe.addEventList(e3);
		pe.addEventList(e4);
		pe.addEventList(e5);
		System.out.println("Eventi programmati!");
		System.out.println(pe);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Eventi programmati per il 5 dicembre!");
		System.out.println(pe.returnEventForDate(LocalDate.of(2023, 12, 5)));
		
		System.out.println("----------------------------------------");
		
		System.out.println("Lista eventi svuotata!");
		pe.clearEvents();
		System.out.println(pe);
		
	 }catch (Exception e) {
		e.getMessage();
	}
	
	System.out.println("----------------------------------------");*/
	
	 
	//----- Milestone 4 -----
	System.out.print("Inserisci ora(ora:minuti): ");
	String hourStr = sc.nextLine();
	LocalTime hour = LocalTime.parse(hourStr);
	
	System.out.print("Inserisci prezzo: ");
	BigDecimal price = sc.nextBigDecimal();
	
	System.out.println("----------------------------------------");
	
	   try {
		   Concerto c = new Concerto(
				    title,  date, 100,
				    hour, price);
		   System.out.println("Il concerto si terrà in:");
		   System.out.println(c);
		   
	   }catch (Exception e) {
		System.err.println(e.getMessage());
	}
}
}
