package exo47;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
	public static int oper1[]=new int[10];
	public static int oper2[]=new int[10];
	public static int resultat[]=new int[10];
	
	public static void creerQuestionnaire(){
		int i;
		Random rand = new Random();
		for(i=0;i<10;i++){
			oper1[i]=rand.nextInt(51);
			oper2[i]=rand.nextInt(51);
		}
	}
	public static void administrerQuiz(){
		int i;
		Scanner sc;
		for(i=0;i<10;i++){
			System.out.print("question N°"+ (i+1) + ": "+ oper1[i]+ " + " + oper2[i]+ " = ?");
			sc = new Scanner(System.in);
		    resultat[i] = sc.nextInt();
		}
	}
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
