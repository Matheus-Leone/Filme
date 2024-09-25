package pacotefilme;

public class Filme {
    // Atributos privados para segurança
    private String titulo;
    private int duracao;  // Duração em minutos
    private String genero;

    //Setando a Ordem de apresentação de Atributos e colocando eles para serem organizados e utilizados em outras classes.Set para definir o atributo 
    public Filme(String titulo, int duracao, String genero) {
        setTitulo(titulo);
        setDuracao(duracao);
        setGenero(genero);
    }

    // Get para puxar o dado informado anteriormente
    public String getTitulo() {
        return titulo;
    }
    
    //Corrige a possibilidade do nome do filme estar vazio 
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode estar vazio.");
        }
        this.titulo = titulo;
    }


    public int getDuracao() {
        return duracao;
    }
    
    //Corrige a possibilidade da duração do filme ser 0
    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            throw new IllegalArgumentException("A duração deve ser maior que zero.");
        }
        this.duracao = duracao;
    }

    
    public String getGenero() {
        return genero;
    }

    //Define que somente os 3 gêneros são aceitos
    public void setGenero(String genero) {
        if (genero.equalsIgnoreCase("Romance") || 
            genero.equalsIgnoreCase("Terror") || 
            genero.equalsIgnoreCase("Comédia")) {
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("O gênero deve ser 'Romance', 'Terror' ou 'Comédia'.");
        }
    }

    // Método para exibir as informações do filme
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Gênero: " + genero);
    }

}

