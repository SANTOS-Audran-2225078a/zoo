package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lasauce.animaux.Phoenix;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhoenixTest {
    @Test
    public void testManger() {
        // generate test manger
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setFaim(50);
        phoenix.setSante(90);
        phoenix.manger(phoenix.getNomEspece());
        assertEquals(50, phoenix.getFaim());
        assertEquals(95, phoenix.getSante());
    }


    @Test
    public void testSon() {
        // generate test son
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setFaim(40);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        phoenix.son(phoenix.getNomEspece());
        String expectedOutput = "Phoenix est entrain de rugir de faim ! Il est temps de lui donner à manger.";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    public void testSoin() {
        // generate test soin
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setSante(70);
        phoenix.soin(phoenix.getNomEspece());
        assertEquals(90, phoenix.getSante());
    }

    @Test
    public void testDormir() {
        // generate test dormir
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setSante(60);
        phoenix.dormir(phoenix.getNomEspece());
        assertEquals(80, phoenix.getSante());
    }

    @Test
    public void testVieillir() {
        // generate test vieillir
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.vieillir(phoenix.getNomEspece());
        assertEquals(101, phoenix.getAge());
    }

    @Test
    public void testVoler() {
        // generate test voler
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setSante(80);
        phoenix.voler(phoenix.getNomEspece());
        assertEquals(60, phoenix.getSante());
    }

    @Test
    public void testGetNomEspece() {
        // generate test nomEspece
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        assertEquals("Phoenix", phoenix.getNomEspece());
    }

    @Test
    public void testGetSexe() {
        // generate test sexe
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        assertEquals("M", phoenix.getSexe());
    }

    @Test
    public void testGetPoids() {
        // generate test poids
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        assertEquals(100.0, phoenix.getPoids(), 0.001);
    }

    @Test
    public void testGetTaille() {
        // generate test taille
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        assertEquals(100.0, phoenix.getTaille(), 0.001);
    }

    @Test
    public void testGetAge() {
        // generate test age
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        assertEquals(100, phoenix.getAge());
    }

    @Test
    public void testGetFaim() {
        // generate test faim
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setFaim(80);
        assertEquals(80, phoenix.getFaim());
    }

    @Test
    public void testIsDort() {
        // generate test dort
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setDort(true);
        assertEquals(true, phoenix.isDort());
    }

    @Test
    public void testGetSante() {
        // generate test sante
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        assertEquals(100, phoenix.getSante());
    }

    @Test
    public void testIsVoler() {
        // generate test voler
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setVoler(true);
        assertEquals(true, phoenix.isVoler());
    }

    @Test
    public void testIsPond() {
        // generate test pond
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setPond(true);
        assertEquals(true, phoenix.isPond());
    }

    @Test
    public void testIsRenaitre() {
        // generate test renaitre
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setRenaitre(true);
        assertEquals(true, phoenix.isRenaitre());
    }

    @Test
    public void testSetNomEspece() {
        // generate test nomEspece
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setNomEspece("NewPhoenix");
        assertEquals("NewPhoenix", phoenix.getNomEspece());
    }

    @Test
    public void testSetSexe() {
        // generate test sexe
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setSexe("F");
        assertEquals("F", phoenix.getSexe());
    }

    @Test
    public void testSetPoids() {
        // generate test poids
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setPoids(150);
        assertEquals(150.0, phoenix.getPoids(), 0.001);
    }

    @Test
    public void testSetTaille() {
        // generate test taille
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setTaille(150);
        assertEquals(150.0, phoenix.getTaille(), 0.001);
    }

    @Test
    public void testSetAge() {
        // generate test age
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setAge(101);
        assertEquals(101, phoenix.getAge());
    }

    @Test
    public void testSetFaim() {
        // generate test faim
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setFaim(90);
        assertEquals(90, phoenix.getFaim());
    }

    @Test
    public void testSetDort() {
        // generate test dort
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setDort(true);
        assertEquals(true, phoenix.isDort());
    }

    @Test
    public void testSetSante() {
        // generate test sante
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setSante(90);
        assertEquals(90, phoenix.getSante());
    }

    @Test
    public void testSetVoler() {
        // generate test voler
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setVoler(true);
        assertEquals(true, phoenix.isVoler());
    }

    @Test
    public void testSetPond() {
        // generate test pond
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setPond(true);
        assertEquals(true, phoenix.isPond());
    }

    @Test
    public void testSetRenaitre() {
        // generate test renaitre
        Phoenix phoenix = new Phoenix("Phoenix", "M", 100, 100, 100);
        phoenix.setRenaitre(true);
        assertEquals(true, phoenix.isRenaitre());
    }
}