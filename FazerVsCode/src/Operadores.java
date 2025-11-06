public class Operadores {

    // Operadores aritméticos

    public float adicao(float v1, float v2){
        return  v1 + v2;
    }

    public float subtracao (float v1, float v2){
        return v1 - v2;
    }

    public float multiplicacao (float v1, float v2){
        return v1 * v2;
    }

    public float divisao (float v1, float v2){
        return v1 / v2;
    }

    public float resto (float v1, float v2){
        return v1%v2;
    }

    // Operadores de atribuição

    public float atribuicao (float v1, float v2){
        return v1 = v2;
    }

    public float atribuicaoSoma (float v1, float v2){
        return v1 += v2;
    }

    public float atribuicaoSubtracao (float v1, float v2){
        return v1 -= v2;
    }

    public float atribuicaoMultiplicacao (float v1, float v2){
        return v1 *= v2;
    }

    public float atribuicaoDivisao (float v1, float v2){
        return v1 /= v2;
    }

    public float atribuicaoResto (float v1, float v2){
        return v1 %= v2;
    }

    // Operadores lógico

    public boolean e (float v1, float v2){
        return v1 == 0 && v2  == 0;
    }

    public boolean ou (float v1, float v2){
        return v1 == 0 || v2  == 0;
    }

    // Operadores comparação

    public boolean igual (float v1, float v2){
        return v1 == v2 ;
    }

    public boolean diferente (float v1, float v2){
        return v1 != v2;
    }

    public boolean maior (float v1, float v2){
        return v1 > v2;
    }

    public boolean menor (float v1, float v2){
        return v1 < v2  ;
    }

    public boolean maiorIgual (float v1, float v2){
        return v1 >= v2;
    }

    public boolean menorIgual (float v1, float v2){
        return v1 <= v2 ;
    }


}