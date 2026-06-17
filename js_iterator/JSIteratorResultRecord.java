package js_iterator;

// (a) completare JSIteratorResultRecord<E> che implementa JSIteratorResult<E> 
// e che viene usato dalla classe ToJSIterator<E>.
public record JSIteratorResultRecord<E>(E value, boolean done) implements JSIteratorResult<E> {
}
