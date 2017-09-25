package engsoft;

public class ProgressaoFibonacci extends Progressao {
    
    public ProgressaoFibonacci() {
        // nao tem incremento 
        this(0);
    }
    
    public ProgressaoFibonacci(int incremento) {
        super(incremento);
    }
    
    @Override
    public int calcula(int indice) {
        if(indice == 0 || indice == 1)
            return indice;
        return iesimoTermo(indice - 1) + iesimoTermo(indice - 2);
    }
}
