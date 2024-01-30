package org.tpsit;

/**
 * Classe che rappresenta un giocatore.
 * Ogni giocatore ha un username e una password.
 * La password viene cifrata con il cifrario di Vigenere.
 * @see Cifrario
 */
public class Giocatore {
   private String username;
   private String password;
   /**
    * Cifrario di Vigenere.
    * @see Cifrario
    * 
    * final perché rimane costante.
    */
   private final Cifrario cifrario;
   
   /**
    * Costruttore della classe Giocatore.
    * @param username Username del giocatore.
    * @param password Password del giocatore.
    * @param verme Verme del cifrario di Vigenere.
    */
   public Giocatore(String username, String password, String verme) {
      this.username = username;
      this.cifrario = new Cifrario(verme);
      this.password = cifrario.cifra(password);
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public void setPassword(String password) {
      this.password = cifrario.cifra(password);
   }

   public String getUsername() {
      return username;
   }

   public String getPassword() {
      return cifrario.decifra(password);
   }
   
   //TODO: Gestire il salvataggio e il recupero dei dati da file.
   
}
