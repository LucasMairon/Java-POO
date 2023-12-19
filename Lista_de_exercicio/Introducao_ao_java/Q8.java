package Lista_de_exercicio.Introducao_ao_javaIntroducao_ao_java;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite o código do setor: ");
        int codigo = scan.nextInt();
        System.out.print("digite o valor da peça: ");
        double valorDoProduto = scan.nextDouble();

        switch(codigo){
            case 111:
                if(valorDoProduto > 100){
                    valorDoProduto = valorDoProduto - (valorDoProduto * 0.4);
                }else if(valorDoProduto >= 50 && valorDoProduto <= 100){
                    valorDoProduto = valorDoProduto - (valorDoProduto * 0.2);
                }else if(valorDoProduto < 50){
                    valorDoProduto = valorDoProduto - (valorDoProduto * 0.1);
                }
                System.out.println("Setor de Cama,mesa e banho:");
                System.out.println("valor do produto: " + valorDoProduto);
            break;
            case 222:
                if(valorDoProduto > 500){
                    valorDoProduto = valorDoProduto - (valorDoProduto * 0.1);
                }
                System.out.println("Setor de eletros:");
                System.out.println("valor do produto: " + valorDoProduto);
            break;
            default:
                System.out.println("Setor invalido");
            break;
        }
        scan.close();
    }
}
