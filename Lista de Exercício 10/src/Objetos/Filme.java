package Objetos;

public class Filme {
    private String titulo;
    private String genero;

    public Filme(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void Contar(){
        System.out.println("No filme " + getTitulo() + " narram uma boa história.");
    }
    public void Transmitir(){
        System.out.println("O filme " + getTitulo() + " transmite uma mensagem importante.");
    }
}
