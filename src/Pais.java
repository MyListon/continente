public class Pais {
    private String nome;
    private double dimensao; // Em km²
    private long populacao;

    // Construtor
    public Pais(String nome, double dimensao, long populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }
}