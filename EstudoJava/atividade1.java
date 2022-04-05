package EstudoJava;

import java.util.Locale; // para usar a opção "locale" precisa importa-lo

public class atividade1 {

	public static void main(String[] args) {
		
		String produto1 = "Pc gamer";
		String produto2 = "Notebook";
		
		byte idade = 2;
		int senha = 2432;
		char sexo = 'F';
		
		double preço1 = 3200.0;
		double preço2 = 2500.0;
		double medida = 53.3213232;
		
		System.out.println("Produtos: ");
		System.out.printf("%s, custa em média um preço de R$ %.2f\n", produto1,preço1);
		System.out.printf("\n %s, está custando um pouco mais barato com preço de R$ %.2f\n", produto2,preço2);
		System.out.println();
        System.out.printf("Possuindo Recorde de %d anos , senha %d e sexo: %c\n", idade, senha, sexo);
        System.out.println();
        System.out.printf("Medida decimal: %.8f\n", medida);
        System.out.printf("rouded (três casas decimais): %.3f\n", medida);
        Locale.setDefault(Locale.US); // utilizado para trocar a virgula pelo ponto, isso muda a linguagem da escrita.
        System.out.printf("US decimal ponto: %.3f\n", medida);

 
	}
	

}
