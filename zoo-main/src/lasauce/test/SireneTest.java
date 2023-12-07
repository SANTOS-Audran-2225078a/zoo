package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lasauce.animaux.Sirene;

public class SireneTest {
    @Test
    public void testManger() {
        // generate test manger
        Sirene sirene = new Sirene("Sirene", "F", 50, 150, 20);
        sirene.setFaim(50);
        sirene.setSante(90);
        sirene.manger(sirene.getNomEspece());
        assertEquals(60, sirene.getFaim());
        assertEquals(95, sirene.getSante());
    }

    @Test
    public void testSon() {
        // generate test son
        Sirene sirene = new Sirene("Sirene", "M", 100, 100, 100);
        sirene.son(sirene.getNomEspece());
        assertEquals("Sirene est en train de rugirrrrrrrr", sirene.son(sirene.getNomEspece()));
    }

    // Modify the son method to return a String
    public String son(String nomEspece) {
        // Implementation of the son method
        return nomEspece + " fait du sonnnnn";
    }

    @Test
    public void testSoin() {
        // generate test soin
        Sirene sirene = new Sirene("Sirene", "F", 50, 150, 20);
        sirene.setSante(70);
        sirene.soin(sirene.getNomEspece());
        assertEquals(90, sirene.getSante());
    }

    @Test
    public void testDormir() {
        // generate test dormir
        Sirene sirene = new Sirene("Sirene", "F", 50, 150, 20);
        sirene.setSante(70);
        sirene.dormir(sirene.getNomEspece());
        assertEquals(90, sirene.getSante());
    }

    @Test
    public void testVieillir() {
        // generate test vieillir
        Sirene sirene = new Sirene("Sirene", "F", 50, 150, 20);
        sirene.setAge(20);
        sirene.vieillir(sirene.getNomEspece());
        assertEquals(21, sirene.getAge());
    }

    @Test
    public void testNager() {
        // generate test nager
        Sirene sirene = new Sirene("Sirene", "F", 50, 150, 20);
        sirene.setSante(90);
        sirene.nager(sirene.getNomEspece());
        assertEquals(70, sirene.getSante());
    }
}