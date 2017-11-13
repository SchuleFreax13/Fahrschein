import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Kosten: ");
		int kosten = (int) ((double) Double.valueOf(scanner.nextLine()) * 100);
		System.out.print("Bezahlung: ");
		int bezahlung = (int) ((double) Double.valueOf(scanner.nextLine()) * 100);
		
		int restgeld = bezahlung - kosten;
			
		int zwei_euros = 0;
		while (restgeld >= 200) {
			zwei_euros++;
			restgeld -= 200;
		}
		int eins_euros = 0;
		while (restgeld >= 100) {
			eins_euros++;
			restgeld -= 100;
		}
		int f�nfzig_cent = 0;
		while (restgeld >= 50) {
			f�nfzig_cent++;
			restgeld -= 50;
		}
		int zwanzig_cent = 0;
		while (restgeld >= 20) {
			zwanzig_cent++;
			restgeld -= 20;
		}
		int zehn_cent = 0;
		while (restgeld >= 10) {
			zehn_cent++;
			restgeld -= 10;
		}
		int f�nf_cent = 0;
		while (restgeld >= 5) {
			f�nf_cent++;
			restgeld -= 5;
		}
		int zwei_cent = 0;
		while (restgeld >= 2) {
			zwei_cent++;
			restgeld -= 2;
		}
		int eins_cent = 0;
		while (restgeld >= 1) {
			eins_cent++;
			restgeld -= 1;
		}

		if (zwei_euros > 0)
			System.out.println("2 Euro M�nzen: " + zwei_euros);
		if (eins_euros > 0)
			System.out.println("1 Euro M�nzen: " + eins_euros);
		if (f�nfzig_cent > 0)
			System.out.println("50 Cent M�nzen: " + f�nfzig_cent);
		if (zwanzig_cent > 0)
			System.out.println("20 Cent M�nzen: " + zwanzig_cent);
		if (zehn_cent > 0)
			System.out.println("10 Cent M�nzen: " + zehn_cent);
		if (f�nf_cent > 0)
			System.out.println("5 Cent M�nzen: " + f�nf_cent);
		if (zwei_cent > 0)
			System.out.println("2 Cent M�nzen: " + zwei_cent);
		if (eins_cent > 0)
			System.out.println("1 Cent M�nzen: " + eins_cent);
	}

}
