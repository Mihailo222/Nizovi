package nizStringova;

public class StringoviMain {
	
	public static void main(String[] args) {
		//preimenuj klasu-->d. klik refactor pa rename
		
		
				String[] nizImena = new String[] {"Pera", "Zika", "Mika", "Marko", "Laza"};
				System.out.println("Imena u nizu su:  ");
				for(int i=0; i<nizImena.length; i++) {
					System.out.println(nizImena[i]);
				}
				
				//String[] = new String[5]; --> 5 x null vrednosti
				System.out.println("                 ");
				ispisiNizStringova(nizImena);
			}
			
			
			
			
			static void ispisiNizStringova( String[] nizImena) {
				for( int i=0; i<nizImena.length; i++) {
					System.out.println(i+"-ti element niza je: " + nizImena[i]);
					
				}
	}
	
}
