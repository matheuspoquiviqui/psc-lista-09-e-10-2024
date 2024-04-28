package Objetos;

public class Time {
    private String nome;
    private String campeonato;
    private String coresUniforme;
    
    public Time (String nome, String campeonato, String coresUniforme){
        this.nome = nome;
        this.campeonato = campeonato;
        this.coresUniforme = coresUniforme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public String getCoresUniforme() {
        return coresUniforme;
    }

    public void setCoresUniforme(String coresUniforme) {
        this.coresUniforme = coresUniforme;
    }
    public void Treina(){
        System.out.println("Os jogadores do time do " + getNome() + " treinam muito.");
    }
    public void Disputar(){
        System.out.println("O " + getNome() + " disputa várias partidas.");
    }
    public void Conquista(){
        System.out.println("O time do " + getNome() + " conquista muitos troféus.");
    }
}
