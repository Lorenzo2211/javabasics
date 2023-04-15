package javabasics.livecodingextra;

public class Esercizio1 {
    public static void main(String[] args) {
        //Scrivi un programma che dato un numero calcola in una variabile se sei minorenne o meno
        //Verifica che l'utente non sia minorenne - se si stampa "Minorenne"

        //Dichiarando le condizioni e l'età
        int age = 21;
        boolean siamoMinorenni= age < 18;

        //Verifica l'età dell'utente
        if (!siamoMinorenni){
            System.out.println("Maggiorenne");
        } else System.out.println("Minorenne");
        }
    }

