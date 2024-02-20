package org.tpsit;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Gruppo 1: Matteo Bagnoletti Tini, Ismail Hadeg, Leonardo Calderon.
 * Giudice.java => Classe di avvio del programma.
 */
public class Giudice {
    /**
     * ArrayList di piloti partecipanti alla gara.
     */
    private static ArrayList<Pilota> piloti = new ArrayList<>();
    /**
     * Variabile statica che tiene conto del nome del vincitore della gara.
     */
    private static String vincitore;
    /**
     * Variabile statica che tiene conto del numero di classificato. Si resetta ad ogni giro
     */
    private static int contaNumeroClassificato = 1;
    /**
     * Variabile statica che tiene conto del numero di giri totali della gara.
     */
    private static int numeroGiriTotali;
    /**
     * Variabile statica che tiene conto del giro in cui avviene l'incidente.
     */
    private static int giroIncidente;
    /**
     * Variabile statica che tiene conto del numero di partecipanti alla gara. Può variare nel caso di incidenti
     */
    private static int partecipanti;
    /**
     * Variabile statica che tiene conto del numero del pilota incidentato.
     */
    private static int numPilotaIncidentato;
    /**
     * Variabile statica che tiene conto del circuito su cui si svolge la gara.
     */
    private static Circuito circuito;
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // GESTIRE IL RECUPERO O IL SALVATAGGIO DEI DATI DELL'UTENTE (Giocatore)
        System.out.println("Qual'è il tuo username?");
        String username = scanner.nextLine();

        System.out.println("Qual'è la tua password di cifratura? (solo lettere. se non ne possiedi una inventala)");
        String verme = scanner.nextLine();

        Giocatore giocatore = new Giocatore(username, verme);
        System.out.println(giocatore.getUsername());

        // verificare se l'utente esiste già con il metodo ricercaGiocatore()
        if(giocatore.ricercaGiocatore()){
            // se esiste allora invocare il metodo accesso(password)

            System.out.println("Qual'è la password del tuo account?");
            String password = scanner.nextLine();
            if(giocatore.accesso(password)){
                System.out.println("Accesso eseguito");
            } else{
                System.out.println("Password sbagliata");
                System.exit(1);
            }
        } else {
            // altrimenti invocare registrazione(password)

            System.out.println("Qual'è la password del tuo account?");
            String password = scanner.nextLine();
            if(giocatore.registrazione(password)){
                System.out.println("Account creato");
            } else{
                System.out.println("Impossibile creare l'account");
                System.exit(1);
            }
        }
        
        //TODO: GESTIRE LE SPECIFICHE DEL CIRCUITO
        
        //TODO: RECUPERARE I DATI DEI PILOTI DAL FILE
        
        //TODO: SALVARE LA SCELTA DEL PILOTA DELL'UTENTE
        
        //TODO: IMPOSTARE EVENTUALI INCIDENTI
        
        //TODO: AVVIARE LA GARA
    }

    /**
     * Metodo statico che permette di stampare la classifica della gara ed eventuali incidenti
     * @param nomePilota il nome del pilota che ha completato il giro.
     * @param giriPercorsi il numero di giri percorsi dal pilota.
     */
    public static synchronized void stampaClassifica(String nomePilota, int giriPercorsi) {
        //TODO: GESTIRE LA STAMPA DELLA CLASSIFICA
    }

    /**
     * Metodo statico che permette di stampare i pit stop effettuati dai piloti.
     * @param squadra la squadra del pilota che ha effettuato il pit stop.
     */
    public static synchronized void stampaPitstop(String squadra) {
        System.out.println("Il pilota della " + squadra + " ha effettuato un pit stop!");
    }
} 