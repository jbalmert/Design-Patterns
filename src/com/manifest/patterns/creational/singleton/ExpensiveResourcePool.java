package com.manifest.patterns.creational.singleton;

public class ExpensiveResourcePool {

	//This is an overly simplistic example.  What happens when the resource pool has dependencies?
	private static ExpensiveResourcePool pool = new ExpensiveResourcePool();
	
	//public accessor to get an instance of the same object.
	public static ExpensiveResourcePool getInstance() {
		return pool;
	}
	
	//private constructor to control how many instances are created.
	private ExpensiveResourcePool() {
	}
}
