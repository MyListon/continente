import java.util.ArrayList;

public class Continente {
    private String nome;
    private ArrayList<Pais> paises;

    // Construtor que inicializa o nome do continente
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Método para adicionar países ao continente
    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    // Método que retorna a dimensão total do continente
    public double dimensaoTotal() {
        double dimensaoTotal = 0.0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    // Método que retorna a população total do continente
    public long populacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    // Método que retorna a densidade populacional do continente
    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    // Método que retorna o país com maior população no continente
    public Pais paisMaiorPopulacao() {
        Pais maiorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maiorPopulacao.getPopulacao()) {
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }

    // Método que retorna o país com menor população no continente
    public Pais paisMenorPopulacao() {
        Pais menorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menorPopulacao.getPopulacao()) {
                menorPopulacao = pais;
            }
        }
        return menorPopulacao;
    }

    // Método que retorna o país de maior dimensão territorial no continente
    public Pais paisMaiorDimensao() {
        Pais maiorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() > maiorDimensao.getDimensao()) {
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }

    // Método que retorna o país de menor dimensão territorial no continente
    public Pais paisMenorDimensao() {
        Pais menorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() < menorDimensao.getDimensao()) {
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    // Método que retorna a razão territorial do maior país em relação ao menor país
    public double razaoTerritorial() {
        return paisMaiorDimensao().getDimensao() / paisMenorDimensao().getDimensao();
    }
}