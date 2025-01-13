package com.Dhruv;

public class ReverseTheStringWithWhileLoop {

    public static void main(String[] args) {
        String s = "Amit yadav";
        
        
        int left=0;
        int right = s.length() - 1;
        
        String reversed = "";
        
        while (left<=right) {
            reversed =  reversed+s.charAt(right);
            
            right--;
        }
        
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reversed);
    }
}
