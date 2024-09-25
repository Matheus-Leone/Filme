package pacotefilme;

public class Main {

	// Método main para teste
    public static void main(String[] args) {
        try {
            // Criando um filme de exemplo válido
            Filme filme = new Filme("A Bela e a Fera", 70, "Romance");
            filme.exibirInformacoes();
            
            // Tentando criar um filme com gênero inválido
            // Filme filmeInvalido = new Filme("Filme Inválido", 90, "Ação"); // Vai lançar exceção
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
