package com.mgd.magazine;

import com.mgd.observer.Observable;

/**
  *@author: michael dunleavy
  *<h1>Magazine</h1>
  *<p>Simple magazine subscription service showing an 
  *   implementation of a simulation of the java
  *   observer pattern.
  */
public class Magazine extends Observable{
	private static final String NAME = "MY MAGAZINE";

	public Magazine(){
	}

	public void update(int price, int issueNumber){
		MagInfo info = new MagInfo(price, issueNumber);

		setChanged();
		notifyObservers(info);
	}
}


