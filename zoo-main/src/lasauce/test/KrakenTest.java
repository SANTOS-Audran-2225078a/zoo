package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lasauce.animaux.Kraken;

public class KrakenTest {
    @Test
    public void testManger() {
        // generate test manger
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setFaim(50);
        kraken.setSante(90);
        kraken.manger(kraken.getNomEspece());
        assertEquals(50, kraken.getFaim());
        assertEquals(95, kraken.getSante());
    }

    @Test
    public void testSon() {
        // generate test son
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.son(kraken.getNomEspece());
        assertEquals("Kraken est en train de rugirrrrrrrr", kraken.son(kraken.getNomEspece()));
    }

    @Test
    public void testSoin() {
        // generate test soin
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setSante(70);
        kraken.soin(kraken.getNomEspece());
        assertEquals(90, kraken.getSante());
    }

    @Test
    public void testDormir() {
        // generate test dormir
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setSante(70);
        kraken.dormir(kraken.getNomEspece());
        assertEquals(90, kraken.getSante());
    }

    @Test
    public void testVieillir() {
        // generate test vieillir
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.vieillir(kraken.getNomEspece());
        assertEquals(101, kraken.getAge());
    }

    @Test
    public void testNager() {
        // generate test nager
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setSante(100);
        kraken.nager(kraken.getNomEspece());
        assertEquals(80, kraken.getSante());
    }

    @Test
    public void testGetNomEspece() {
        // generate test nomEspece
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        assertEquals("Kraken", kraken.getNomEspece());
    }

    @Test
    public void testGetSexe() {
        // generate test sexe
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        assertEquals("M", kraken.getSexe());
    }

    @Test
    public void testGetPoids() {
        // generate test poids
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        assertEquals(100.0, kraken.getPoids(), 0.001);
    }

    @Test
    public void testGetTaille() {
        // generate test taille
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        assertEquals(100.0, kraken.getTaille(), 0.001);
    }

    @Test
    public void testGetAge() {
        // generate test age
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        assertEquals(100, kraken.getAge());
    }

    @Test
    public void testGetFaim() {
        // generate test faim
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setFaim(80);
        assertEquals(80, kraken.getFaim());
    }

    @Test
    public void testIsDort() {
        // generate test dort
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setDort(true);
        assertEquals(true, kraken.isDort());
    }

    @Test
    public void testGetSante() {
        // generate test sante
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        assertEquals(100, kraken.getSante());
    }

    @Test
    public void testIsNager() {
        // generate test nager
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setNager(true);
        assertEquals(true, kraken.isNager());
    }

    @Test
    public void testIsPond() {
        // generate test pond
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setPond(true);
        assertEquals(true, kraken.isPond());
    }

    @Test
    public void testSetNomEspece() {
        // generate test nomEspece
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setNomEspece("Kraken");
        assertEquals("Kraken", kraken.getNomEspece());
    }

    @Test
    public void testSetSexe() {
        // generate test sexe
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setSexe("M");
        assertEquals("M", kraken.getSexe());
    }

    @Test
    public void testSetPoids() {
        // generate test poids
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setPoids(100);
        assertEquals(100.0, kraken.getPoids(), 0.001);
    }

    @Test
    public void testSetTaille() {
        // generate test taille
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setTaille(100);
        assertEquals(100.0, kraken.getTaille(), 0.001);
    }

    @Test
    public void testSetAge() {
        // generate test age
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setAge(100);
        assertEquals(100, kraken.getAge());
    }

    @Test
    public void testSetFaim() {
        // generate test faim
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setFaim(80);
        assertEquals(80, kraken.getFaim());
    }

    @Test
    public void testSetDort() {
        // generate test dort
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setDort(true);
        assertEquals(true, kraken.isDort());
    }

    @Test
    public void testSetSante() {
        // generate test sante
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setSante(100);
        assertEquals(100, kraken.getSante());
    }

    @Test
    public void testSetNager() {
        // generate test nager
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setNager(true);
        assertEquals(true, kraken.isNager());
    }

    @Test
    public void testSetPond() {
        // generate test pond
        Kraken kraken = new Kraken("Kraken", "M", 100, 100, 100);
        kraken.setPond(true);
        assertEquals(true, kraken.isPond());
    }
}