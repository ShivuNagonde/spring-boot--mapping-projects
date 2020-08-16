package com.shiv.Springbootmanytomanymapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

	@Id
	@GeneratedValue
	private int eventId;
	private String eventName;
	
    private Set<Delegate> delegates = new HashSet<Delegate>();
	
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	@ManyToMany
	@JoinTable(name = "Join-Event-Delegate",joinColumns = {@JoinColumn(name="eventId")},
	inverseJoinColumns = {@JoinColumn(name="delegateId")})
	public Set<Delegate> getDelegates() {
		return delegates;
	}

	public void setDelegates(Set<Delegate> delegates) {
		this.delegates = delegates;
	}

}
