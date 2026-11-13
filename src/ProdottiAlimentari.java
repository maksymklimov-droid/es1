import java.time.LocalDate;

public class ProdottiAlimentari extends Prodotto {
    private LocalDate dataScadenza;

    public ProdottiAlimentari(String nome, double prezzo, Fornitore fornitore, LocalDate dataScadenza){
        super(nome, prezzo, fornitore);
        this.dataScadenza = dataScadenza;
    }

    public void verificaDataScadenza(){
        if(!LocalDate.now().isBefore(dataScadenza.minusDays(3))){
            double pr = getPrezzo()-getPrezzo()*0.2;
            super.setPrezzo(pr);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nData di scadenza: "+ dataScadenza;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }
}
