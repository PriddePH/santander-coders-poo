package POO.SegundaAula;

import POO.SegundaAula.Animais.Cachorros;
import POO.SegundaAula.Animais.Gato;
import POO.SegundaAula.Lojas.Petshop;

//public class : todos os arquivos e pacotes do seu projeto tem acesso a classes pubicas
//protected class : pode ser acessado pela mesma classe, qualquer classe no mesmo pacote e qualquer filho estando no mesmo pacote ou não
//default class (sem nada): pode ser acessado pela mesma classe, qualquer classe no mesmo pacote e qualquer filho no mesmo pacote, filhos em outros pacotes n conseguem acessa-lo
//private class: apenas a mesma classe pode acessa-lo 
public class Classes {
    //uma classe é a definição do objeto não o objeto em sí

    public static void main(String[] args) {
        
        //Define a classe que esta construindo e cria um novo objeto 
        Cachorros cachorrosUm = new Cachorros("Quimera", "Preto", 35, 3, 5, "Nada");
        Cachorros cachorroDois = new Cachorros("Pitty", "Laranja", 50, 4.2, 3, "Nada");

        Gato gatoUm = new Gato("Max", "cinza", 20, 1.5, "Nada");
    
        Petshop petshop = new Petshop();

        petshop.darBanho(cachorrosUm);
        System.out.println(cachorrosUm.getEstadoDeEspirito());

        petshop.darBanho(gatoUm);
        System.out.println(gatoUm.getEstadoDeEspirito());

        petshop.tosar(cachorrosUm);
        System.out.println(cachorrosUm.getEstadoDeEspirito());

        System.out.println(cachorrosUm.toString());
        System.out.println(cachorroDois.toString());
        System.out.println(gatoUm.toString());

        cachorrosUm.soar();
        gatoUm.soar();

        //Entrando dentro do objeto cachorroUm e chamando um método(função)
        System.out.println("O cachorro pegou uma " + cachorroDois.pegar("Bolinha"));
        System.out.println("O cachorro está " + cachorroDois.interagir("brigar"));
        System.out.println("O cachorro está " + cachorroDois.interagir("carinho"));
    }
}
