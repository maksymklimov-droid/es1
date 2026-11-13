public class Fornitore {
    private String nome;
    private int partitaIva;

    public Fornitore(int partitaIva, String nome) {
        this.partitaIva = partitaIva;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPartitaIva() {
        return partitaIva;
    }

    public String toString(){
        return "nome: " + nome + "\npartitaIva: " + partitaIva;
    }
}
