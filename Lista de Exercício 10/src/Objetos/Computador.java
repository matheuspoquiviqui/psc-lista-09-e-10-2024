package Objetos;

public class Computador {
    private String marca;
    private String modelo;

    public Computador(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void Executar(){
        System.out.println("O computador da " + getMarca() +  " executa inúmeros aplicativos.");
    }
    public void Jogar(){
        System.out.println("Você pode jogar no computador da " + getMarca() +  ".");
    }
}
