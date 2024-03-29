package org.tpsit;

/**
 * Matrice che rappresenta la tabella di Vigenere.
 *
 * @author Monica Ciuchetti
 * @author Matteo Bagnoletti Tini
 * @version 1.1
 * @since 1.0
 * @see <a href="https://github.com/matbagnoletti/Encryption">Original project (Encryption)</a>
 */

public class Matrice {

    char[][] mv;
    /**
     * Stringa che rappresenta la chiave di cifratura e decifratura nel cifrario di Vigenere.
     */
    String verme;

    public Matrice(String verme) {
        this.mv = new char[26][26];
        this.verme = verme;
    }

    public void setElemento(int r, int c, int el) {
        this.mv[r][c] = (char) el;
    }

    public char getElemento(int r, int c) {
        return mv[r][c];
    }

    public void stampa() {
        int r;
        int c;

        for (r = 0; r < 26; r++) {
            for (c = 0; c < 26; c++) {
                System.out.print(this.getElemento(r, c));
            }
            System.out.print("\n");
        }
    }

    /**
     * Metodo per cifrare un testo in chiaro.
     * @param fch testo in chiaro da cifrare.
     * @return testo cifrato.
     * @throws ArrayIndexOutOfBoundsException se il testo contiene caratteri non cifrabili.
     */
    public String cifra(String fch) throws ArrayIndexOutOfBoundsException {
        StringBuilder fcf;
        int k, j, col, row;
        fcf = new StringBuilder();
        k = 0;

        for (j = 0; j < fch.length(); j++) {

            if (k == verme.length()) {
                k = 0;
            }

            if(!Character.isLetter(fch.charAt(j))){
                fcf.append(fch.charAt(j));
            } else {
                col = (int) fch.charAt(j) - 65;
                row = (int) verme.charAt(k) - 65;
                fcf.append(mv[row][col]);
            }
            k++;
        }

        return (fcf.toString());
    }

    /**
     * Metodo per decifrare un testo cifrato.
     * @param fcf testo cifrato da decifrare.
     * @return testo decifrato.
     */
    public String deCifra(String fcf) {
        StringBuilder fch = new StringBuilder();

        int k, j, col, row;

        k = 0;

        for (j = 0; j < fcf.length(); j++) {

            if (k == verme.length()) {
                k = 0;
            }

            if(!Character.isLetter(fcf.charAt(j))){
                fch.append(fcf.charAt(j));
            } else {
                row = (int) verme.charAt(k) - 65;
                for (col = 0; col < 26; col++) {
                    if (mv[row][col] == fcf.charAt(j)) {
                        char car = (char) (col + 65);
                        fch.append(car);
                    }
                }
            }
            k++;
        }

        return (fch.toString());
    }
}