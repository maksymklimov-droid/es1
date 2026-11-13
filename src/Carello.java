import java.util.ArrayList;

public class Carello {
    private int nUnivoco;
    private ArrayList<Prodotto> prodotti ;

    public Carello(int nUnivoco){
        this.nUnivoco = nUnivoco;
        prodotti = new ArrayList<>();
    }

    public void add(Prodotto prodotto){
        prodotti.add(prodotto);
    }

    public int getnUnivoco() {
        return nUnivoco;
    }

    @Override
    public String toString() {
        return "Carello: " + "\n nUnivoco " + nUnivoco + "\n prodotti " + prodotti ;
    }
}
