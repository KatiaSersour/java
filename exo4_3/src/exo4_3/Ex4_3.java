package exo4_3;

import java.util.Random ;
import java.util.Scanner;
import java.lang.IllegalArgumentException ;

/**
 * 
 * @author KATIA
 *
 */
public class Ex4_3 {
	private static Scanner sc;

	public static void main (String args []) throws IllegalArgumentException{
		System.out.println("Rentrez un nombre") ;
		sc = new Scanner(System.in);
		int nbr =  sc.nextInt();
		if(nbr < 2 || nbr>12){
			throw new IllegalArgumentException();
		}
		System.out.println("Votre nombre est tombé au bout de "+ sommeDe(nbr)+" lancés");
	}
	
	/**
	  * 
	  * @param nbr
	  * @return the number of times you have to roll the dice
	  */
	public static int sommeDe(int nbr){
		int compteur = 0;

		Random generator = new Random();
		int de1 = generator.nextInt(5) +1 ;
		int de2 = generator.nextInt(5) +1 ;

		int sommede = de1+de2;
		
		while(sommede != nbr){
			
			compteur++;
			de1 = generator.nextInt(5) +1 ;
			de2 = generator.nextInt(5) +1 ;
			sommede = de1+de2;
			
		}
			return compteur ;
	}
}
