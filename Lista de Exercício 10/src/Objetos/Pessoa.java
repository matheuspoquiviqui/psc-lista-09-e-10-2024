package Objetos;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;

public Pessoa(String nome, String cpf, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        }
        
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void Andar(){
        System.out.println("O " + getNome() + " pode andar.");
    }
    public void Falar(){
        System.out.println("O " + getNome() + " tem a habilidade de falar.");
    }
    public void Refletir(){
        System.out.println("O " + getNome() + " sabe refletir.");
    }
    
}
