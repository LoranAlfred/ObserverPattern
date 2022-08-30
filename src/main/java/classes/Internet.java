package classes;

import interfaces.Observer;


/**
 * This class represents the internet.
 *
 * @author Alfred Loran
 * @version 1.0
 */
class Internet implements Observer {

    @Override
    public void update ( float interest ) {
        System.out.println ( "Internet: Interest Rate updated, new Rate is: " + interest );
    }
}
