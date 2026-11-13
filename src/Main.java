import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fornitore f = new Fornitore(2323232,"GabbyC");
        Prodotto d = new Prodotto("KitKat",2.50,f);
        Prodotto d1 = new ProdottiAlimentari("KitKat",2.50,f, LocalDate.of(2028, 1 , 1));
        Prodotto d2 = new ProdottiAlimentari("KitKat",2.50,f, LocalDate.of(2025, 1 , 1));
        Prodotto d3 = new prodottiElettronici("KitKat",2.50,f, 12);
        Prodotto d4 = new prodottiElettronici("KitKat",2.50,f, 0);

        Carello c = new Carello();
        c.add(d);
        c.add(d1);
        c.add(d2);
        c.add(d3);
        c.add(d4);

        System.out.println(c.toString());
    }
}