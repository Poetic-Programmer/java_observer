package com.mgd.magazine;

import com.mgd.observer.Observer;
import com.mgd.observer.Observable;

/**
  *@author: michael dunleavy
  *<h1>Magazine Customer</h1>
  */
public class Customer implements Observer, Display{
	private String name;
	private int age;

	public Customer(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public void update(Observable obs, Object obj){
		if(obs instanceof Magazine){
			Magazine mag = (Magazine) obs;

			show(mag.getIssueNumber(), mag.getIssuePrice());

			return;
		}
	}

	@Override
	public void show(int issueNumber, int issuePrice){
		StringBuilder builder = new StringBuilder();
		builder.append("<---------------Customer Info---------------->\n\n");
		builder.append("Name: " + name + "\n");
		builder.append("Age: " + age + "\n");
		builder.append("Issue Number: " + issueNumber + "\n");
		builder.append("Issue Price: " + issuePrice + "\n");
		System.out.println(builder.toString());
	}
}
		
