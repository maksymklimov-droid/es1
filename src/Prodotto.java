public class Prodotto {
    private String nome;
    private double prezzo;
    private Fornitore fornitore;

    public Prodotto(String nome, double prezzo, Fornitore fornitore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.fornitore = fornitore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        String txt = "nome: " + nome + "\nprezzo: " + prezzo+ "\nfornitore: " + fornitore.getNome();
        return txt;
    }
}
