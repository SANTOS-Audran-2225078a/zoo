package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lasauce.animaux.Licorne;

public class LicorneTest {
    @Test
    public void testManger() {
        // generate test manger
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setFaim(50);
        licorne.setSante(90);
        licorne.manger(licorne.getNomEspece());
        assertEquals(95, licorne.getSante());
        assertEquals(50, licorne.getFaim());
    }

    @Test
    public void testSon() {
        // generate test son
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setFaim(70);
        licorne.son(licorne.getNomEspece());
    }

    @Test
    public void testSoin() {
        // generate test soin
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setSante(70);
        licorne.soin(licorne.getNomEspece());
        assertEquals(90, licorne.getSante());
    }

    @Test
    public void testDormir() {
        // generate test dormir
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setSante(70);
        licorne.dormir(licorne.getNomEspece());
        assertEquals(90, licorne.getSante());
    }

    @Test
    public void testVieillir() {
        // generate test vieillir
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setAge(100);
        licorne.vieillir(licorne.getNomEspece());
        assertEquals(101, licorne.getAge());
    }

    @Test
    public void testCourrir() {
        // generate test courrir
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setSante(100);
        licorne.courrir(licorne.getNomEspece());
        assertEquals(80, licorne.getSante());
    }

    @Test
    public void testGetNomEspece() {
        // generate test nomEspece
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        assertEquals("Licorne", licorne.getNomEspece());
    }

    @Test
    public void testGetSexe() {
        // generate test sexe
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        assertEquals("F", licorne.getSexe());
    }

    @Test
    public void testGetPoids() {
        // generate test poids
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        assertEquals(100.0, licorne.getPoids(), 0.001);
    }

    @Test
    public void testGetTaille() {
        // generate test taille
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        assertEquals(100.0, licorne.getTaille(), 0.001);
    }

    @Test
    public void testGetAge() {
        // generate test age
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        assertEquals(100, licorne.getAge());
    }

    @Test
    public void testIsFaim() {
        // generate test faim
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setFaim(100);
        assertEquals(100, licorne.isFaim());
    }

    @Test
    public void testIsDort() {
        // generate test dort
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setDort(true);
        assertEquals(true, licorne.isDort());
    }

    @Test
    public void testGetSante() {
        // generate test sante
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        assertEquals(100, licorne.getSante());
    }

    @Test
    public void testIsCourrir() {
        // generate test courrir
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setCourrir(true);
        assertEquals(true, licorne.isCourrir());
    }

    @Test
    public void testIsAccoucher() {
        // generate test accoucher
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setAccoucher(true);
        assertEquals(true, licorne.isAccoucher());
    }

    @Test
    public void testSetNomEspece() {
        // generate test nomEspece
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setNomEspece("Licorne");
        assertEquals("Licorne", licorne.getNomEspece());
    }

    @Test
    public void testSetSexe() {
        // generate test sexe
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setSexe("F");
        assertEquals("F", licorne.getSexe());
    }

    @Test
    public void testSetPoids() {
        // generate test poids
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setPoids(100);
        assertEquals(100.0, licorne.getPoids(), 0.001);
    }

    @Test
    public void testSetTaille() {
        // generate test taille
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setTaille(100);
        assertEquals(100.0, licorne.getTaille(), 0.001);
    }

    @Test
    public void testSetAge() {
        // generate test age
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setAge(100);
        assertEquals(100, licorne.getAge());
    }

    @Test
    public void testSetFaim() {
        // generate test faim
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setFaim(100);
        assertEquals(100, licorne.isFaim());
    }

    @Test
    public void testSetDort() {
        // generate test dort
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setDort(true);
        assertEquals(true, licorne.isDort());
    }

    @Test
    public void testSetSante() {
        // generate test sante
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setSante(100);
        assertEquals(100, licorne.getSante());
    }

    @Test
    public void testSetCourrir() {
        // generate test courrir
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setCourrir(true);
        assertEquals(true, licorne.isCourrir());
    }

    @Test
    public void testSetAccoucher() {
        // generate test accoucher
        Licorne licorne = new Licorne("Licorne", "F", 100, 100, 100);
        licorne.setAccoucher(true);
        assertEquals(true, licorne.isAccoucher());
    }
}