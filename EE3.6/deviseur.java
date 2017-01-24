package tp1Java;




public class  deviseur {
	public static void main(String[] args) {
   	int[] tab; 
      	tab = new int[10001];
      	int max=1;
      	tab[1] = 1;
	int Nombre;  
       	for (Nombre = 2;  Nombre <= 10000; Nombre++ ) {
       		int Deviseur; 
           	int NombreDeviseurs=0; 
           	for ( Deviseur = 1; Deviseur <= Nombre; Deviseur++ ) {  
              		if ( Nombre % Deviseur== 0 ){
            	 	 	NombreDeviseurs++;
			}
           	}
          	tab[Nombre] = NombreDeviseurs;  
           	if (NombreDeviseurs > max) {
             	 max = NombreDeviseurs;
           	}
       	}
       
       System.out.println("Among integers between 1 and 10000,");
       System.out.println("The maximum number of divisors was " + max);
       System.out.println("Numbers with that many divisors include:");
       for ( Nombre = 1; Nombre <= 10000; Nombre++ ) {
           if ( tab[Nombre] == max ) {
               System.out.println( "   " + Nombre);
           }
       }
   
   } 

}
