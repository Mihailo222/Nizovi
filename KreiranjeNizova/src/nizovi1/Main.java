package nizovi1;

public class Main {

	public static void main(String[] args) {
		// vidi za paket potpaketa
		
		int[] nekiNiz = new int[10]; // inicijalizacija niza
        
		
		int[] nekiNiz2 = {1, 2, 3, 4, 5, 6, 7, 8} ; //drugi tip inicijalizacije
		
	
		
		//inicijalizacija
		for(int i=0; i<10; i++) {//0 1 2 3 4 5 6 7 8 9 --> i<10
			
			nekiNiz[i]=i+1;
			
			
			}    
		   
		   // poziv static fje
		
	//	ispisi(nekiNiz);
		System.out.println("               ");
		
//		OPERACIJE SA NIZOVIMA
	    
//	    1) UBACIVANJE U NIZ
		
		
		// ovo nece da mi debuguje dobro
		
		
		//true-prazna sedista
		//false-zauzeta sedista
		//treba rasporediti dete na prvo prazno mesto
		
		
		boolean[] sedista = new boolean[15];
		//sve vrednosti su po defaultu false
		
		// idemo sad na inicijalizaciju 
		
		for(int i=0; i<sedista.length; i++) { // ne moze manje jednako  
			sedista[i]=true;
			
		}
		
		sedista[0]=false;
		sedista[4]=false;
		sedista[7]=false;
		sedista[9]=false;
// isao je i na sve redom ispisivao false, i u jednom momentu prekinuo????
		
		
		/*
		for(int i=0; i<sedista.length; i++) {
			if(sedista[i]=false) {
				sedista[i]=true;
				break;
				
			}
		}
	
	
		*/
		
		//true-prazno
		//false-popunjeno
		
		
		
		

		for(int i=0; i<sedista.length; i++) {
			if(sedista[i]=true) { // na prvo slobodno(true) na koje naletis
				sedista[i]=false;  // ti ga popuni
			break;       // onda izadji iz petlje, da ne bi doslo do popunjavanja svih slobodnih mesta
				
			} 
		}
	
		
		
		
		
		// 2)  IZBACIVANJE ELEMENTA IZ NIZA ULEVO
		//SHIFTOVANJE ULEVO
		
		
      //izbacujemo 10. element tj. element sa indexom 9
		
		
		
		
		/*   OVO ISPISUJE NA 9 ELEMENATA BROJ 10
		
		for(int i=nekiNiz.length - 1; i>0; i--) { // i=10-1=9; do 1; i--
		//	nekiNiz[i]=nekiNiz[i+1];
		//	nekiNiz[i-1]=nekiNiz[i];
			// i=9;
			//nekiNiz[9-1]=nekiNiz[9]  ----> nekiNiz[8]=nekiNiz[9]
			//7-->8; 6--->7...  do i=1(ne do 0, taj el. cemo izbaciti)
		
		}
		
		ispisi(nekiNiz);
		
		
	
	*/
		
		for(int i=0; i<nekiNiz.length-1; i++) {
			nekiNiz[i]=nekiNiz[i+1];
		}
		nekiNiz[9]=-1;
		
		ispisi(nekiNiz);
		
		
		
		//3) PRETRAGA NIZA

		
		
		
		//3.1.bez break
		
		
		
		/*	
		
		int zadatiBroj = 7;
		boolean nadjen = false;
		for(int i=0; i<nekiNiz.length; i++) {
			if(nekiNiz[i]==7) {
				nadjen = true;
				System.out.println("Zadati broj je nadjen");
			}
			else {
				System.out.println("Nije nadjen");
			}
		}
		
	
		
		
		
		
		
		 * On ce na konzoli da ispise:
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Zadati broj je nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen*/
		
		
		
		
		
		//3.2. IF I IF SUPROTNO BEZ BREAK
		
	/*
	 
	  
	    int zadatiBroj = 7;
		boolean nadjen = false;
		for(int i=0; i<nekiNiz.length; i++) {
			if(nekiNiz[i]==7) {
				nadjen = true;
				System.out.println("Zadati broj je nadjen");
			}
			
			
			if(!nadjen) {
				System.out.println("Nije nadjen");
			}
			
		}
		 * On ce na konzoli   OPET  da ispise:
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Zadati broj je nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen
		 * Nije nadjen*/
		
		
		//3.3.IF I IF SUPROTNO SA BREAK
		
		/*  
		
		int zadatiBroj = 7;
		boolean nadjen = false;
		for(int i=0; i<nekiNiz.length; i++) {
			if(nekiNiz[i]==7) {
				nadjen = true;
				System.out.println("Zadati broj je nadjen");
				break;
			}
			
			
			if(!nadjen) {
				System.out.println("Nije nadjen");
			}
			
		}
		 STAMPA:
		 * 
		  Nije nadjen
	Nije nadjen
	Nije nadjen
	Nije nadjen
	Nije nadjen
	Zadati broj je nadjen
	*/
		
		
	   
		
		//3.4. IF I ELSE SA BREAK
		
		/*
		
		int zadatiBroj = 7;
		boolean nadjen = false;
		for(int i=0; i<nekiNiz.length; i++) {
			if(nekiNiz[i]==7) {
				nadjen = true;
				System.out.println("Zadati broj je nadjen");
				break;
			}
			
			
			else {
				System.out.println("Nije nadjen");
			}
			
		}
		
		
		Nije nadjen
		Nije nadjen
		Nije nadjen
		Nije nadjen
		Nije nadjen
		Zadati broj je nadjen
		
		
		*/
		
		//3.5. IF I !IF LEPO ALI FOR PETLJU OGRANICIMO
		//!IF=ELSE, samo sto smo morali ovde da napisemo umesto else
		//!IF jer nam else nije u for petlji, TJ, NISU U ISTOM BLOKU
		
		
		int zadatiBroj = 7;
		boolean nadjen = false;
		for(int i=0; i<nekiNiz.length; i++) {
			if(nekiNiz[i]==7) { //AKO JE BROJ 7, SAMO ONDA SMES DA STAMPAS
				nadjen = true;
				System.out.println("Zadati broj je nadjen");
				break;// KADA ODSTAMPAS DA JE NADJEN, IZLAZIS IZ PETLJE I PRESTAJES DA GA TRAZIS
				//SADA JE NADJEN=TRUE
			}
			
		}
		//AKO NIJE NADJEN, STAMPAJ OVO!!!
		//TJ. POSLE SVEGA OVOG IF, AKO MI BUDE NADJEN=FALSE, TADA JE NADJEN = FALSE, STAMPAJ OVO 
			
			if(!nadjen) { //JE L MOZE IF NADJEN=FALSE???
				System.out.println("Nije nadjen");
			}
			
			//stampa samo jednu recenicu-ima/nema zadatog broja u nizu
			
			
			
			//NIZ REALNIH BROJEVA
			
			
			double[] nizDecimalnihBrojeva = new double[5];
			for(int i=0; i<5; i++) {
				nizDecimalnihBrojeva[i]=i + 100.0;//mora 100.0, ne 100, moraju se svi tipovi poklapati
				
			}
			
			System.out.println("            ");
			
			ispisiDecimalne(nizDecimalnihBrojeva);
			
			
		}
	
	
		
		static void ispisiDecimalne( double[] nizDecimalnihBrojeva ){
			for(int i=0; i<nizDecimalnihBrojeva.length; i++) {
				System.out.println( i + "-ti  element niza d.br. je     " + nizDecimalnihBrojeva[i]);
				
			}
			
		}
		
	
	
		
	
	
	
		
		
		
		
		
		
		

		//fja za ispis
		
		static void ispisi( int[] nekiNiz) { // predstavljenje niza kao ulazni parametar 
			for(int i=0; i<nekiNiz.length; i++) {  // niz.length
				
				System.out.println( i + "-ti element niza je:     " + nekiNiz[i] );
			}
		    }

	}


