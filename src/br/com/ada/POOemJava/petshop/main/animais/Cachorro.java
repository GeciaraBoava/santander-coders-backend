package br.com.ada.POOemJava.petshop.main.animais;

public class Cachorro extends Animal { //a classe Cachorro herda características da classe Animal

    //variaveis
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    //construtor padrão, genérico (o sistema cria mesmo se o dev não criar):
    //public Cachorro() {};

    //construtor definido pelo usuário:
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++; //adiciona 1 na variável toda vez que for criado um objeto Cachorro
    }

    //metodos
    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}

    public int getAltura() {return altura;}
    public void setAltura(int altura) {this.altura = altura;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public int getTamanhoDoRabo() {return tamanhoDoRabo;}
    public void setTamanhoDoRabo(int tamanhoDoRabo) {this.tamanhoDoRabo = tamanhoDoRabo;}

    public String getEstadoDeEspirito() {return estadoDeEspirito;}
    public void setEstadoDeEspirito(String estadoDeEspirito) {this.estadoDeEspirito = estadoDeEspirito;}

    public static int getNumeroDeCachorros() {return numeroDeCachorros;}
    public static void setNumeroDeCachorros(int numeroDeCachorros) {Cachorro.numeroDeCachorros = numeroDeCachorros;}

    public String pegar(){return "bolinha";}

    public String interagir(String acao){
        switch (acao) { //switch funciona com int, String e enum (pesquisar enum)
            case "carinho":this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;
        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() { //utilizado para identificar o objeto
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU!!");
    }
}
