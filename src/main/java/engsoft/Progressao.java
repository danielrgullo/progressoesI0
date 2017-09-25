package engsoft;

import java.util.List;
import java.util.ArrayList;

public abstract class Progressao {
    
    private int indice;
    private int incremento;

    private List<Integer> cache;
        
    public Progressao(int incremento) {
        this.indice = 0;
        this.incremento = incremento;
        this.cache = new ArrayList<Integer>();
    }    
    
    public int inicia() {
        reinicia();
        return proxTermo();
    }
        
    public void reinicia() {
    	this.indice = 0;
        if(this.cache.size() > 0)
            this.cache = new ArrayList<Integer>(); // recriar é mais rapido segundo a internet!
        this.cache.add(0);
    }
    
    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    private void adicionaTermo(int indice, int termo) {
        this.cache.add(indice, termo);
    }
    
    public int proxTermo() {
        return iesimoTermo(indice++);
    }

    public int iesimoTermo(int indice) {
        int termo;

        if(indice < 0) // apenas indices positivos
            indice = 0;

        if(indice == 0) // termo zero deve ser tratato pelo calculo
            return calcula(indice);

        try {
            termo = this.cache.get(indice);
        } catch ( IndexOutOfBoundsException e ) {
            termo = calcula(indice);
            adicionaTermo(indice, termo);
        }
        return termo;
    }  

    public abstract int calcula(int indice);
    
    public String imprimeProgressao(int numeroTermos) {
        String saida="";
        for(int i=0; i <= numeroTermos; i++)
            saida += iesimoTermo(i) + " ";
        return saida.trim() + "\n";
    }
}
