package EstudoJava;

import java.util.Locale;
import java.util.Scanner;


public class revisao2 {

 public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //A classe Scanner tem como objetivo separar a entrada dos textos em blocos, gerando os conhecidos tokens, que são sequências de caracteres separados por delimitadores que por padrão correspondem aos espaços em branco, tabulações e mudança de linha.

    String nome;
    int idade;
    double salario;

    nome = sc.next();
    idade = sc.nextInt();
    salario = sc.nextDouble();

    System.out.println("DADOS DO CADASTRO ENCONTRADOS: ");
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(salario);

    sc.close();
    
}
    
}
