import java.util.Iterator;

public class FactIterable implements Iterable<Double> {
    private final byte items; // numero di elementi della sequenza

    // inizializza la sequenza con items elementi 1!, 2!, ..., items! se items > 0
    // la sequenza non ha elementi se items <= 0
    public FactIterable(byte items) { 
        this.items = items; 
    }

    // inizializza la sequenza con Byte.MAX_VALUE elementi
    public FactIterable() { 
        this(Byte.MAX_VALUE); 
    }

    // (a) completare il metodo iterator() della classe FactIterable.
    @Override
    public Iterator<Double> iterator() {
        return new FactIterator(this.items);
    }
}
