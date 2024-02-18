<h1 align="center">GrandPrix-Gruppo1-5AINF</h1>

<p align="center" style="font-family: monospace">Made by <a href="https://github.com/matbagnoletti">@matbagnoletti</a>, <a href="https://github.com/RageKB">@RageKB</a> and <a href="https://github.com/IsmailHadeg">@IsmailHadeg</a></p>
<p align="center" style="font-family: monospace">Docenti: prof.ssa <a href="https://github.com/mciuchetti">@mciuchetti</a> e prof.ssa Fioroni</p>
<p align="center" style="font-family: monospace">Corso TPSIT a.s. 2023/2024, <a href="https://www.avoltapg.edu.it/">ITTS A. Volta (PG)</a></p>
<p align="center">
    <img src="https://img.shields.io/github/last-commit/matbagnoletti/GrandPrix-Gruppo1-5AINF?style=for-the-badge" alt="Ultimo commit">
    <img src="https://img.shields.io/github/languages/top/matbagnoletti/GrandPrix-Gruppo1-5AINF?style=for-the-badge" alt="Linguaggio">
</p>

## Descrizione

## Struttura del progetto 
   Il progetto è formato dalle seguenti classi :

  -Giudice: è la classe main che gestisce l'account dell'utente sotto forma di giocatore, leggere dai file i dati dei piloti e delle loro
             auto, avviare la gara e stampare la classifica. Ha una serie di attributi STATICi così che possono essere accesibili da altri 
             metodi. 

  -Giocatore: classe che indentifica l'utente che sta giocando. Nel main di giudice dovrà essere creato con i seguenti paramentri       
               USERNAME e il VERME del cifrario fatto ciò la classe giocatore possiede un metodo ovvero"ricercaGiocatore(username,verme)" 
               per verificare se il FILE dell'utente esiste oppure no. 
               Nel caso in cui il FILE dell'utente esiste si richiede una password e poi invocare il metodo accesso(password).Se ritorna
               true allora l'utente è autenticato, se ritorna false la password è errata.
               Se non esiste invece, l'utente dovrà scegliere una password ed invocare il metodo registrazione(password) affinchè venga
               creato il file dell'utente dentro la cartella"giocatori" nel formato "username.giocatore".
   
  -Pilota: è un thread che viene creato dalla classe Giudice(main). Il metodo principale è run() e dovrà essere utilizzato affinchè 
            la propria macchina associata come attributo non ha terminato il circuito, dovrà essere invocato il metodo"percorri() e
            segnalare al giudice ogni qual volta completa si completa un giro.

  -Auto: è associata ad un pilota e possiede quei metodi per poter avanzare o generare in modo random un pit stop(se possibile).
          Se esegue il pit stop quel giro non avanza.
   
  -Cifrario,Matrice e Vigenere: vengono utilizzato per cifrare a decifrare la password dei giocatori salvata su file

  -Circuito: è la classe che rappresenta un generico circuito che deve essere creato dall'utente main, specificando la lunghezza in metri
              il numero di giri, e il numero di pit stop.
              Possiede un attributo"safetyCar" che viene contrallato dai Piloti/auto e se impostato su true,fa avanzare tutte le auto
              a 50 m/s così che nessuna superi l'altra.
   

               
   
## Utilizzo

## Licenza d'uso
Questo progetto (e tutte le sue versioni) sono rilasciate sotto la [MB Collective Copyleft License](LICENSE).t