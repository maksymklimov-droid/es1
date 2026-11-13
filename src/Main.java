public class Main {
    public static void main(String[] args) {
        Fornitore f = new Fornitore(2323232,"GabbyC");
        Prodotto d = new Prodotto("KitKat",2.50,f);
        Carello c = new Carello(2);
        c.add(d);
        System.out.println(c.toString());
    }
}