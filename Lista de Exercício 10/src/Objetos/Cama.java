package Objetos;

public class Cama {
    private String material;
    private String tamanho;

    public Cama (String material, String tamanho){
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void Dormir(){
        System.out.println("Na cama " + getTamanho() + " você dorme bem.");
    }
    public void Descansar(){
        System.out.println("Você descansa na cama " + getTamanho() + ".");
    }
}
