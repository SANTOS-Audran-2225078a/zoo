package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lasauce.animaux.Nymphe;

public class NympheTest {
    @Test
    public void testManger() {
        // generate test manger
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setSante(90);
        nymphe.setFaim(80);
        nymphe.manger(nymphe.getNomEspece());
        assertEquals(95, nymphe.getSante());
        assertEquals(90, nymphe.getFaim());
    }

    @Test
    public void testSon() {
        // generate test son
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setFaim(40);
        nymphe.son(nymphe.getNomEspece());
        // Add assertion here
    }

    @Test
    public void testSoin() {
        // generate test soin
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setSante(70);
        nymphe.soin(nymphe.getNomEspece());
        assertEquals(90, nymphe.getSante());
    }

    @Test
    public void testDormir() {
        // generate test dormir
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setSante(70);
        nymphe.dormir(nymphe.getNomEspece());
        assertEquals(90, nymphe.getSante());
    }

    @Test
    public void testVieillir() {
        // generate test vieillir
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.vieillir(nymphe.getNomEspece());
        assertEquals(11, nymphe.getAge());
    }

    @Test
    public void testGetNomEspece() {
        // generate test nomEspece
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        assertEquals("Nymphe", nymphe.getNomEspece());
    }

    @Test
    public void testSetNomEspece() {
        // generate test nomEspece
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setNomEspece("New Nymphe");
        assertEquals("New Nymphe", nymphe.getNomEspece());
    }

    @Test
    public void testGetSexe() {
        // generate test sexe
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        assertEquals("F", nymphe.getSexe());
    }

    @Test
    public void testSetSexe() {
        // generate test sexe
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setSexe("M");
        assertEquals("M", nymphe.getSexe());
    }

    @Test
    public void testGetPoids() {
        // generate test poids
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        assertEquals(50.0, nymphe.getPoids(), 0.001);
    }

    @Test
    public void testSetPoids() {
        // generate test poids
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setPoids(60);
        assertEquals(60.0, nymphe.getPoids(), 0.001);
    }

    @Test
    public void testGetTaille() {
        // generate test taille
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        assertEquals(50.0, nymphe.getTaille(), 0.001);
    }

    @Test
    public void testSetTaille() {
        // generate test taille
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setTaille(60);
        assertEquals(60.0, nymphe.getTaille(), 0.001);
    }

    @Test
    public void testGetAge() {
        // generate test age
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        assertEquals(10, nymphe.getAge());
    }

    @Test
    public void testSetAge() {
        // generate test age
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setAge(11);
        assertEquals(11, nymphe.getAge());
    }

    @Test
    public void testIsFaim() {
        // generate test faim
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setFaim(80);
        assertEquals(80, nymphe.isFaim());
    }

    @Test
    public void testSetFaim() {
        // generate test faim
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setFaim(90);
        assertEquals(90, nymphe.isFaim());
    }

    @Test
    public void testIsDort() {
        // generate test dort
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setDort(true);
        assertEquals(true, nymphe.isDort());
    }

    @Test
    public void testSetDort() {
        // generate test dort
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setDort(true);
        assertEquals(true, nymphe.isDort());
    }

    @Test
    public void testGetSante() {
        // generate test sante
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        assertEquals(100, nymphe.getSante());
    }

    @Test
    public void testSetSante() {
        // generate test sante
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setSante(90);
        assertEquals(90, nymphe.getSante());
    }

    @Test
    public void testIsAccoucher() {
        // generate test accoucher
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setAccoucher(true);
        assertEquals(true, nymphe.isAccoucher());
    }

    @Test
    public void testSetAccoucher() {
        // generate test accoucher
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setAccoucher(true);
        assertEquals(true, nymphe.isAccoucher());
    }

    @Test
    public void testIsRenaitre() {
        // generate test renaitre
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setRenaitre(true);
        assertEquals(true, nymphe.isRenaitre());
    }

    @Test
    public void testSetRenaitre() {
        // generate test renaitre
        Nymphe nymphe = new Nymphe("Nymphe", "F", 50, 50, 10);
        nymphe.setRenaitre(true);
        assertEquals(true, nymphe.isRenaitre());
    }
}