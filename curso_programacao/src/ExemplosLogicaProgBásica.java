import java.util.Locale;
import java.util.Scanner;

public class ExemplosLogicaProgB�sica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void exemploEntradaDados() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		String v;
		int y;
		double z;
		char w;

		w = sc.next().charAt(0);
		x = sc.next();
		sc.nextLine();
		v = sc.nextLine();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Voc� digitou : ");

		System.out.println(w);
		System.out.println(x);
		System.out.println(v);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

	public static void exemploCast() {
		double b, B, h, area;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.println(area);

		int a, c;
		double resultado;

		a = 5;
		c = 2;

		resultado = (double) a / c;
		System.out.println(resultado);

	}

	public static void Exercicio1() {
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s which price is R$ %.2f%n", product1, price1);
		System.out.printf("%s which price is R$ %.2f%n", product2, price2);
		System.out.println("");
		System.out.printf("Record: %d years old, code: %d, gender: %s%n", age, code, gender);
		System.out.println("");
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

	public static void exemplos() {
		/*
		 * System.out.println("Hello World");
		 * 
		 * int valor = 35; double valorQuebrado = 10.54682;
		 * 
		 * System.out.println(valor); System.out.println(valorQuebrado);
		 * 
		 * //printf formata System.out.printf("%.2f%n", valorQuebrado);
		 * 
		 * // seta a localizacao, muda o padra pra do eclipse pra US
		 * Locale.setDefault(Locale.US); System.out.printf("%.4f%n", valorQuebrado);
		 * 
		 * System.out.println("Resultado = " + valor + " metros");
		 * 
		 * // substitui o argumento pelo %
		 * System.out.printf("Resultado = %.2f metros%n", valorQuebrado);
		 * 
		 * String nome = "Juca"; int idade = 22; double salario = 400.23;
		 * 
		 * // impressao de varios valores interpolados em uma string
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,
		 * salario);
		 * 
		 * System.out.println("");
		 */
	}

	public static void exemploAtribuicao() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}

		System.out.printf("Valor Conta : %.2f%n", conta);

		sc.close();
	}

	public static void exemploSwitch() {
		Scanner sc = new Scanner(System.in);

		int dia = sc.nextInt();
		String nomeDia;

		switch (dia) {
		case 1:
			nomeDia = "segunda";
			break;
		case 2:
			nomeDia = "ter�a";
			break;
		case 3:
			nomeDia = "quarta";
			break;
		case 4:
			nomeDia = "quinta";
			break;
		case 5:
			nomeDia = "sexta";
			break;
		case 6:
			nomeDia = "sabado";
			break;
		case 7:
			nomeDia = "domingo";
			break;
		default:
			nomeDia = "Valor inv�lido";
			break;
		}

		System.out.println("Dia da semana: " + nomeDia);

		sc.close();
	}

	public static void ifTernario() {
		double preco = 34.5;
		// condi�ao tern�ria (condicao) ? valor se true : valor se false
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);
	}
	
	public static void DebugExemplo() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//clicar na linha e apertar crtl + shift + b
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}
	
	public static void ExemploComandosString() {
String original = "ABCD FGHIJ ABC DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('A', 'X');
		String s07 = original.replace("ABC", "XXX");
		int i = original.indexOf("BC");
		int j = original.lastIndexOf("BC");
		
		System.out.println("Original: " + original + "-");
		System.out.println("tolowerCase: " + s01 + "-");
		System.out.println("toUpperCase: " + s02 + "-");
		System.out.println("Trim: " + s03 + "-");
		System.out.println("Substring: " + s04 + "-");
		System.out.println("Substring 2 : " + s05 + "-");
		System.out.println("Replace: " + s06 + "-");
		System.out.println("Replace 2: " + s07 + "-");
		System.out.println("IndexOF: " + i);
		System.out.println("LastIndexOf: " + j);
		
		//SPLIT
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println("");
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
