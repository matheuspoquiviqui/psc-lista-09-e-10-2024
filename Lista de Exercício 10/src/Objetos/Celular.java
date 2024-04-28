package Objetos;

public class Celular {
    private String marca;
    private double tamanho;
    private int memoria;

    public Celular (String marca, double tamanho, int memoria){
        this.marca = marca;
        this.tamanho = tamanho;
        this.memoria = memoria;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public void Chamadas(){
        System.out.println("O " + getMarca() + " pode realizar chamadas.");
    }
    public void Mensagem(){
        System.out.println("O " + getMarca() + " envia e recebe mensagens.");
    }
    public void Navegar(){
        System.out.println("O " + getMarca() + " navega na internet.");
    }

}
