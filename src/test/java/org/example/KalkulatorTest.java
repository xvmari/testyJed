package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testPodzielJezeliCalkowity() {
        Assertions.assertEquals(3, Kalkulator.podziel(6, 2));
    }
    @Test
    void testPodzielJezeliReczywisty() {
        Assertions.assertEquals(3.5, Kalkulator.podziel(7, 2));
    }


    @Test
    void testczyLiczbaPiewsza() {
        Assertions.assertFalse(Kalkulator.czyLiczbaPiewsza(1));
    }
    @Test
    void testczyLiczbaPiewszaParzysta() {
        Assertions.assertTrue(Kalkulator.czyLiczbaPiewsza(2));
    }
    @Test
    void testczyLiczbaPiewszaParzystaZlozona() {
        Assertions.assertFalse(Kalkulator.czyLiczbaPiewsza(6));
    }
    @Test
    void testczyLiczbaPiewszaNieparzysta() {
        Assertions.assertTrue( Kalkulator.czyLiczbaPiewsza(17));
    }
    @Test
    void testczyLiczbaPiewszaKwadratPierwszej() {
        Assertions.assertFalse(Kalkulator.czyLiczbaPiewsza(49));
    }
    @Test
    void testczyLiczbaPiewszaDuza() {
        Assertions.assertTrue(Kalkulator.czyLiczbaPiewsza(1117));
    }
}