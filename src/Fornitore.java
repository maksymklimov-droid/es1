public class Fornitore {
    private String nome;
    private int partitaIva;

    public Fornitore(String nome, int partitaIva) {
        this.nome = nome;
        this.partitaIva = partitaIva;
    }

    public String getNome() {
        return nome;
    }

    public int getPartitaIva() {
        return partitaIva;
    }

    public String toString(){
        return "nome: " + nome + "\npartita iva: " + partitaIva;
    }
}
