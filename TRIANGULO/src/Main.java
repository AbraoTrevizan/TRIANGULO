import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class FuncoesUteis {

    // vai fazer a soma 
    public int Soma(int a, int b) {
        return a + b;
    }

    // vai mostrar o triangulo com a altura escolida
    public void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // vai imprimir o conteudo no arquivo escolido
    public void printArquivo(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();
        Scanner scanner = new Scanner(System.in);

        // vai estar perguntando para o usuario digitar os numeros para serem somados
        System.out.print("Digite o primeiro número para a soma: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número para a soma: ");
        int numero2 = scanner.nextInt();
        int resultadoSoma = funcoes.Soma(numero1, numero2);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // pergunta ao usuario quel altura ele ira querer do triangulo
        System.out.print("Digite a altura do triângulo: ");
        int altura = scanner.nextInt();
        System.out.println("Triângulo de altura " + altura + ":");
        funcoes.Triangulo(altura);

        // vai perguntar ao usuarios as coisas do arquivo como qual o caminho e qual o conteudo do arquivo
        System.out.print("Digite o caminho do arquivo: ");
        String caminhoDoArquivo = scanner.next();
        System.out.println("Conteúdo do arquivo:");
        funcoes.printArquivo(caminhoDoArquivo);

        scanner.close();
    }
}


