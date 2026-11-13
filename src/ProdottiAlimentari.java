import java.time.LocalDate;

public class ProdottiAlimentari extends Prodotto {
    private LocalDate dataScadenza;

    public ProdottiAlimentari(String nome, double prezzo, Fornitore fornitore, LocalDate dataScadenza){
        super(nome, prezzo, fornitore);
        this.dataScadenza = dataScadenza;
    }

    public boolean verificaDataScadenza(){
        return dataScadenza.isAfter(LocalDate.now());
    }

    @Override
    public String toString() {
        return "ProdottiAlimentari{" +
                "dataScadenza=" + dataScadenza +
                '}';
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }
}
