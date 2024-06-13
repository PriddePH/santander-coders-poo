package POO.SegundaAula.Animais;

public class Cachorros {
    
    //utiliza-se double quando o valor númerico vai ter casas decimais
    //deixar tudo em public para que as outras classes possam ver

    //uma variavel static que funciona para todos os objetos, indepedente do seus valores
    static int numeroDeCachorros = 0;

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    private String estadoDeEspirito;

    //Os construtores sempre ficam entrem os atributos da classe (variaveis) e os metodos.
    //Os construtores são quem dita como sera feito a construção de um objeto dessa classe. 
    public Cachorros(){} //construtor padrão que fica com os atributos padrões

    public Cachorros(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    //Metodo Get: eu estou retornando o tipo da váriavel e para isso eu tenho que usar get + nome da variavel (cammelCase)
    //Metodo Set: eu consigo escolher quem pode setar/escolher qual o valor da váriavel, assim como set, eu utilizo getNomeDaVariavel;
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        //Aqui estou limitando quais nomes podem ser aceitos, por exemplo, se tentarem setar o nome como Eren, ele vai retornar nulo.
        if(nome.equalsIgnoreCase("Eren")) {
            this.nome = null;
        }

         //usando o this, eu consigo dizer para o java que a primeira variavel nome, é o atributo dessa classe que estamos, resumindo a variavel private lá em cima.
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
   
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorros.numeroDeCachorros = numeroDeCachorros;
    }

    public void comer(){}

    public void latir() {
        System.out.println("AU AU AU AU");
    }

    //para um método que vai retornar um valor, é preciso declar qual o tipo desse valor (string e etc)
    //e pedir para retornar o mesmo tipo 
    public String pegar(String objeto) {
        return objeto;
    }

    public String interagir(String acao) {

        //num switch a gente só usa o tipo int, string e enum.
        switch (acao) {

            case "carinho": this.estadoDeEspirito = "feliz"; 
            break;
            case "vai dormir": this.estadoDeEspirito = "bravo";
            break;
            case "pisar na pata": 
            case "brigar":  
            this.estadoDeEspirito = "choroso";
            break;
            case "Vamos passear": this.estadoDeEspirito = "ANIMADO!!"; 
            break;
            default: this.estadoDeEspirito = "de Boa";

        }

        return this.estadoDeEspirito;

    }

    //definindo qual o toString dos objetos
    @Override
    public String toString() {
        return "Cachorros [nome=" + nome + "]";
    }

}
