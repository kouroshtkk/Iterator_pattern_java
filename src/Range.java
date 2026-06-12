public class Range implements RangeInterface {
    private final int start, end;

    // inizializza una sequenza da start (incluso) a end (escluso)
    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // (a) completare il metodo iterator() della classe Range.
    @Override
    public IteratorInterface iterator() {
        return new RangeIterator(this.start,this.end);
    }
}
