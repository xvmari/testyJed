package org.example;

public class Kalkulator {
    public static double podziel(int a, int b){
//        nie bedzie b = 0


        return a /(double) b;
    }
    public static boolean czyLiczbaPiewsza(int liczba){
//        TODO
        if(liczba == 1){
            return false;
        }
        double pierwiastek = Math.sqrt(liczba);
        for (int i = 2; i <= pierwiastek; i++) {
            if (liczba % i == 0){
                return false;
            }

        }

        return true;

    }
}
