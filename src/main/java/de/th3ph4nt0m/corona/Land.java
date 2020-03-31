package de.th3ph4nt0m.corona;

    //Parameter
    //Einwohner (infiziert, gesund, verstorben, wieder gesund)
    //Maßnahmen
    //Eigenschaften Land

    //rundeSimulieren()
    //getEinwohner()
    //getContacts() int
    //getAnsteckungswahrscheinlichkeit()
    //genesen()

    /**
     * Beschreiben Sie hier die Klasse Land.
     * * @author (Ihr Name)   * @version (eine Versionsnummer oder ein Datum)
     */
    public class Land {     // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
        private String Name;
        private int Ansteckungswahrscheinlichkeit;//in Prozent
        private int Einwohnerzahl;
        private int Erkrankte;
        private int Genesene;
        private boolean SchulenGeschlossen;
        private boolean Ausgangssperre;
        private boolean Kontaktverbot;
        private boolean GrenzenGeschlossen;
        private int Beatmungsplätze;
        private int AnzahlKontakte;

        /**
         * Konstruktor für Objekte der Klasse Land
         */
        public Land(String name, int einwohnerzahl, int erkrankte, int genesene, boolean schulenGeschlossen, boolean ausgangssperre, boolean kontaktverbot, boolean grenzengeschlossen, int beatmungsplätze) {         // Instanzvariable initialisieren
            Name = name;
            Einwohnerzahl = einwohnerzahl;
            Erkrankte = erkrankte;
            Genesene = genesene;
            SchulenGeschlossen = schulenGeschlossen;
            Ausgangssperre = ausgangssperre;
            Kontaktverbot = kontaktverbot;
            GrenzenGeschlossen = grenzengeschlossen;
            Beatmungsplätze = beatmungsplätze;
            Ansteckungswahrscheinlichkeit = 10;
            AnzahlKontakte = 0;
        }

        /**
         * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen      *
         *
         * @param y ein Beispielparameter für eine Methode
         * @return die Summe aus x und y
         */
        public void schulenSchließen() {
            if (SchulenGeschlossen = false) {
                SchulenGeschlossen = true;
            }
        }

        public String KontakanzahlBestimmen() {
            if (SchulenGeschlossen = false && Ausgangssperre = false && Kontaktverbot = false && GrenzenGeschlossen = false) {
                AnzahlKontakte = 100;
            } else {
                if (SchulenGeschlossen = true && Ausgangssperre = false && Kontaktverbot = false && GrenzenGeschlossen = false) {
                    AnzahlKontakte = 60;
                } else {
                    if (SchulenGeschlossen = true && Ausgangssperre = false && Kontaktverbot = true && GrenzenGeschlossen = false) {
                        AnzahlKontakte = 15;
                    } else {
                        if (SchulenGeschlossen = true && Ausgangssperre = false && Kontaktverbot = true && GrenzenGeschlossen = true) {
                            AnzahlKontakte = 13;
                        } else {
                            AnzahlKontakte = 100;
                        }
                    }
                }
            }
            if (SchulenGeschlossen = true && Ausgangssperre = true && Kontaktverbot = true && GrenzenGeschlossen = true) {
                AnzahlKontakte = 4;
            }
        }

        public void ausgangssperreErlassen() {

            if (Ausgangssperre = false) {
                Ausgangssperre = true;
            }
        }

        public void kontaktverbotErlassen() {
            if (Kontaktverbot = false) {
                Kontaktverbot = true;
            }
        }

        public void grenzenSchließen() {
            if (GrenzenGeschlossen = false) {
                GrenzenGeschlossen = true;
            }
        }

        public String getName() {
            return Name;
        }

        public int getEinwohnerzahl() {
            return Einwohnerzahl;
        }

        public int getErkrankte() {
            return Erkrankte;
        }

        public int getGenesene() {
            return Genesene;
        }

        public boolean getSchulenGeschlossen() {
            return SchulenGeschlossen;
        }

        public boolean getAusgangssperre() {
            return Ausgangssperre;
        }

        public boolean getKontaktverbot() {
            return Kontaktverbot;
        }

        public boolean getGrenzenGeschlossen() {
            return GrenzenGeschlossen;
        }

        public int getBeatmungsplätze() {
            return Beatmungsplätze;
        }
    }
}