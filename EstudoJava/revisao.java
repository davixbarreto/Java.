package EstudoJava;

public class revisao {

    public static void main(String[] args) {
        
        String nome = "Davi"; //String é uma classe, são tipos de variaveis relacionadas a objetos e não um valor
        int idade = 19;  //int são variaveis numericas
        char sexo = 'M'; //Uma variável do tipo char armazena um caractere Unicode. Um caractere Unicode é um caractere de 16 bits, sendo que de 0 a 225 correspondem aos caracteres do código ASCII

        //System.out são objetos de saidas
        // System.out.println(), gera uma saída de texto entre aspas duplas significando uma String, criando uma nova linha e posicionando o cursor na linha abaixo, o que é identificado pela terminação
        //O método com print, se for observado não possui o “ln”, por isso exibe uma String sem criar uma nova linha, deixando o seu cursor na mesma linha. Saída de uma String com o System.out.print, imprime a 2ª linha do lado da 1ª linha
        //O argumento do método printf é uma String de formato que pode consistir em texto fixo e especificadores de formato. A letra “f” no final da palavra “print” significa “formatted” ou seja exibe os dados formatados.Os especificadores de formato são como marcadores de lugares para um valor, especificando o tipo da saída dos dados que iniciam com um sinal de porcentagem (%) seguido por um caractere representando seu tipo de dado.
        System.out.println("DADOS DO CADASTRO..."); 
        System.out.printf("%s, mas conhecido como HANGY e tem a idade de %d anos\n",nome, idade);
        System.out.printf("Também é do sexo: %c",sexo);

    
    
    
    
    


    }

}