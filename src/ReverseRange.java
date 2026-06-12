import java.util.Iterator;

public class ReverseRange implements ReverseRangeInterface {
    private final int start, end;

    // inizializza una sequenza da start (incluso) a end (escluso), in ordine decrescente
    public ReverseRange(int start, int end) { 
        this.start = start; 
        this.end = end; 
    }

    // (a) completare il metodo iterator() della classe ReverseRange.
    @Override
    public Iterator<Integer> iterator() {
        return new ReverseRangeIterator(this.start,this.end);
    }
}
