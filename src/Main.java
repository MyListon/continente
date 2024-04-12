//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Método main para testar a classe Continente
    public static void main(String[] args) {
        // Criar uma instância de Continente
        Continente continente = new Continente("América");

        // Criar instâncias de alguns países
        Pais brasil = new Pais("Brasil", 8515767, 213993437);
        Pais argentina = new Pais("Argentina", 2780400, 45195777);
        Pais canada = new Pais("Canadá", 9984670, 37742154);

        // Adicionar os países ao continente
        continente.adicionarPais(brasil);
        continente.adicionarPais(argentina);
        continente.adicionarPais(canada);

        // Testar alguns métodos
        System.out.println("População total do continente: " + continente.populacaoTotal());
        System.out.println("País com maior população: " + continente.paisMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + continente.paisMenorPopulacao().getNome());
        // Adicione mais testes conforme necessário
    }
}