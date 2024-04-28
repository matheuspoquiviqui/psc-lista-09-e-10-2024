import Objetos.Pessoa;
import Objetos.Celular;
import Objetos.Cachorro;
import Objetos.Livro;
import Objetos.Garrafinha;
import Objetos.Computador;
import Objetos.Time;
import Objetos.Cama;
import Objetos.Filme;
import Objetos.Empresa;

public class Ativ10 {
    public static void main(String[] args) throws Exception {
        Objetos.Pessoa pessoa = new Objetos.Pessoa("Matheus" , "111.111.111-11", "Poquiviqui");

        System.out.println("\nObjeto: Pessoa");
        System.out.println("\nCaracterísticas:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("\nAções do objeto:");
        pessoa.Andar();
        pessoa.Falar();
        pessoa.Refletir();


        Objetos.Celular celular = new Objetos.Celular("Xiaomi", 8.7,  256);
        System.out.println("----------------------------------");
        System.out.println("Objeto: Celular");
        System.out.println("\nCaracterísticas:");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Tamanho: " + celular.getTamanho() + " polegadas");
        System.out.println("Memória: " + celular.getMemoria() + " Gb");
        System.out.println("\nAções do objeto:");
        celular.Chamadas();
        celular.Mensagem();
        celular.Navegar();


        Objetos.Cachorro cachorro = new Objetos.Cachorro("Pinscher", "Marrom");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Cachorro");
        System.out.println("\nCaracterísticas:");
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Cor do cachorro: " + cachorro.getCor());
        System.out.println("\nAções do objeto:");
        cachorro.Latir();
        cachorro.Correr();


        Objetos.Livro livro = new Objetos.Livro("J. K. Rowling", "Fantasia", "Harry Potter e o Cálice de Fogo");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Livro");
        System.out.println("\nCaracterísticas:");
        System.out.println("Autor do livro: " + livro.getAutor());
        System.out.println("Gênero do livro: " + livro.getGenero());
        System.out.println("Título do livro: " + livro.getTitulo());
        System.out.println("\nAções do objeto:");
        livro.Ler();
        livro.Folhear();
        livro.Ensinar();


        Objetos.Garrafinha garrafinha = new Objetos.Garrafinha("Plástico", "Azul");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Garrafinha");
        System.out.println("\nCaracterísticas:");
        System.out.println("Material da garrafinha: " + garrafinha.getMaterial());
        System.out.println("Cor da garrafinha: " + garrafinha.getCor()); 
        System.out.println("\nAções do objeto:");
        garrafinha.Beber();
        garrafinha.Encher();


        Objetos.Computador computador = new Objetos.Computador("Dell", "Inspiron 15 3520");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Computador");
        System.out.println("\nCaracterísticas:");
        System.out.println("Marca do computador: " + computador.getMarca());
        System.out.println("Modelo do computador: " + computador.getModelo());
        System.out.println("\nAções do objeto:");
        computador.Executar();
        computador.Jogar();


        Objetos.Time time = new Objetos.Time("Flamengo", "Carioca", "Vermelho e Preto");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Time");
        System.out.println("\nCaracterísticas:");
        System.out.println("Nome do time: " + time.getNome());
        System.out.println("Campeonato em que o time joga: " + time.getCampeonato());
        System.out.println("Cores do uniforme: " + time.getCoresUniforme());
        System.out.println("\nAções do objeto:");
        time.Treina();
        time.Disputar();
        time.Conquista();


        Objetos.Cama cama = new Objetos.Cama("Madeira", "King Size");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Cama");
        System.out.println("\nCaracterísticas:");
        System.out.println("Material da cama: " + cama.getMaterial());
        System.out.println("Tamanho da cama: " + cama.getTamanho());
        System.out.println("\nAções do objeto:");
        cama.Dormir();
        cama.Descansar();


        Objetos.Filme filme = new Filme("Interestelar", "Ficção Científica");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Filme");
        System.out.println("\nCaracterísticas:");
        System.out.println("Nome do filme: " + filme.getTitulo());
        System.out.println("Gênero do filme: " + filme.getGenero());
        System.out.println("\nAções do objeto:");
        filme.Contar();
        filme.Transmitir();


        Objetos.Empresa empresa = new Objetos.Empresa("Expressa Turismo LTDA", "38.888.554/0001-55", "Turismo");
        System.out.println("----------------------------------");
        System.out.println("Objeto: Empresa");
        System.out.println("\nCaracterísticas:");
        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        System.out.println("Setor em que a empresa trabalha: " + empresa.getSetor());
        System.out.println("\nAções do objeto:");
        empresa.Produzir();
        empresa.Gerar();
        empresa.Contratar();
    }
}
