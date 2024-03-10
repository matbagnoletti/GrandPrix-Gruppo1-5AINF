package org.tpsit;

/**
 * Classe che rappresenta un circuito della gara.
 * Contiene le informazioni del circuito e i metodi per accedervi.
 */
public class Circuito {
    private String nome;
    /**
     * Lunghezza del circuito in metri.
     */
    private int lunghezza;
    /**
     * Numero di PitStop permessi del circuito.
     */
    private int numeroPitStop;
    private int numeroGiri;
    /**
     * Lunghezza di un giro del circuito (calcolato matematicamente).
     */
    private int lunghezzaGiro;
    /**
     * Variabile booleana che indica se la safety car è attiva.
     */
    private boolean safetyCar;

    /**
     * Costruttore della classe Circuito.
     * @param nome nome del circuito
     * @param lunghezza lunghezza del circuito in metri
     * @param numeroPitStop numero di PitStop permessi del circuito
     * @param numeroGiri numero di giri del circuito
     */
    public Circuito(String nome, int lunghezza, int numeroPitStop, int numeroGiri) {
        this.nome = nome;
        this.lunghezza = lunghezza;
        this.numeroPitStop = numeroPitStop;
        this.numeroGiri = numeroGiri;
        this.safetyCar = false;
        this.lunghezzaGiro = lunghezza / numeroGiri;
    }

    public String getNome() {
        return nome;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public int getNumeroPitStop() {
        return numeroPitStop;
    }

    public int getNumeroGiri() {
        return numeroGiri;
    }

    /**
     * Metodo che restituisce se la safety car è attiva.
     * @param safetyCar true se la safety car è attiva, false altrimenti.
     */
    public void setSafetyCar(boolean safetyCar) {
        this.safetyCar = safetyCar;
    }

    public int getLunghezzaGiro() {
        return lunghezzaGiro;
    }
}