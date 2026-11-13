public class prodottiElettronici extends Prodotto {
    private int garanzia;

    public prodottiElettronici(String nome, double prezzo, Fornitore fornitore, int garanzia) {
        super(nome, prezzo, fornitore);
        this.garanzia = garanzia;
    }

    public int getGaranzia() {
        return garanzia;
    }

    public void verificaGaranzia(){
        if(garanzia > 12){
            super.setPrezzo(10);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n garanzia: " + garanzia;
    }
}
