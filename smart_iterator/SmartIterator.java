package smart_iterator;

public interface SmartIterator<E> {
    boolean moveNext();
    E current();
}
