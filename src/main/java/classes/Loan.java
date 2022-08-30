package classes;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;


/**
 * This class represents the loan.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Loan implements Subject {

    private ArrayList<Observer> observers = new ArrayList<> ();

    private String type;

    private float interest;

    private String bank;

    /**
     * Constructor.
     *
     * @param type     The type to set.
     * @param interest The interest to set.
     * @param bank     The bank to set.
     * @since 1.0
     */
    public Loan ( String type, float interest, String bank ) {
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }

    /**
     * Returns the interest.
     *
     * @return The interest.
     * @since 1.0
     */
    public float getInterest () {
        return interest;
    }

    /**
     * Sets the interest.
     *
     * @param interest The interest to set.
     * @since 1.0
     */
    public void setInterest ( float interest ) {
        this.interest = interest;
        notifyObservers ();
    }

    /**
     * Returns the type.
     *
     * @return The type.
     * @since 1.0
     */
    public String getType () {
        return type;
    }

    /**
     * Returns the bank.
     *
     * @return The bank.
     * @since 1.0
     */
    public String getBank () {
        return bank;
    }

    @Override
    public void registerOberserver ( Observer observer ) {
        observers.add ( observer );
    }

    @Override
    public void removeObserver ( Observer observer ) {
        observers.remove ( observer );
    }

    @Override
    public void notifyObservers () {
        observers.forEach ( observer -> {
            System.out.println ( "Notifying Observers on change in Loan interest rate" );
            observer.update ( this.interest );
        } );
    }
}
