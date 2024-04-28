package Objetos;

public class Livro {
    private String autor;
    private String genero;
    private String titulo;

    public Livro(String autor, String genero, String titulo){
        this.autor = autor;
        this.genero = genero;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void Ler(){
        System.out.println("Você pode ler o livro " + getTitulo() + ". (Recomendo)");
    }
    public void Folhear(){
        System.out.println("Você pode folhear o livro " + getTitulo() + ".");
    }
    public void Ensinar(){
        System.out.println("O livro " + getTitulo() + " ensina lições valiosas.");
    }


}
