package exo47;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author KATIA
 *
 */
public class Quiz {
	public static int oper1[]=new int[10];
	public static int oper2[]=new int[10];
	public static int resultat[]=new int[10];
	
	/**
	 * this function creates the quiz by generating the two numbers
	 */
	public static void creerQuestionnaire(){
		int i;
		Random rand = new Random();
		for(i=0;i<10;i++){
			oper1[i]=rand.nextInt(51);
			oper2[i]=rand.nextInt(51);
		}
	}
	
	/**
	 * this function administers the quiz by asking the question to the user
	 */
	public static void administrerQuiz(){
		int i;
		Scanner sc;
		for(i=0;i<10;i++){
			System.out.print("question N°"+ (i+1) + ": "+ oper1[i]+ " + " + oper2[i]+ " = ?");
			sc = new Scanner(System.in);
		    resultat[i] = sc.nextInt();
		}
	}
	
	/**
	 * this function grades the quiz 
	 */
	public static void evaluerQuiz(){
		int score=0;
		int i;
		System.out.println("les bonnes réponses sont:");
		for(i=0;i<10;i++){
		    if(resultat[i]==(oper1[i]+oper2[i])){
		    	System.out.println("question N°"+ (i+1) + ": "+ oper1[i]+ " + " + oper2[i]+ " = "+(oper1[i]+oper2[i])+". Votre réponse est correcte.");
			score+=10;		    
		}else{
		    	System.out.println("question N°"+ (i+1) + ": "+ oper1[i]+ " + " + oper2[i]+ " = "+(oper1[i]+oper2[i])+". Vous avez trouvez "+resultat[i]+", votre réponse n'est pas correcte.");
		    }
		}
		System.out.println("votre score est de "+score+" points");
	}
	public static void main(String[] args) {
		creerQuestionnaire();
		administrerQuiz();
		evaluerQuiz();
	}
}
