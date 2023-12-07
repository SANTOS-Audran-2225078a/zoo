package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lasauce.animaux.Megalodon;

public class MegalodonTest {
    @Test
    public void testManger() {
        // generate test manger
        Megalodon megalodon = new Megalodon("Megalodon", "M", 100, 100, 100);
        megalodon.setFaim(50);
        megalodon.setSante(90);
        megalodon.manger(megalodon.getNomEspece());
        assertEquals(95, megalodon.getSante());
        assertEquals(60, megalodon.isFaim());
    }

    @Test
    public void testSon() {
        //generate test son
        Megalodon megalodon = new Megalodon("Megalodon", "M", 100, 100, 100);
        megalodon.son(megalodon.getNomEspece());

    }

    @Test
    public void testSoin() {
        // generate test soin
        Megalodon megalodon = new Megalodon("Megalodon", "M", 100, 100, 100);
        megalodon.setSante(70);
        megalodon.soin(megalodon.getNomEspece());
        assertEquals(90, megalodon.getSante());
        megalodon.setSante(90);
        megalodon.soin(megalodon.getNomEspece());
        assertEquals(90, megalodon.getSante());
    }

    @Test
    public void testDormir() {
        // generate test dormir
        Megalodon megalodon = new Megalodon("Megalodon", "M", 100, 100, 100);
        megalodon.setSante(70);
        megalodon.dormir(megalodon.getNomEspece());
        assertEquals(90, megalodon.getSante());
        megalodon.setSante(90);
        megalodon.dormir(megalodon.getNomEspece());
        assertEquals(90, megalodon.getSante());
    }

    @Test
    public void testVieillir() {
        // generate test vieillir
        Megalodon megalodon = new Megalodon("Megalodon", "M", 100, 100, 100);
        megalodon.vieillir(megalodon.getNomEspece());
        assertEquals(101, megalodon.getAge());
    }

    @Test
    public void testNager() {
        // generate test nager
        Megalodon megalodon = new Megalodon("Megalodon", "M", 100, 100, 100);
        megalodon.setSante(90);
        megalodon.nager(megalodon.getNomEspece());
        assertEquals(70, megalodon.getSante());
    }
}