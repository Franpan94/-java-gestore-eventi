package org.generation.italy.eventi;

import java.awt.Event;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaEventi {
    String titleEvent;
    List<Evento> eventList;
    
    public ProgrammaEventi(String titleEvent) {
    	setTitleEvent(titleEvent);
    	eventList = new ArrayList<>();
    }

	public String getTitleEvent() {
		return titleEvent;
	}

	public void setTitleEvent(String titleEvent) {
		this.titleEvent = titleEvent;
	}

	public List<Evento> getEventList() {
		return eventList;
	}

	public void setEventList(List<Evento> eventList) {
		this.eventList = eventList;
	}
	
	public void addEventList(Evento event) {
		eventList.add(event);
	}
	
	public List<Evento> returnEventForDate(LocalDate date) {
		List<Evento> eventForDate = new ArrayList<>();
		for(Evento e : eventList) {
			if(e.getDate().equals(date)) {
				eventForDate.add(e);
			}
		}
		return eventForDate;
	}
	
	public int eventsInProgram(){
		return eventList.size();
	}
	
	public void clearEvents() {
		eventList.clear();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   "Nome programma eventi: " + getTitleEvent() + "\nLista eventi: " + getEventList()
		+ "\nNumero eventi presenti in lista: " + eventsInProgram();
	}
}
