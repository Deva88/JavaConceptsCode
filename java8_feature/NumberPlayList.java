package com.java8_feature;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.*;

public class NumberPlayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create simple collection
		List<Integer> myNumberList=new ArrayList<Integer>();
		for(int i=0; i<5; i++) myNumberList.add(i);

		//Method 1: traversion using Iterator
		Iterator<Integer> it =myNumberList.iterator();
		while(it.hasNext()) {
			Integer i= it.next();
			System.out.println("Mth1: Iterator value :" +i);
		}

		//Method 2: Traversing with Explicit Consumer interface implementation
		class MyConsumer implements Consumer<Integer>{
			public void accepts(Integer t) { 
				System.out.println("Mth2 consumer impl value :" +t);
			}
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
			}
		}
		MyConsumer action =new MyConsumer();
		myNumberList.forEach(action);

		//Method 3: Traversing with Anonymous consumer interface implementation
		myNumberList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Mth3: forEach anonymous class value :" +t);
			}
		});

		//Mthod 4 : Lambda Funtion (Explicit)
		Consumer<Integer> myListAction= n->{
			System.out.println("Mth4: forEach lambda impl value :" +n);
		};
		myNumberList.forEach(myListAction);

		//Method 5: Lambda Function (implicit)
		myNumberList.forEach(n-> {
			System.out.println("Mth5: forEach lambda value :" +n);
		});

		//Method 6: lambda function to print double value (function is also functional interface)
		Function<Integer, Double> toDoubleFunction =Integer::doubleValue;
		myNumberList.forEach(n-> {
			System.out.println("Mth6: forEach Lambda double value :" +toDoubleFunction.apply(n));
		});
	}	
}