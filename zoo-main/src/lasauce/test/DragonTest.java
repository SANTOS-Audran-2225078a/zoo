package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lasauce.animaux.Dragon;

public class DragonTest {
    @Test
    public void testCourrir() {
            //generate test courrir
            Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
            dragon.setCourrir(true);
            assertEquals(true, dragon.isCourrir());

    }

    @Test
    public void testDormir() {
            //generate test dormir
            Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
            dragon.setDort(100);
            assertEquals(100, dragon.getDort());

    }

    @Test
    public void testGetAge() {
        // generate test age
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setAge(100);
        assertEquals(100, dragon.getAge());




    }

    @Test
    public void testGetDort() {
        // generate test dormir
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setDort(100);
        assertEquals(100, dragon.getDort());

    }

    @Test
    public void testGetFaim() {
        // generate test manger
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setFaim(100);
        assertEquals(100, dragon.getFaim());

    }

    @Test
    public void testGetNomEspece() {
        // generate test nomEspece
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setNomEspece("Dragon");
        assertEquals("Dragon", dragon.getNomEspece());

    }

    @Test
    public void testGetPoids() {
        // generate test poids
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setPoids(100);
        assertEquals(100.0, dragon.getPoids(), 0.001);

    }

    @Test
    public void testGetSante() {
        // generate test sante
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setSante(100);
        assertEquals(100, dragon.getSante());

    }

    @Test
    public void testGetSexe() {
        // generate test sexe
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setSexe("M");
        assertEquals("M", dragon.getSexe());

    }

    @Test
    public void testGetTaille() {
        // generate test taille
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setTaille(100);
        assertEquals(100.0, dragon.getTaille(), 0.001);

    }

    @Test
    public void testIsCourrir() {
        // generate test courrir
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setCourrir(true);
        assertEquals(true, dragon.isCourrir());


    }

    @Test
    public void testIsNager() {
        // generate test nager
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setNager(true);
        assertEquals(true, dragon.isNager());


    }

    @Test
    public void testIsPond() {
        // generate test pond
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setPond(true);
        assertEquals(true, dragon.isPond());


    }

    @Test
    public void testIsRenaitre() {
        // generate test renaitre
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setRenaitre(true);
        assertEquals(true, dragon.isRenaitre());


    }

    @Test
    public void testIsVoler() {
        // generate test voler
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setVoler(true);
        assertEquals(true, dragon.isVoler());


    }

    @Test
    public void testManger() {
        // generate test manger
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setFaim(100);
        assertEquals(100, dragon.getFaim());

    }

    @Test
    public void testNager() {
        // generate test nager
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setNager(true);
        assertEquals(true, dragon.isNager());


    }

    @Test
    public void testSetAge() {  
        // generate test age
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setAge(100);
        assertEquals(100, dragon.getAge());


    }

    @Test
    public void testSetCourrir() {
        // generate test courrir
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setCourrir(true);
        assertEquals(true, dragon.isCourrir());


    }

    @Test
    public void testSetDort() {
        // generate test dormir
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setDort(100);
        assertEquals(100, dragon.getDort());

    }

    @Test
    public void testSetFaim() { 
        // generate test manger
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setFaim(100);
        assertEquals(100, dragon.getFaim());

    }

    @Test
    public void testSetNager() {
        // generate test nager
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setNager(true);
        assertEquals(true, dragon.isNager());

    }

    @Test
    public void testSetNomEspece() {
        // generate test nomEspece
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setNomEspece("Dragon");
        assertEquals("Dragon", dragon.getNomEspece());


    }

    @Test
    public void testSetPoids() {
        // generate test poids
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setPoids(100);
        assertEquals(100.0, dragon.getPoids(), 0.001);
    }

    @Test
    public void testSetPond() {
        // generate test pond
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setPond(true);
        assertEquals(true, dragon.isPond());

    }

    @Test
    public void testSetRenaitre() {
        // generate test renaitre
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setRenaitre(true);
        assertEquals(true, dragon.isRenaitre());

    }

    @Test
    public void testSetSante() {
        // generate test sante
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setSante(100);
        assertEquals(100, dragon.getSante());

    }

    @Test
    public void testSetSexe() {
        // generate test sexe
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setSexe("M");
        assertEquals("M", dragon.getSexe());

    }

    @Test
    public void testSetTaille() {
        // generate test taille
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setTaille(100);
        assertEquals(100.0, dragon.getTaille(), 0.001);

    }

    @Test
    public void testSetVoler() {
        // generate test voler
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setVoler(true);
        assertEquals(true, dragon.isVoler());

    }

    @Test
    public void testSoin() {    
        // generate test soin
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setSante(100);
        assertEquals(100, dragon.getSante());


    }

    @Test
    public void testSon() {
        // generate test son
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.son(dragon.getNomEspece());
        assertEquals("Dragon est en train de rugirrrrrrrr", dragon.son(dragon.getNomEspece()));
    }

    @Test
    public void testVieillir() {
        // generate test vieillir
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setAge(100);
        assertEquals(100, dragon.getAge());


    }

    @Test
    public void testVoler() {
        // generate test voler
        Dragon dragon = new Dragon("Dragon", "M", 100, 100, 100);
        dragon.setVoler(true);
        assertEquals(true, dragon.isVoler());
        

    }
}
