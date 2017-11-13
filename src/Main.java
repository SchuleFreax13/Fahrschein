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
		int fünfzig_cent = 0;
		while (restgeld >= 50) {
			fünfzig_cent++;
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
		int fünf_cent = 0;
		while (restgeld >= 5) {
			fünf_cent++;
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
			System.out.println("2 Euro Münzen: " + zwei_euros);
		if (eins_euros > 0)
			System.out.println("1 Euro Münzen: " + eins_euros);
		if (fünfzig_cent > 0)
			System.out.println("50 Cent Münzen: " + fünfzig_cent);
		if (zwanzig_cent > 0)
			System.out.println("20 Cent Münzen: " + zwanzig_cent);
		if (zehn_cent > 0)
			System.out.println("10 Cent Münzen: " + zehn_cent);
		if (fünf_cent > 0)
			System.out.println("5 Cent Münzen: " + fünf_cent);
		if (zwei_cent > 0)
			System.out.println("2 Cent Münzen: " + zwei_cent);
		if (eins_cent > 0)
			System.out.println("1 Cent Münzen: " + eins_cent);
	}

}
