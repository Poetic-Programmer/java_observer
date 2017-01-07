package com.mgd.observer;

import java.util.List;
import java.util.ArrayList;

public abstract class Observable{
	private List<Observer> list;
	private boolean changed;

	protected Observable(){
		list = new ArrayList<>();
	}

	public void addObserver(Observer obs){
		list.add(obs);
	}

	public void deleteObserver(Observer obs){
		list.remove(obs);
	}

	public void setChanged(){
		changed = true;
	}

	protected void notifyObservers(){
		notifyObservers(null);
	}

	protected void notifyObservers(Object object){
		if(changed){
			for(Observer o : list){
				o.update(this, object);
			}
			changed = false;
		}
	}
}
