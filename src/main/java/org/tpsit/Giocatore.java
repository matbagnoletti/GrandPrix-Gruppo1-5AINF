package org.tpsit;

import java.io.*;

/**
 * Classe che rappresenta un giocatore.
 * Ogni giocatore ha un username e una password.
 * La password viene cifrata con il cifrario di Vigenere.
 * Utilizzo per fasi:
 * <ol>
 *     <li>Creazione di un nuovo giocatore tramite il costruttore indicando lo username e il verme per il cifrario.</li>
 *     <li>Verifica dell'esistenza di un account (file) tramite il metodo ricercaGiocatore()</li>
 *     <li>Se esiste, viene richiesta la password e verificata, altrimenti l'account viene registrato.</li>
 * </ol>
 * @see Cifrario
 */
public class Giocatore {
    /**
     * Username del giocatore.
     * Rimane costante.
     */
   private final String username;
   /**
    * Cifrario di Vigenere.
    * Rimane costante.
    * @see Cifrario
    */
   private final Cifrario cifrario;
   
   private String giocatoreScelto;
   
   /**
    * Costruttore della classe Giocatore.
    * @param username Username del giocatore.
    * @param verme Verme del cifrario di Vigenere.
    */
   public Giocatore(String username, String verme) {
      this.username = username;
      this.cifrario = new Cifrario(verme);
   }

   public String getUsername() {
      return username;
   }

   /**
    * Metodo che permette di visualizzare se esiste un file con il nome del giocatore.
    * @return true se esiste, false altrimenti.
    */
   public boolean ricercaGiocatore() {
      if(username != null && !username.equalsIgnoreCase("")) {
         File filGiocatore = new File("giocatori/" + username + ".giocatore");
            return (filGiocatore.exists() && filGiocatore.isFile());
      } else {
         return false;
      }
   }

   /**
    * Metodo che permette di verificare se la password inserita è uguale a quella decifrata salvata.
    * @param password Password inserita dall'utente.
    * @return true se la password è corretta, false altrimenti.
    */
   public boolean accesso(String password) {
      if (username != null && !username.equalsIgnoreCase("")) {
         try (BufferedReader lettore = new BufferedReader(new FileReader("giocatori/" + username + ".giocatore"))) {
            String riga = lettore.readLine(); // La riga del file contiene la password cifrata
            if (riga != null) {
               return cifrario.decifra(riga).equals(password);
            } else {
               return false;
            }
         } catch (IOException e) {
            return false;
         }
      } else {
         return false;
      }
   }

   /**
    * Metodo che permette di registrare un nuovo giocatore.
    * @param password Password del nuovo giocatore.
    * @return true se la registrazione è avvenuta con successo, false altrimenti.
    */
   public boolean registrazione(String password) {
        if (username != null && !username.equalsIgnoreCase("")) {
           File cartellaGiocatori = new File("giocatori");
           if(!cartellaGiocatori.exists() && !cartellaGiocatori.isDirectory()){
               if(!cartellaGiocatori.mkdir()){
                   return false;
               }
           }

           File fileUtente = new File("giocatori/" + username + ".giocatore");
            try {
                if(!fileUtente.createNewFile()){ // Crea il file
                   return false;
                }
            } catch (IOException e) {
                return false;
            }
            try (BufferedWriter scrittore = new BufferedWriter(new FileWriter("giocatori/" + username + ".giocatore"))) {
              scrittore.write(cifrario.cifra(password.toUpperCase())); // Scrive la password cifrata nel file
              return true;
           } catch (IOException e) {
              return false;
           }
        } else {
            return false;
        }
   }
   
    public void setGiocatoreScelto(String giocatoreScelto) {
        this.giocatoreScelto = giocatoreScelto;
    }

    public String getGiocatoreScelto() {
        return giocatoreScelto;
    }
}
