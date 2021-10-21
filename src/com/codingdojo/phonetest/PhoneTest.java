package com.codingdojo.phonetest;
import com.codingdojo.phone.*;

public class PhoneTest {
	public static void main (String args []) {
		Galaxy s9 = new Galaxy("s9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iphonex = new IPhone("X", 100, "AT&T", "Zing");
		
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphonex.displayInfo();
		System.out.println(iphonex.ring());
		System.out.println(iphonex.unlock());
		
	}
}
