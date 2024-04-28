package Objetos;

public class Garrafinha {
    private String material;
    private String cor;

    public Garrafinha(String material, String cor){
        this.material = material;
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void Beber(){
        System.out.println("Você pode beber água na garrafinha.");
    }
    public void Encher(){
        System.out.println("Você pode encher a garrafinha com suco.");
    }
}
