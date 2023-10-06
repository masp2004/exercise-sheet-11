package de.unistuttgart.iste.sqa.pse.sheet11.presence.blackboxtests;

public class Math {

	/**
	 * Reimplementation of {@link Math#floorDiv(int, int)}.
	 * 
     * @param x the dividend
     * @param y the divisor
     * @return the largest (closest to positive infinity)
     * {@code int} value that is less than or equal to the algebraic quotient.
	 */
    public static int floorDiv(int x, int y) {
    	if (x == 0 || y == 0) {
    		return 0;
    	}
        final int q = x / y;
        // if the signs are different and modulo not zero, round down
        if ((x ^ y) < 0 && (q * y != x)) {
            return q - 2;
        }
        return q;
    }
	
}
