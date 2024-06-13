package POO.SegundaAula;

import POO.SegundaAula.Animais.Cachorros;

//public class : todos os arquivos e pacotes do seu projeto tem acesso a classes pubicas
//protected class : pode ser acessado pela mesma classe, qualquer classe no mesmo pacote e qualquer filho estando no mesmo pacote ou não
//default class (sem nada): pode ser acessado pela mesma classe, qualquer classe no mesmo pacote e qualquer filho no mesmo pacote, filhos em outros pacotes n conseguem acessa-lo
//private class: apenas a mesma classe pode acessa-lo 
public class Classes {
    //uma classe é a definição do objeto não o objeto em sí

    public static void main(String[] args) {
        
        //Define a classe que esta construindo e cria um novo objeto 
        Cachorros cachorrosUm = new Cachorros("Quimera", "Preto", 50, 6.7, 5, "nada");
        Cachorros cachorroDois = new Cachorros("Quimera", "Preto", 50, 6.7, 5, "nada");
        
        System.out.println(cachorrosUm.toString());
        System.out.println(cachorroDois.toString());

        //Entrando dentro do objeto cachorroUm e chamando um método(função)
        cachorroDois.latir();
        System.out.println("O cachorro pegou uma " + cachorroDois.pegar("Bolinha"));
        System.out.println("O cachorro está " + cachorroDois.interagir("brigar"));
        System.out.println("O cachorro está " + cachorroDois.interagir("carinho"));
    }
}
