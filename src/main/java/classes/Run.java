package classes;

/**
 * This class runs the example for the observer pattern.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Run {

    /**
     * Main method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        Newspaper printMedia = new Newspaper ();
        Internet internet = new Internet ();

        Loan personalLoan = new Loan ( "Personal loan", 12.5f, "Volksbank" );
        personalLoan.registerOberserver ( printMedia );
        personalLoan.registerOberserver ( internet );
        personalLoan.setInterest ( 3.5f );
    }
}
