package Lista_de_exercicio.Criacao_de_classes.Q30;

public class CalculaMaior {
    
    static int max(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    static int max(int a,int b,int c){
        if(a > b && a> c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }

    static int max(int a,int b,int c,int d){
        if(a > b && a > c && a > d){
            return a;
        }else if(b > a && b > c && b > d){
            return b;
        }else if(c > a && c > b && c > d){
            return c;
        }else{
            return d;
        }
    }

    static int max(int a,int b,int c,int d,int e){
        if(a > b && a > c && a > d && a > e){
            return a;
        }else if(b > a && b > c && b > d && b > e){
            return b;
        }else if(c > a && c > b && c > d && c > e){
            return c;
        }else if(d > a && d > b && d > c && d > e){
            return d;
        }else{
            return e;
        }
    }

    static double max(double a,double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    static double max(double a,double b,double c){
        if(a > b && a> c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }

    static double max(double a,double b,double c,double d){
        if(a > b && a > c && a > d){
            return a;
        }else if(b > a && b > c && b > d){
            return b;
        }else if(c > a && c > b && c > d){
            return c;
        }else{
            return d;
        }
    }

    static double max(double a,double b,double c,double d,double e){
        if(a > b && a > c && a > d && a > e){
            return a;
        }else if(b > a && b > c && b > d && b > e){
            return b;
        }else if(c > a && c > b && c > d && c > e){
            return c;
        }else if(d > a && d > b && d > c && d > e){
            return d;
        }else{
            return e;
        }
    }
}
