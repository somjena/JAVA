package com.overloading;
class CustomerSupport{
	void HandleRequest(String query) {// Handle Request Method 1
		 System.out.println("Handling a general query: " + query);
	}
	void HandleRequest(String query,int orderId) {// Overload  Method 2
		System.out.println("Processing return for order: " + orderId + ". Query: " + query);
		
	}
	void HandleRequest(String query,String product,String issue) {// Overload Method 3
		 System.out.println("Providing tech support for: " + product + ". Issue: " + issue);
	}
}
public class Main {

	public static void main(String[] args) {
		CustomerSupport c1 = new CustomerSupport();
		 c1.HandleRequest("What are the working hours?");
		 c1.HandleRequest("I'd like to return a product", 12345);
		 c1.HandleRequest("Device not turning on", "Smartphone", "Battery issue");

	}

}
