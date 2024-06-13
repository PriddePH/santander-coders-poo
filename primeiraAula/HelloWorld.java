package POO.primeiraAula;

public class HelloWorld {

    //Tudo começa pelo método Main, é a primeira parte do código a ser lida
    //metodo Main precisa ser public e static
    //A ordem de public e static não importa podendo ser static public 
    //ao invés de uma array de string podemos usar um varags (String...) e o nome da String não precisa ser args        
    public static void main(String[] args) {
        
        //byte só recebevalor de -128 a 127
        byte variavelByte = 127;
        //shot -32768 32767
        //char 0 a 65535
        //int -2 bilhões a 2 bilhões
        //long - 9 trilhões a 9 trilhões

        int variavelInt = 25609876;
    
        System.out.println(variavelInt * 2);
        System.out.println(variavelByte * 2);
    }

}
