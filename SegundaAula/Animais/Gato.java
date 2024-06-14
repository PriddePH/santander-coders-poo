package POO.SegundaAula.Animais;

public class Gato extends Animal {
    
    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        
        numeroDeGatos ++;
    }

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }


    public static void setNumeroDeGatos(int numeroDeGatos) {
        Gato.numeroDeGatos = numeroDeGatos;
    }
    
    @Override
    public String toString() {
        return "Gato [nome=" + nome + "]";
    }
    
    @Override
    public void soar() {
        System.out.println("Miau miau");
    }



}
