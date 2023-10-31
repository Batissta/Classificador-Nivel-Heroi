package model;

public class Heroi {
    private String nome;
    private Integer exp;
    private String nivel;


    public Heroi(String nome, Integer exp){
        this.setNome(nome);
        this.setExp(exp);
    }
    public void categorizaHeroi(){
        Integer exp = this.getExp();
        if(exp <= 1000)
            setNivel("Ferro");
        else if(exp <= 2000)
            setNivel("Bronze");
        else if(exp <= 5000)
            setNivel("Prata");
        else if(exp <= 6000)
            setNivel("Ouro");
        else if(exp <= 8000)
            setNivel("Platina");
        else if(exp <= 9000)
            setNivel("Ascendente");
        else if(exp <= 10000)
            setNivel("Imortal");
        else
            setNivel("Radiante");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public static void main(String[] args) {
        Heroi firstHero = new Heroi("Punho de Ferro", 7000);
        
        firstHero.categorizaHeroi();

        System.out.printf("O Herói de nome %s está no nível %s.\n",
                firstHero.getNome(), firstHero.getNivel());
    }
}
