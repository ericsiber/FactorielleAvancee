package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factorielle
 */
public class Factorielle {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(Factorielle.class);

	public Factorielle() {
		super();
	}

	public long calculer(long n) {
		LOGGER.info("Calcul de !" + n);
		if (n > 1) {
			return n * calculer(n - 1);
		} else if (n < 0) {
			throw new IllegalArgumentException();
		}
		return n;
	}

}
