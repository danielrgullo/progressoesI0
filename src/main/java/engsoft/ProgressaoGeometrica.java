package engsoft;

public class ProgressaoGeometrica extends Progressao {
    
    public ProgressaoGeometrica() {
        // incremento padrao = 2
        this(2);
    }
    
    public ProgressaoGeometrica(int incremento) {
        super(incremento);
    }
    
    @Override
    public int calcula(int indice) {
        if(indice == 0)
            return 1;
        return iesimoTermo(indice - 1) * getIncremento();
    }
}
