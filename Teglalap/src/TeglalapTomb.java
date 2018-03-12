
public class TeglalapTomb {

	public static void main(String[] args) {
		int meret = 10;
		Teglalap teglalapTomb[] = new Teglalap[meret];
		
		for (int i = 0; i < teglalapTomb.length; i++) {
			teglalapTomb[i]= new Teglalap((int)(Math.random() * 9)+2 , (int)(Math.random()* 9) +2);
			System.out.println(teglalapTomb[i]);
		}
		int min_teruletu_teglalap_indexe = 0;
		for (int i = 1; i < teglalapTomb.length; i++) {
			if (teglalapTomb[min_teruletu_teglalap_indexe].teruletNagyobbMint(teglalapTomb[i])) {
				min_teruletu_teglalap_indexe = i;
				
			}
		}
		System.out.println(teglalapTomb[min_teruletu_teglalap_indexe]);

	}

}
