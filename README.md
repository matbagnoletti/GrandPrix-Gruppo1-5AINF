<h1 align="center">GrandPrix-Gruppo1-5AINF</h1>

<p align="center" style="font-family: monospace">Made by <a href="https://github.com/matbagnoletti">@matbagnoletti</a>, <a href="https://github.com/RageKB">@RageKB</a> and <a href="https://github.com/IsmailHadeg">@IsmailHadeg</a></p>
<p align="center" style="font-family: monospace">Docenti: prof.ssa <a href="https://github.com/mciuchetti">@mciuchetti</a> e prof.ssa Fioroni</p>
<p align="center" style="font-family: monospace">Corso TPSIT a.s. 2023/2024, <a href="https://www.avoltapg.edu.it/">ITTS A. Volta (PG)</a></p>
<p align="center">
    <img src="https://img.shields.io/github/last-commit/matbagnoletti/GrandPrix-Gruppo1-5AINF?style=for-the-badge" alt="Ultimo commit">
    <img src="https://img.shields.io/badge/Language-Java-blue?style=for-the-badge" alt="Java">
</p>

> [!CAUTION] 
> 
> Questo progetto è ancora in fase di sviluppo e test. Se ne sconsiglia l'utilizzo fino a quando non ne sarà rilasciata una versione ufficiale.

## Descrizione e obiettivi
Questo progetto ha come scopo quello di simulare una gara di auto da corsa in Java in ambiente multi-thread.

Il gioco è composto da un giudice di gara, dei giocatori, dei piloti e le rispettive auto, un circuito e un sistema di cifratura e decifratura delle password.

- È previsto l'utilizzo e la gestione degli stream per la lettura e scrittura dei dati su file. I dati dei piloti e delle loro auto sono memorizzati in un file, così come quelle dei giocatori, le cui password sono cifrate secondo il cifrario di Vigenère.
- Ogni giocatore può scegliere il numero di auto da far partire contemporaneamente e il circuito su cui gareggiano. Quest'ultimo ha una lunghezza che viene preimposta dal giocatore, come anche il numero di giri, il numero di possibili pit stop e la possibilità di truccare una macchina o di fermarne una per un incidente. Deve poi essere eventualmente possibile far intervenire (in un certo punto della gara) la safety car. 
- Il giudice di gara deve poter comunicare a tutti i partecipanti e al pubblico l’inizio e la fine della gara, nonché, al termine della gara, il vincitore, salvando i dati della classifica in un file che può essere letto dal giocatore alla fine del gioco.
    
## Struttura del progetto
Il progetto si compone dalle seguenti classi:

- [Giudice.java](src/main/java/org/tpsit/Giudice.java): è la classe di avvio che gestisce:
    - l'account dell'utente sotto forma di `Giocatore`
    - la lettura da file dei dati dei piloti e delle loro auto
    - l'avvio della la gara e la classifica. 

- [Giocatore.java](src/main/java/org/tpsit/Giocatore.java): classe che identifica l'utente che sta giocando. Alla sua istanza dovranno essere passati i seguenti paramentri:
  - `username` dell'utente.
  - `verme` del cifrario.
  
  Fatto ciò, verrà invocato il metodo `ricercaGiocatore(username, verme)` per verificare se il FILE con le informazioni dell'utente esiste oppure no. 
  - Nel caso in cui il FILE dell'utente esista, viene richiesta la `password` e poi invocato il metodo `accesso(password)`. Se restituisce `true` allora l'utente è autenticato, se restituisce `false` la password è errata. 
  - Se non esiste invece, l'utente dovrà scegliere una `password` e verrà poi invocato il metodo `registrazione(password)` affinché venga creato il file dell'utente nel percorso `/giocatori/` nel formato `username.giocatore`.
   
- [Pilota.java](src/main/java/org/tpsit/Pilota.java): è un Thread creato dalla classe `Giudice.java` per poter concorrere in gara simultaneamente ad altri piloti. Il metodo `run()` verrà utilizzato finché la propria `Auto` (associata come attributo) non abbia terminato il circuito (vedi metodo `percorri()`), segnalando al `Giudice` ogni qual volta venga completato un giro.

- [Auto.java](src/main/java/org/tpsit/Auto.java): è una classe associata a ciascun `Pilota` e possiede quei metodi per poter avanzare nel circuito o generare (in modo random) un pit stop (se possibile). Eseguendo un pit stop, per quel round la velocità dell'auto sarà ridotta a 0.
   
- [Cifrario.java](src/main/java/org/tpsit/Cifrario.java), [Matrice.java](src/main/java/org/tpsit/Matrice.java) e [Vigenere.java](src/main/java/org/tpsit/Vigenere.java): classi utilizzate per cifrare e decifrare la password dei giocatori salvata su file. Vedi progetto [Encryption](https://www.github.com/matbagnoletti/Encryption).

- [Circuito.java](src/main/java/org/tpsit/Circuito.java): è la classe che rappresenta un generico circuito che deve essere creato dall'utente nel main, specificando la lunghezza in metri, il numero di giri, e il numero di pit stop possibili. Possiede un attributo `safetyCar` che viene controllato dal `Giudice` e, se impostato su `true`, fa avanzare tutte le auto a 50 m/s, così che nessuna possa superare l'altra.
 
## Utilizzo
Per poter utilizzare il progetto è necessario eseguire il file [Giudice.java](src/main/java/org/tpsit/Giudice.java) e seguire le istruzioni stampate a video.

## Storico del progetto
Tutte le modifiche degne di nota di questo progetto verranno documentate e rese pubbliche nel file [CHANGELOG.md](CHANGELOG.md).

## Documentazione
La documentazione di questo progetto è disponibile nella cartella [documentazione](documentazione):
- [JavaDoc](documentazione/javadoc): documentazione generata automaticamente da JavaDoc. Si può visualizzare aprendo il file `index.html` con un browser.
- [UML](documentazione/progettazione/UML): diagramma UML del progetto.
- [Diagramma dei casi d'uso](documentazione/progettazione/DiagrammaCasiUso.png): diagramma dei casi d'uso del progetto. 

## Licenza d'uso
Questo progetto (e tutte le sue versioni) sono rilasciate sotto la [MB Collective Copyleft License](LICENSE).