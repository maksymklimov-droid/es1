public class Prodotto {
    private String nome;
    private double prezzo;
    private Fornitore fornitore;

    public Prodotto(String nome, double prezzo, Fornitore fornitore){
        this.fornitore = fornitore;
        this.nome = nome;
        this.prezzo = prezzo;
    }
}
