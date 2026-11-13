import java.util.ArrayList;

public class Carello {
    private ArrayList<Prodotto> prodotti ;

    public Carello(){
        prodotti = new ArrayList<>();
    }

    public void add(Prodotto prodotto){
        prodotti.add(prodotto);
    }

    @Override
    public String toString() {
        String txt = "Carello: ";
        for(Prodotto prodotto : prodotti){
            txt += "\n" + prodotto;
        }
        return txt;
    }
}
