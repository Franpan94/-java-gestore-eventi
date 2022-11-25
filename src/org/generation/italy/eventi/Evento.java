package org.generation.italy.eventi;

import java.time.LocalDate;

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
		return totalSeats;
	}

	public int getReservedSeats() {
		return reservedSeats;
	}
	
	public void prenota() throws Exception {
		if(date.isBefore(LocalDate.now()) || (totalSeats == 0)) {
			throw new Exception("Evento non disponibile");
		} 
		reservedSeats++;
	}
	
	public void disdici() throws Exception {
		if(date.isBefore(LocalDate.now()) || (reservedSeats == 0)) {
			throw new Exception("Evento non disponibile");
		} 
		reservedSeats--;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titolo evento: " + getTitle() + "\nData evento: " + getDate();
	}

}
