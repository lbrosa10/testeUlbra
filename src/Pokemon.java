public class Pokemon {
    //Atributos
    public String tipo;
    public String nome;
    public double peso;

    //métodos
    public void atacar(){
        System.out.println("Ataque");
    }
    public void defender(){
        System.out.println("Defesa");
    }

    //construtores
    public Pokemon(){

    }
    public Pokemon(String nome){
        this.nome=nome;
    }

}
