package Lista_de_exercicio.Array_e_ArrayLists.Q35;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int id,idade;
        String nome,telefone;
        Scanner scan = new Scanner(System.in);

        do{

            System.out.print("Digite o nome do cliente: ");
            nome = scan.nextLine();
            System.out.print("Digite o telefone do cliente: ");
            telefone = scan.nextLine();
            System.out.print("Digite a idade do cliente: ");
            idade = scan.nextInt();
            System.out.print("Digite o id do cliente: ");
            id = scan.nextInt();
            if(id >= 0){
                clientes.add(new Cliente(id, nome, idade, telefone));
            }

        }while(id >= 0);

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }

        scan.close();
    }
}
