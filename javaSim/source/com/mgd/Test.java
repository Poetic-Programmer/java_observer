package com.mgd;

import com.mgd.magazine.*;
import com.mgd.observer.*;

public class Test{
	public static void main(String [] args){
		Magazine mag = new Magazine();

		Subscriber subA = new Subscriber("Michael", 30);
		Subscriber subB = new Subscriber("Halley", 23);
		Subscriber subC = new Subscriber("Samuel", 5);
		Subscriber subD = new Subscriber("Joseph", 3);

		subA.subscribe(mag);
		subB.subscribe(mag);
		subC.subscribe(mag);
		subD.subscribe(mag);

		mag.update(1, 399);
		
		subC.unsubscribe(mag);
		subD.unsubscribe(mag);

		mag.update(2, 450);

		mag.update(3, 450);
	}
}
