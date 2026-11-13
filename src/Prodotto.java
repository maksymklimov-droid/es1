public class Prodotto {
    private String nome;
    private double prezzo;
    private Fornitore fornitore;

    public Prodotto(String nome, double prezzo, Fornitore fornitore) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.fornitore = fornitore;
    }


    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", fornitore=" + fornitore +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
