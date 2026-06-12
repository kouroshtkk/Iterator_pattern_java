import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseRangeIterator implements Iterator<Integer> {
    private final int start,end;
    private int current;

    public ReverseRangeIterator(int start, int end) {
        this.start=start;
        this.end=end;
        this.current=start;
    }


    @Override
    public boolean hasNext() {
        return current > end;
    }


    @Override
    public Integer next() {
        if(hasNext()){
            var returnVal=current;
            current-=1;
            return returnVal;
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
