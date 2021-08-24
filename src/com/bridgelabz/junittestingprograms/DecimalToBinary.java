package com.bridgelabz.junittestingprograms;

public class DecimalToBinary {
	static void toBinary(int n)
    {
        // array to store binary number
		StringBuilder sb = new StringBuilder();
		System.out.println("Decimal: "+n);
        // counter for binary array
        int i = n;
        while (n > 0) 
        {
            // storing remainder in binary array
            sb.append(Integer.toString(n % 2));
            n = n / 2;
            i--;
        }
   
        // printing binary array in reverse order
            System.out.println("Binary(4-byte): "+String.format("%32s",sb.reverse()).replace(" ", "0"));
    }
public static void main(String[] args) {
	toBinary(100);
}
}
