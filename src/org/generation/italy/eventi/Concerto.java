package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {
    LocalTime hour;
    BigDecimal price;
	
	public Concerto(String title, LocalDate date, int totalSeats, LocalTime hour, BigDecimal price) throws Exception {
		super(title, date, totalSeats);
		setHour(hour);
		setPrice(price);
	}

	public LocalTime getHour() {
		return hour;
	}

	public void setHour(LocalTime hour) throws Exception {
		if(hour.isBefore(LocalTime.now())) {
			throw new Exception("Ora non valida");
		}
		this.hour = hour;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) throws Exception {
		if(price.equals(BigDecimal.valueOf(0))) {
			throw new Exception("Il prezzo deve essere maggiore di 0");
		}
		this.price = price;
	}
	
	public String formatHour() {
		return hour.getHour() + ":" + hour.getMinute();
	}
	
	public String formatPrice() {
		return String.format("%.2f", getPrice());
	}
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Data: " + super.formatDate() + "\nOre: " + formatHour() + "\nTitolo: " +  super.getTitle() + "\nPrezzo: " +  formatPrice() + "€";
    }
}
