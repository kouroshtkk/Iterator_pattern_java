public class RangeUtil {

    // (e) completare il metodo statico prodOf(Range r)
    // calcola il prodotto degli elementi di r.
    public static int prodOf(Range r) {
       var finalValue=1;
       var RangeIter=r.iterator();
       while(RangeIter.moveNext()) {
           finalValue*=RangeIter.current();
       }
       return finalValue;
    }

    public static void main(String[] args) {
        System.out.println("Setup completo. Rimuovi i commenti sotto per testare le tue implementazioni:");

        
        assert RangeUtil.prodOf(new Range(1, 1)) == 1; // prodotto di sequenza vuota
        assert RangeUtil.prodOf(new Range(-1, 2)) == 0; // -1 * 0 * 1 == 0
        assert RangeUtil.prodOf(new Range(1, 6)) == 120; // 5! == 1 * 2 * 3 * 4 * 5 == 120
        
        System.out.println("Tutti i test passati con successo!");
        
    }
}
