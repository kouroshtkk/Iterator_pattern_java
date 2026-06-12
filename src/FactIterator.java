import java.util.Iterator;
import java.util.NoSuchElementException;

public class FactIterator implements Iterator<Double> {
    private byte current = 1;
    private final byte maxItems;
    private double currentValue;

    // (b) dichiarare i campi della classe FactIterator
    // (b) completarne il costruttore.
    public FactIterator(byte maxItems) {
        this.maxItems = maxItems;
        this.currentValue = 1.0;
    }

    // (c) completare il metodo hasNext() della classe FactIterator.
    @Override
    public boolean hasNext() {
        return current <= maxItems;
    }

    // (d) completare il metodo next() della classe FactIterator. 
    @Override
    public Double next() {
        if(this.hasNext()) {
            var fact = this.currentValue;
            current += 1;
            this.currentValue *= current;
            return fact;
        }
        else {
            throw new NoSuchElementException();
        }
    }
}
