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
@Table(name = "delegates")
public class Delegate {

	@Id
	@GeneratedValue
	private int delegateId;
	private String delegateName;
	
	private Set<Event> event=new HashSet<Event>();
	
	
    public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getDelegateName() {
		return delegateName;
	}
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}
	@ManyToMany
	@JoinTable(name = "Join-Event-Delegate",joinColumns = {@JoinColumn(name="delegateId")},
	inverseJoinColumns = {@JoinColumn(name="eventId")})
	public Set<Event> getEvent() {
		return event;
	}
	public void setEvent(Set<Event> event) {
		this.event = event;
	}
}
