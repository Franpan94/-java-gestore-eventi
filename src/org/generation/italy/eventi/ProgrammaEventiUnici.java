package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgrammaEventiUnici {
     Set<Evento> newEventList;
     String title;
     
     public ProgrammaEventiUnici(String title) {
    	 newEventList = new HashSet<>();
    	 setTitle(title);
     }
     
     public void addEventList(Evento e) {
    	 newEventList.add(e);
     }
     
     public int programEventList() {
    	 return newEventList.size();
     }
     
     public void clearEventList() {
    	 newEventList.clear();
     }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Evento> getNewEventList() {
		return newEventList;
	}

	public void setNewEventList(Set<Evento> newEventList) {
		this.newEventList = newEventList;
	}
	
	public List<Evento> getEventforDateAndTitle(LocalDate date, String title) {
		List<Evento> listEventDateAndTitle = new ArrayList<>();
		for(Evento e : newEventList) {
			if((e.getDate().equals(date)) && (e.getTitle().equals(title))){
				listEventDateAndTitle.add(e);
			}
		}
		return listEventDateAndTitle;
	}
	
	public Evento getMaxSeatsTotalEvent() {
		int maxValue = Integer.MIN_VALUE;
		Evento maxEvent = null;
		for(Evento e : newEventList) {
			if(maxValue < e.getTotalSeats()) {
				maxValue = e.getTotalSeats();
				maxEvent = e;	
			}
		}
		return maxEvent;
	}
	
	public Evento getMinSeatsTotalEvent() {
		int minValue = Integer.MAX_VALUE;
		Evento minEvent = null;
		for(Evento e : newEventList) {
			if(minValue > e.getTotalSeats()) {
				minValue = e.getTotalSeats();
				minEvent = e;	
			}
		}
		return minEvent;
	}
	
	public Evento getFirstEventForDate() {
		LocalDate firstDate = LocalDate.MAX;
		Evento firstEvent = null;
		for(Evento e : newEventList) {
			if(firstDate.isAfter(e.getDate())) {
				firstDate = e.getDate();
				firstEvent = e;
			}
		}
		return firstEvent;
	}
	
	public Evento getLastEventForDate() {
		LocalDate lastDate = LocalDate.MIN;
		Evento lastEvent = null;
		for(Evento e : newEventList) {
			if(lastDate.isBefore(e.getDate())) {
				lastDate = e.getDate();
				lastEvent = e;
			}
		}
		return lastEvent;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome programma eventi: " + getTitle() + "\nLista eventi: " + getNewEventList()
		+ "\nNumero eventi presenti in lista: " + programEventList();
	}
     
}
