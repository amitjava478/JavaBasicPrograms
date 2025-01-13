package com.latest;


import java.util.Scanner;

public class ReverseString1 {

    public static void main(String[] args) {


        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
  
      
        String reversed = "";
        
     
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Concatenate each character
        }
        
        // Output the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}

