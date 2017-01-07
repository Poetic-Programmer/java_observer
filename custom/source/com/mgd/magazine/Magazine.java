package com.mgd.magazine;

import java.util.List;
import java.util.ArrayList;
import com.mgd.observer.Observable;
import com.mgd.observer.Observer;

/**
  *@author: michael dunleavy
  *<h1>Magazine Observable</h1>
  */
public class Magazine implements Observable{
	private List<Observer> list; // store customers

	private int issueNumber;
	private int issuePrice;

	private boolean changed; 

	public Magazine(){
		list = new ArrayList<>();
	}

	public void newIssue(int issueNumber, int issuePrice){
		this.issueNumber = issueNumber;
		this.issuePrice = issuePrice;

		// use 'pull' method of observer communication
		setChanged();
		notifyObservers();
	}

	public int getIssueNumber() { return issueNumber; }
	public int getIssuePrice() { return issuePrice; }

	@Override
	public void notifyObservers(){
		notifyObservers(null);
	}

	@Override
	public void notifyObservers(Object obj){
		if (changed){
			for(Observer o : list){
				o.update(this, obj);
			}
			changed = false;
		}
	}
	@Override 
	public void addObserver(Observer obs){
		list.add(obs);
	}

	@Override
	public void deleteObserver(Observer obs){
		list.remove(obs);
	}

	@Override
	public void setChanged(){
		changed = true;
	}
}
