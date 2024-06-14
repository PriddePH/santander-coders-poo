package POO.SegundaAula.Animais;

//usamos abstract aqui para que um objeto n possa ser criado a partir dela.
public abstract class Animal {
    
    //usando protected ao invés de private para que as classes filhas de Animal, possam acesar esses valores
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;

    
    protected String estadoDeEspirito;
    
    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
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

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer() {}

    protected void dormir() {}

    //usando abstract aqui eu falo que cada objeto criado apartir dessa classe, precisa implementar o seu proprio metodo soar
    public abstract void soar();
    
   
}
