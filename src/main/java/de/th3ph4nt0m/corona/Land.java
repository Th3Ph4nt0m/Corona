package de.th3ph4nt0m.corona;

public class Land {

    //Parameter
    //Einwohner (infiziert, gesund, verstorben, wieder gesund)
    //Maßnahmen
    //Eigenschaften Land

    //rundeSimulieren()
    //getEinwohner()
    //getContacts() int
    //getAnsteckungswahrscheinlichkeit()
    //genesen()

    private String name;
    private int einwohnerzahl;
    private int erkrankte;
    private int bevölkerungsdichte;
    private boolean schulenGeschlossen;
    private boolean kontaktverbot;
    private boolean ausgangssperre;
    private int genesene;
    private int beatmungsgeräte;
    private boolean grenzenGeschlossen;

    /**
     * Konstruktor für Objekte der Klasse Land
     */
    public Land(String Name, int Einwohnerzahl, int Erkrankte, int Bevölkerungsdichte, boolean SchulenGeschlossen,
                boolean Kontaktverbot, boolean Ausgangssperre, int Genesene, int Beatmungsgeräte, boolean GrenzenGeschlossen) {
        name = Name;
        einwohnerzahl = Einwohnerzahl;
        erkrankte = Erkrankte;
        bevölkerungsdichte = Bevölkerungsdichte;
        schulenGeschlossen = SchulenGeschlossen;
        kontaktverbot = Kontaktverbot;
        ausgangssperre = Ausgangssperre;
        genesene = Genesene;
        beatmungsgeräte = Beatmungsgeräte;
        grenzenGeschlossen = GrenzenGeschlossen;
    }

    /*
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     *
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public void Schulenschließen() {
        if (schulenGeschlossen = false) {
            schulenGeschlossen = true;
        }
    }

    public void AusgangssperreErlassen() {
        if (ausgangssperre = false) {
            ausgangssperre = true;
        }
    }

    public void KontaktverbotErlassen() {
        if (kontaktverbot = false) {
            kontaktverbot = true;
        }
    }

    public void GrenzenSchließen() {
        if (grenzenGeschlossen = false) {
            grenzenGeschlossen = true;
        }
    }

    public String GetName() {
        return name;
    }

    public int GetEinwohnerzahl() {
        return einwohnerzahl;
    }

    public int GetErkrankte() {
        return erkrankte;
    }

    public int GetBevölkerungsdichte() {
        return bevölkerungsdichte;
    }

    public boolean GetSchulenGeschlossen() {
        return schulenGeschlossen;
    }

    public boolean GetKontaktverbot() {
        return kontaktverbot;
    }

    public boolean GetAusgangssperre() {
        return ausgangssperre;
    }

    public int GetGenesene() {
        return genesene;
    }

    public int GetBeatmungsgeräte() {
        return beatmungsgeräte;
    }

    public boolean GetGrenzensgeschlossen() {
        return grenzenGeschlossen;
    }


}
