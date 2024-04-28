package Objetos;

public class Cachorro {
    private String raca;
    private String cor;

    public Cachorro(String raca, String cor){
        this.raca = raca;
        this.cor = cor;
    }

    public String getRaca(){
        return raca;
    }
    public void SetRaca(String raca){
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void Latir(){
        System.out.println("O cachorro de raça " + getRaca() + " late.");
    }
    public void Correr(){
        System.out.println("O " + getRaca() + " também corre.");
    }

}
