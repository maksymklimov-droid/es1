import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fornitore f = new Fornitore(2323232,"GabbyC");
        Prodotto d = new Prodotto("KitKat1",2.50,f);
        ProdottiAlimentari d1 = new ProdottiAlimentari("KitKat2",2.50,f, LocalDate.of(2028, 1 , 1));
        ProdottiAlimentari d2 = new ProdottiAlimentari("KitKat3",2.50,f, LocalDate.of(2025, 1 , 1));
        prodottiElettronici d3 = new prodottiElettronici("KitKat4",2.50,f, 13);
        prodottiElettronici d4 = new prodottiElettronici("KitKat5",2.50,f, 0);

        Carello c = new Carello();
        c.add(d);
        c.add(d1);
        c.add(d2);
        c.add(d3);
        c.add(d4);
        System.out.println(d2);
        //d2.verificaDataScadenza();
        //System.out.println(d2);
        //System.out.println(d3);
        //d3.verificaGaranzia();
        //System.out.println(d3);

        //System.out.println(c.toString());
    }
}