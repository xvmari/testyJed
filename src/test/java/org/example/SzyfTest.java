package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SzyfTest {

    @Test
    void testszyfrujCezaremJezeliKluczDodatni() {
        Assertions.assertEquals("def", Szyf.szyfrujCezarem("abc", 3));
    }

    @Test
    void testszyfrujCezaremJezeliZawijane(){
        Assertions.assertEquals("abc", Szyf.szyfrujCezarem("def", 3));
    }

    @Test
    void testszyfrujCezaremOdszyfrowanie() {
        Assertions.assertEquals("abc", Szyf.szyfrujCezarem("xyz", 3));
    }
    @Test
    void testszyfrujCezaremKluczDluzszyOdAlfabetu() {
        Assertions.assertEquals("def", Szyf.szyfrujCezarem("abc", 29));
    }
    @Test
    void testszyfrujCezaremSpacjaWTekscie() {
        Assertions.assertEquals("cd ef", Szyf.szyfrujCezarem("ab cd", 2));
    }
}