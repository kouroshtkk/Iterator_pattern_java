public class ReverseRangeUtil {

    // (e) completare il metodo statico sumSquaresOf(ReverseRange r)
    // calcola la somma dei quadrati degli elementi della sequenza r.
    public static int sumSquaresOf(ReverseRange r) {

        var finalVal = 0;
        for (int newVal : r){
            finalVal+=(newVal*newVal);
        }
        return finalVal;
    }

    public static void main(String[] args) {
        System.out.println("Setup completo. Rimuovi i commenti sotto per testare le tue implementazioni:");


        assert sumSquaresOf(new ReverseRange(1, 1)) == 0; // sequenza vuota
        assert sumSquaresOf(new ReverseRange(5, 2)) == 50; // 5^2 + 4^2 + 3^2 = 25 + 16 + 9 = 50
        assert sumSquaresOf(new ReverseRange(-1, -4)) == 14; // (-1)^2 + (-2)^2 + (-3)^2 = 1 + 4 + 9 = 14
        assert sumSquaresOf(new ReverseRange(3, 7)) == 0; // sequenza vuota
        
        System.out.println("Tutti i test passati con successo!");

    }
}
