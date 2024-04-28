package Objetos;

public class Empresa {
    private String nome;
    private String cnpj;
    private String setor;

    public Empresa(String nome, String cnpj, String setor){
        this.nome = nome;
        this.cnpj = cnpj;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void Produzir(){
        System.out.println("A empresa " + getNome() + " realizam diversos serviços.");
    }
    public void Gerar(){
        System.out.println("A " + getNome() + " gera lucro.");
    }
    public void Contratar(){
        System.out.println("Na empresa " + getNome() + " contratam-se muitas pessoas.");
    }
}
