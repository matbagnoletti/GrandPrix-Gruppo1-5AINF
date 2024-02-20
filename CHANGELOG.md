# Changelog

Tutte le modifiche degne di nota di questo progetto verranno documentate in questo file.

Questo formato è basato su "[Keep a Changelog](https://keepachangelog.com/en/1.1.0/)".

Parole chiave (keywords) utilizzate per identificare il tipo di modifica:
- `Added` per aggiunte e novità.
- `Changed` per modifiche a strutture esistenti.
- `Deprecated` per deprecazioni.
- `Removed` per rimozioni.
- `Fixed` per correzioni di bug o altri errori.
- `Security` per modifiche di sicurezza.

## [Unreleased] - 14 Gennaio 2024

### Added

- Creazione del progetto Java Maven
- Creazione e caricamento del repository su [GitHub](https://github.com/matbagnoletti/GrandPrix-Gruppo1-5AINF.git)
- Aggiunto il file `README.md` per la documentazione del progetto
- Aggiunto il file `LICENSE` per la licenza del progetto
- Aggiunto il file `CHANGELOG.md` per tenere traccia delle modifiche al progetto

## [Unreleased] - 5 Febbraio 2024

### Added

- Implementata una prima versione della classe `Giocatore` per la gestione dei giocatori
- Implementata una prima versione della classe `Circuito` per la gestione del circuito di gara
- Implementata una prima versione della classe `Pilota` per la gestione dei piloti gareggianti
- Inserite le classi `Cifrario`, `Matrice` e `Vigenere` per la gestione della crittografia delle password

## [Unreleased] - 16 e 17 Febbraio 2024

### Added

- Implementata una prima versione della classe `Auto` per la gestione delle auto da corsa associate a ciascun pilota
- Implementata una prima versione della classe `Giudice` per la gestione della gara. Tale classe è classe di avvio del programma

### Changed

- Modificata la classe `Pilota` per l'aggiunta di un'auto associata a ciascun pilota, nonché per la gestione della lettura e scrittura dei dati su file
- Modificata la classe `Giocatore` per la gestione della lettura e scrittura dei dati su file
- Modificata la classe `Circuito` per la gestione della lettura e scrittura dei dati su file

## [Unreleased] - 20 Febbraio 2024

### Changed

- Modificata la classe `Giudice` per l'autenticazione dell'utente e la creazione del circuito.

### Fixed

- Corretta la classe `Cifrario` impostando sia il `verme` che il `testoInChiaro` in maiuscolo per evitare problemi di cifratura con la matrice.
