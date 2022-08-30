package classes;

import interfaces.Observer;


/**
 * This class represents a newspaper.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Newspaper implements Observer {

    @Override
    public void update ( float interest ) {
        System.out.println ("Newspaper: Interest Rate updated: The interest is now " + interest);
    }
}
