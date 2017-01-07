package com.mgd.magazine;

import com.mgd.observer.Observer;
import com.mgd.observer.Observable;

/**
  *@author: michael dunleavy
  *<h1>Subscriber</h1>
  *<p>Simulate a magazine subscriber, showing how to use
  *the custom Observer interface*/
public class Subscriber implements Observer, Display{
	private String name;
	private int age;

	public Subscriber(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void subscribe(Observable obs){
		obs.addObserver(this);
	}

	public void unsubscribe(Observable obs){
		obs.deleteObserver(this);
	}

	@Override 
	public void update(Observable obs, Object obj){
		if(obj instanceof MagInfo){
			MagInfo info = (MagInfo) obj;

			show(info);
		}
	}

	@Override
	public void show(MagInfo info){
		StringBuilder builder = new StringBuilder();
		builder.append("<-----------------SUBSCRIBER----------------->\n\n");
		builder.append("Name: " + name + "\n");
		builder.append("Age: " + age + "\n");
		builder.append("Issue No: " + info.getIssueNumber() + "\n");
		builder.append("Issue Price: " + info.getIssuePrice() + "\n");
		builder.append("\n==========================================\n");
		System.out.println(builder.toString());
	}
}
