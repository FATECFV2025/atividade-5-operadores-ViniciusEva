import java.util.Scanner;

    public class Calculadora {

        public static void funcao_teste (){
            Scanner ler = new Scanner(System.in);

            Operadores op = new Operadores();

            System.out.println("=== CALCULADORA JAVA ===");

            System.out.print("Digite o primeiro valor: ");
            float v1 = ler.nextFloat();

            System.out.print("Digite o segundo valor: ");
            float v2 = ler.nextFloat();

            System.out.println("\n Operadores aritméticos ");
            System.out.println("Adição: " + op.adicao(v1, v2));
            System.out.println("Subtração: " + op.subtracao(v1, v2));
            System.out.println("Multiplicação: " + op.multiplicacao(v1, v2));
            System.out.println("Divisão: " + op.divisao(v1, v2));
            System.out.println("Resto: " + op.resto(v1, v2));

            System.out.println("\n Operadores de atribuição");
            System.out.println("Atribuição (=): " + op.atribuicao(v1, v2));
            System.out.println("Atribuição soma (+=): " + op.atribuicaoSoma(v1, v2));
            System.out.println("Atribuição subtração (-=): " + op.atribuicaoSubtracao(v1, v2));
            System.out.println("Atribuição multiplicação (*=): " + op.atribuicaoMultiplicacao(v1, v2));
            System.out.println("Atribuição divisão (/=): " + op.atribuicaoDivisao(v1, v2));
            System.out.println("Atribuição resto (%=): " + op.atribuicaoResto(v1, v2));

            System.out.println("\n Operadores lógico ");
            System.out.println("E  (v1 == 0 && v2 == 0): " + op.e(v1, v2));
            System.out.println("OU (v1 == 0 || v2 == 0): " + op.ou(v1, v2));

            System.out.println("\n Operadores comparação ");
            System.out.println("Igual: " + op.igual(v1, v2));
            System.out.println("Diferente: " + op.diferente(v1, v2));
            System.out.println("Maior: " + op.maior(v1, v2));
            System.out.println("Menor: " + op.menor(v1, v2));
            System.out.println("Maior ou igual: " + op.maiorIgual(v1, v2));
            System.out.println("Menor ou igual: " + op.menorIgual(v1, v2));

            ler.close();
        }
        public static void main(String[] args) throws Exception {
            funcao_teste();


        }

    }