package POO.SegundaAula.Animais;

public class Cachorros extends Animal {
    
    //utiliza-se double quando o valor númerico vai ter casas decimais
    //deixar tudo em public para que as outras classes possam ver

   

    //uma variavel static que funciona para todos os objetos, indepedente do seus valoresz
    static int numeroDeCachorros = 0;

    private int tamanhoDoRabo;



    //Os construtores sempre ficam entrem os atributos da classe (variaveis) e os metodos.
    //Os construtores são quem dita como sera feito a construção de um objeto dessa classe. 
    public Cachorros(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, altura, peso,estadoDeEspirito);
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros ++;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
   
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorros.numeroDeCachorros = numeroDeCachorros;
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

    //Override funciona sobreescrevendo um metodo já definido em outra classe para esse objeto.
    @Override
    public String toString() {
        return "Cachorros [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        System.out.println("Au au");
    }

   
}
