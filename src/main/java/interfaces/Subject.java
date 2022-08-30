package interfaces;

/**
 * This interface represents a subject.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public interface Subject {

    /**
     * Registers an observer.
     *
     * @param observer The {@link Observer} object to add.
     * @since 1.0
     */
    void registerOberserver ( Observer observer );

    /**
     * Removes an observer.
     *
     * @param observer The {@link Observer} object to remove
     */
    void removeObserver ( Observer observer );

    /**
     * Notifies the observers.
     *
     * @since 1.0
     */
    void notifyObservers ();
}
