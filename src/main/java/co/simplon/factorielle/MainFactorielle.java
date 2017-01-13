package co.simplon.factorielle;

import co.simplon.factorielle.exception.FactorielleUnavailableException;

public class MainFactorielle {

	public static void main(String[] arguments) {
		try {
			String input = arguments[0];
			long entier = Long.parseLong(input);
			calculerEtAfficherFactorielle(entier);
		} catch (NumberFormatException e) {
			System.out.println("Cas erreur 1");
		} catch (IllegalArgumentException e) {
			System.out.println("Cas erreur 2");
		} catch (FactorielleUnavailableException e) {
			System.out.println("Cas erreur 3");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cas erreur 4");
		}
	}

	private static void calculerEtAfficherFactorielle(long entier) {
		Factorielle factorielleUtil = new Factorielle();
		long resultat = factorielleUtil.calculer(entier);
		System.out.println("Cas nominal, résultat = " + resultat);
	}

}
