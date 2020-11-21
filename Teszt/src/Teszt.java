import java.util.Scanner;

public class Teszt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String helyes = "BCCCDBBBBCDAAA";
		int joMegoldas = 0;
		int nincsMegoldas [] = new int [10];
		int max = 0;
		int i = 0;
		
		Megoldas tomb[]=new Megoldas[10];
		tomb[0]=new Megoldas("AB123","BXCDBBACACADBC");
		tomb[1]=new Megoldas("AD995","BABCDABCBCBBBA");
		tomb[2]=new Megoldas("AH97","BCACDBDDBCBBCA");
		tomb[3]=new Megoldas("AK260","DCDCBDDAACDBDB");
		tomb[4]=new Megoldas("AL580","AACCDBBCDCAACA");
		tomb[5]=new Megoldas("AN562","BAABBDCACCBDBB");
		tomb[6]=new Megoldas("AN784","BDCDCBAACDDABC");
		tomb[7]=new Megoldas("AQ258","BDCCABACBADBDC");
		tomb[8]=new Megoldas("BC476","DAABADACBBCCCB");
		tomb[9]=new Megoldas("BC504","DBDBBABCCBADXX");	
		
		
		System.out.println("2. feladat: ");
		System.out.print("A versenyző azonosítója: ");
		String azonosito = input.nextLine();
		
		for (i = 0; i < 10; i++) {
			if (tomb[i].kod.equals(azonosito)) {
				System.out.println("A versenyző válaszai: " + tomb[i].valaszok);
			}
		}
		System.out.println("");
		
		
		System.out.println("3. feladat: ");
		System.out.print("A feladat sorszáma: ");
		int sorszam = input.nextInt();
		
		for (i = 0; i < 10; i++) {
			if (helyes.charAt(sorszam - 1) == (tomb[i].valaszok.charAt(sorszam - 1))) {
				joMegoldas++;
			}
		}
		System.out.println("Erre a feladatra " + joMegoldas + " fő adott jó megoldást.");
		System.out.println("");
		
		
		System.out.println("4. feladat: ");
		
		for (i = 0; i < 10; i++) {
			if (tomb[i].valaszok.contains("X")) {
				nincsMegoldas[i]++;
			}
			
			if (nincsMegoldas[i] > nincsMegoldas[max]) {
				max = i;
			}
		}

		System.out.println("A(z) " + tomb[max].kod + " kódú fő " + nincsMegoldas[max] + " kérdésre nem válaszolt.");
		// ez t�rt�nt ez igy volt 
		//aluowgduiafwdfauwdfiuawd
		System.out.println("adwadwadawdawdawdawdwadwa");
	}

}
