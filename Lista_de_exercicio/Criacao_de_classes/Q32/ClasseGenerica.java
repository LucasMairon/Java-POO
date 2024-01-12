package Lista_de_exercicio.Criacao_de_classes.Q32;

public class ClasseGenerica {
    static int n1;
    static int n2;
    static int n3;

    public ClasseGenerica(){

    }
    public ClasseGenerica(int a,int b,int c){
        n1 = a;
        n2 = b;
        n3 = c;
    }

    public int CalculaQuantosIguais(){
        if( n1 == n2 && n1 == n3){
            return 3;
        }else if( n1 != n2 && n1 == n3){
            return 2;
        }else if( n1 == n2 && n1 != n3){
            return 2;
        }else{
            return 0;
        }
    }

    public void ImprimeValores(){
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.print("\n");
    }

    
}
