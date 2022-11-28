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
     }
     
     public void addEventList(Evento e) {
    	 newEventList.add(e);
     }
     
     public void sizeEventList() {
    	 newEventList.size();
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
     
}
