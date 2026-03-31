package org.example;

public class Szyf {

    public static String szyfrujCezarem(String slowoSzyfrowania, int klucz ){
        String zaszyfrowane = "";
        klucz = klucz%26;
        String alfabet = "abcdefghijklmnopqrstuwxyz";
        String alfabetPrzesuniety;
        if(klucz > 0){
            alfabetPrzesuniety = alfabet.substring(klucz) + alfabet.substring(0, klucz);
        } else{
            klucz =- klucz;
            alfabetPrzesuniety = alfabet.substring(alfabet.length()-klucz) + alfabet.substring(0, alfabet.length()-klucz);
        }

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
