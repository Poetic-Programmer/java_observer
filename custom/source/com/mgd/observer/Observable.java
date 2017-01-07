package com.mgd.observer;

/**
  *@author: michael dunleavy
  *<h1>Observable Interface</h1>
  */

public interface Observable{
	void addObserver(Observer obs);
	void deleteObserver(Observer obs);
	void notifyObservers(Object obj);
	void notifyObservers();
	void setChanged();
}
