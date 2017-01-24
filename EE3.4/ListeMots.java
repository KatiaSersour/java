package tp1Java;

import java.util.Scanner;


public class ListeMots {
	private static Scanner sc;

public static void main(String[] args) {
       char caractere;       
       boolean test;  
       System.out.println("saisir une phrase.");
       sc = new Scanner(System.in);
       String str = sc.nextLine();
       test = true;
       int i;
       for ( i = 0;  i < str.length();  i++ ) {
    	   caractere = str.charAt(i);
          if ( Character.isLetter(caractere) ) {
             System.out.print(caractere);
             test = false;
          }
          else {
             if ( test == false ) {
                System.out.println();
                test = true;
             }
          }
       }
       System.out.println();    
   } 
}  

