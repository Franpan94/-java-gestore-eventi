package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
     private String title;
     private LocalDate date;
     private int totalSeats;
     private int reservedSeats = 0;
     
     public Evento(String title, LocalDate date, int totalSeats) throws Exception{
    	 setTitle(title);
    	 setDate(date);
    	 if(totalSeats < 0) {
    		 throw new Exception("Inserisci un numero positivo");
    	 }
    	 this.totalSeats = totalSeats;
     }

	public String getTitle() {
		return title;
	}
    public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}
    public void setDate(LocalDate date) throws Exception {
    	if(!date.isBefore(LocalDate.now())) {
    		this.date = date;
    	} else {
    		throw new Exception("Data non valida"); 
    	}
    }

	public int getTotalSeats() {
		return totalSeats - reservedSeats;
	}

	public int getReservedSeats() {
		return reservedSeats;
	}
	
	public void prenota(int count) throws Exception {
		if(((count > totalSeats) || (count <= 0)) || date.isBefore(LocalDate.now())) {
			throw new Exception("Evento non disponibile");
		} 
		reservedSeats += count;
	}
	
	public void disdici(int count) throws Exception {
		if(((count <= 0) || (count > reservedSeats)) || date.isBefore(LocalDate.now())) {
			throw new Exception("Evento non disponibile");
		} 
		reservedSeats -= count;
	}
	
	public String formatDate() {
		return date.getDayOfMonth() + "/" + date.getMonth() + "/" + date.getYear();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nTitolo: " + getTitle() + "\nData: " + formatDate() 
		+ "\nPosti disponibili: " + getTotalSeats();
	}

}
