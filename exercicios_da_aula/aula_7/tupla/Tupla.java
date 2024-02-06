package exercicios_da_aula.aula_7.tupla;

public class Tupla <F, S> {
    private F v1;
    private S v2;

    Tupla(F v1, S v2){
        this.v1 = v1;
        this.v2 = v2;
    }
    
    public S getV2() {
        return v2;
    }

    public void setV2(S v2) {
        this.v2 = v2;
    }


    public F getV1(){
        return v1;
    }
    public void setV1(F novov1){
        this.v1 = novov1;
    }
}
