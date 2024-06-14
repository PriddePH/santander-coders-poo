package POO.SegundaAula.Lojas;

import POO.SegundaAula.Animais.Animal;
import POO.SegundaAula.Animais.Cachorros;

public class Petshop {
    
    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorros cachorros) {
        cachorros.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("com saudades");
    }
}
