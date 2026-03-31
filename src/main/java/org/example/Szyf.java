package org.example;

public class Szyf {

    public static String szyfrujCezarem(String slowoSzyfrowania, int klucz ){
        String zaszyfrowane = "";
        klucz = klucz%26;
        String alfabet = "abcdefghijklmnopqrstuwxyz";
        String alfabetPrzesuniety = alfabet.substring(klucz) + alfabet.substring(0, klucz);
        for (int i = 0; i < slowoSzyfrowania.length(); i++) {
            char litera = slowoSzyfrowania.charAt(i);
            if (litera == ' '){
                zaszyfrowane = zaszyfrowane + " ";
            } else {
                int indexWAlfabecie = alfabet.indexOf(litera);
                zaszyfrowane = zaszyfrowane + alfabetPrzesuniety.charAt(indexWAlfabecie);
            }

        }

        return zaszyfrowane;
    }

}
