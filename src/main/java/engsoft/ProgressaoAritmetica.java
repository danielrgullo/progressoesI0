package engsoft;

public class ProgressaoAritmetica extends Progressao {

    public ProgressaoAritmetica() {
        // incremento padrao = 1
        this(1);
    }
    
    public ProgressaoAritmetica(int incremento) {
        super(incremento);
    }
   
    @Override
    public int calcula(int indice) {
        if(indice == 0)
            return 0;
        return iesimoTermo(indice - 1) + getIncremento();
    }
}
