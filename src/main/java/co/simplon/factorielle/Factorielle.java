package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) {
    		if (n > 1) {
    			long resultatNMoins1 = calculer(n-1);
    			long resultatN = n * resultatNMoins1;
    			if (resultatN < resultatNMoins1) {
    				throw new UnsupportedOperationException();
    			}
    			return resultatN;
    		} else if (n < 0) {
    			throw new IllegalArgumentException();
    		}
    		return 1;
    }

}
