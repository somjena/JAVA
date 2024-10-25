package com.inheritance.Overriding;

import java.util.Scanner;

class  Payment{
	public void processPayment(double d) {
		System.out.println("Processing Amount Of "+d);
	}
}
class CreditCard extends Payment{
	@Override
	public void processPayment(double d) {
		System.out.println("Payment initialization of "+ d);
		int otp = (int) (Math.random() * 10000) + 1;
		System.out.println(otp);
		System.out.println("Verifying Card Details");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The OTP");
		int validate = sc.nextInt();
		if(otp==validate) {
			System.out.println(otp +" OTP VERIFIED BY BANK");
			System.out.println("Payment of Rupees "+d+" SuccessFul");
		}else {
			System.out.println("Wrong Otp Entered");
		}
		
	}
}
class DebitCard extends Payment{
	@Override
	public void processPayment(double d) {
		System.out.println("Payment initialization of "+ d);
		int otp = (int) (Math.random() * 10000) + 1;
		System.out.println(otp);
		System.out.println("Verifying Card Details");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The OTP");
		int validate = sc.nextInt();
		if(otp==validate) {
			System.out.println(otp +" OTP VERIFIED BY BANK");
			System.out.println("Payment of Rupees "+d+" SuccessFul");
		}
		
	}
}
class DigitalPayment extends Payment{
	public void processPayment(double d) {
		System.out.println("Payment initialization of "+ d);
		int otp = (int) (Math.random() * 10000) + 1;
		System.out.println(otp);
		System.out.println("Verifying Card Details");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The OTP");
		int validate = sc.nextInt();
		if(otp==validate) {
			System.out.println(otp +" OTP VERIFIED BY BANK");
			System.out.println("Payment of Rupees "+d+" SuccessFul");
		}else {
			}
		}
		
	

	
	}
public class PaymentHolder {

	public static void main(String[] args) {
		CreditCard np= new CreditCard();
		np.processPayment(500);
		DebitCard d1 = new DebitCard();
		d1.processPayment(600.45);
		DigitalPayment dt= new DigitalPayment();
		dt.processPayment(200);
		
		

	}

}
