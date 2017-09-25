package engsoft;

import junit.framework.TestCase;

public class ProgressaoTest extends TestCase { 

    public void testProgressaoAritmetica() {
        Progressao p = new ProgressaoAritmetica();
        assertEquals(0, p.inicia());        
        assertEquals(1, p.proxTermo());
        assertEquals(2, p.proxTermo());
        assertEquals(4, p.iesimoTermo(4));
        assertEquals(6, p.iesimoTermo(6));
        assertEquals("0 1 2 3 4 5 6 7 8 9 10\n",
                     p.imprimeProgressao(10));

        p = new ProgressaoAritmetica(5);
        assertEquals(0, p.inicia());
        assertEquals(5, p.proxTermo());
        assertEquals(10, p.proxTermo());
        assertEquals(20, p.iesimoTermo(4));
        assertEquals(30, p.iesimoTermo(6));
        assertEquals("0 5 10 15 20 25 30 35 40 45 50\n",
                     p.imprimeProgressao(10));
    }

    public void testProgressaoGeometrica() {
        Progressao p = new ProgressaoGeometrica();
        assertEquals(1, p.inicia());
        assertEquals(2, p.proxTermo());
        assertEquals(4, p.proxTermo());
        assertEquals(16, p.iesimoTermo(4));
        assertEquals(64, p.iesimoTermo(6));
        assertEquals("1 2 4 8 16 32 64 128 256 512 1024\n",
                     p.imprimeProgressao(10));

        p = new ProgressaoGeometrica(5);
        assertEquals(1, p.inicia());
        assertEquals(5, p.proxTermo());
        assertEquals(25, p.proxTermo());
        assertEquals(625, p.iesimoTermo(4));
        assertEquals(15625, p.iesimoTermo(6));
        assertEquals("1 5 25 125 625 3125 15625 78125 390625 1953125 9765625\n",
                     p.imprimeProgressao(10));
    }

    public void testeProgressaoFibonacci() {
         Progressao p = new ProgressaoFibonacci();
         assertEquals(0, p.inicia());
         assertEquals(1, p.proxTermo());
         assertEquals(1, p.proxTermo());
         assertEquals(2, p.proxTermo());
         assertEquals(13, p.iesimoTermo(7));
         assertEquals(55, p.iesimoTermo(10));
         assertEquals(233, p.iesimoTermo(13));
         assertEquals("0 1 1 2 3 5 8 13 21 34 55\n",
                      p.imprimeProgressao(10));
    }
}



