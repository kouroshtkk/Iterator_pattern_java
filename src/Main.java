public class Main {
    public static void main(String[] args) {
        System.out.println("Setup completo. Rimuovi i commenti sotto per testare le tue implementazioni:");


        System.out.print("Test FactIterable(5): ");
        var it = new FactIterable((byte) 5).iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " "); // stampa 1.0 2.0 6.0 24.0 120.0
        }
        System.out.println();



        System.out.print("Test FactIterable(-1): ");
        for (var i : new FactIterable((byte) -1)) {
            System.out.print(i + " "); // non stampa nulla
        }
        System.out.println();
        System.out.print("Test FactIterable(10): ");
        it = new FactIterable((byte) 10).iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " "); // stampa 1.0 2.0 6.0 24.0 120.0
        }
        System.out.println();
        }

}
