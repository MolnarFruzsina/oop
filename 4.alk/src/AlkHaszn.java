
public class AlkHaszn {
	public static void main(String[]args) {
		alkalmazott Alkalmazott = new alkalmazott ();
		
		//Alkalmazott.nev = "Kiss J�zsef";
		Alkalmazott.setNev("Kiss Jozsef");
		//Alkalmazott.fizetes = 10;
		Alkalmazott.setFizetes(10);
		
		//System.out.println(Alkalmazott.nev);
		System.out.println(Alkalmazott.getNev());
		System.out.println(Alkalmazott.getFizetes());
		// System.out.println(Alkalmazott.toString());
		System.out.println(Alkalmazott);
	
		Alkalmazott.fizetesNovel(5);
		System.out.println(Alkalmazott);
		System.out.println(Alkalmazott.fizetesIntervallumokKozott(10, 30));
		System.out.println(Alkalmazott.fizetendoAdo());
		
		alkalmazott Alkalmazott2 = new alkalmazott();
		Alkalmazott2.setNev("Kiss Klaudia");
		Alkalmazott2.setFizetes(20);
		
		System.out.println(Alkalmazott.nagyobbfizetesuMint(Alkalmazott2));
		System.out.println(Alkalmazott2.nagyobbfizetesuMint(Alkalmazott));
		
		alkalmazott[] alkalmazottak = new alkalmazott[5];
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new alkalmazott() ;
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes((long)(Math.random() *50));
			System.out.println(alkalmazottak[i]);
		}
		
		
		
	}
}
		