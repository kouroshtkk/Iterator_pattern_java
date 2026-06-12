import java.util.NoSuchElementException;

public class RangeIterator implements IteratorInterface {
    private final int end;
    private int current,next;
    private boolean valid;


    // (b) completarne il costruttore.
    public RangeIterator(int next, int end) {
        this.next=next;
        this.end=end;
        this.valid=false;
    }

    // (c) completare il metodo moveNext() della classe RangeIterator.
    @Override
    public boolean moveNext() {
        if(next<end){
            current=next;
            next+=1;
            valid=true;
            return true;
        }
        valid=false;
        return false;
    }

    // (d) completare il metodo current() della classe RangeIterator.
    @Override
    public int current() {
        if(valid){
            return current;
        }
        else {
            throw new NoSuchElementException();
        }
    }
}
