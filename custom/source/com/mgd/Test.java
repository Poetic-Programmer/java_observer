package com.mgd;

import com.mgd.observer.*;
import com.mgd.magazine.*;

/**
  *@author: michael dunleavy
  *<h1>Test</h1>
  *<p>simulates 3 customers subscribing to a magazine, shows how the observer pattern
  *is used to notify the subscribers, unsubscribes a customer, updates the subscription
  */
public class Test{
	public static void main(String [] args){
		Magazine mag = new Magazine();
		Customer customerA = new Customer("Timmy", 21);
		Customer customerB = new Customer("Michael", 29);
		Customer customerC = new Customer("Halley", 23);

		mag.addObserver(customerA);
		mag.addObserver(customerB);
		mag.addObserver(customerC);

		mag.newIssue(1, 299);

		mag.deleteObserver(customerB);

		mag.newIssue(2, 350);
	}
}
