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
public class Land
{     // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private double ansteckungswahrscheinlichkeit;//in Prozent
    private int einwohnerzahl;
    private int erkrankte;
    private int genesene;
    private boolean schulenGeschlossen;
    private boolean ausgangssperre;
    private boolean kontaktverbot;
    private boolean grenzenGeschlossen;
    private int beatmungsplätze;
    private int anzahlKontakte;

    /**
     * Konstruktor für Objekte der Klasse Land
     */
    public Land(String name, int einwohnerzahl, int erkrankte, int genesene, boolean schulenGeschlossen, boolean ausgangssperre, boolean kontaktverbot, boolean grenzengeschlossen, int beatmungsplätze)
    {         // Instanzvariable initialisieren
        this.name = name;
        this.einwohnerzahl = einwohnerzahl;
        this.erkrankte = erkrankte;
        this.genesene = genesene;
        this.schulenGeschlossen = schulenGeschlossen;
        this.ausgangssperre = ausgangssperre;
        this.kontaktverbot = kontaktverbot;
        this.grenzenGeschlossen = grenzengeschlossen;
        this.beatmungsplätze = beatmungsplätze;
        this.ansteckungswahrscheinlichkeit = 0.1;
        this.anzahlKontakte = 0;
    }

    /*
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen      *
     *
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public void schulenSchließen()
    {
        if (!schulenGeschlossen) {
            schulenGeschlossen = true;
        }
    }

    public void kontakanzahlBestimmen()
    {
        if (schulenGeschlossen == false && ausgangssperre == false && kontaktverbot == false && grenzenGeschlossen == false) {
            anzahlKontakte = 100;
        } else {
            if (schulenGeschlossen == true && ausgangssperre == false && kontaktverbot == false && grenzenGeschlossen == false) {
                anzahlKontakte = 60;
            } else {
                if (schulenGeschlossen == true && ausgangssperre == false && kontaktverbot == true && grenzenGeschlossen == false) {
                    anzahlKontakte = 15;
                } else {
                    if (schulenGeschlossen == true && ausgangssperre == false && kontaktverbot == true && grenzenGeschlossen == true) {
                        anzahlKontakte = 13;
                    } else {
                        anzahlKontakte = 100;
                    }
                }
            }
        }
        if (schulenGeschlossen == true && ausgangssperre == true && kontaktverbot == true && grenzenGeschlossen == true) {
            anzahlKontakte = 4;
        }
    }

    public void rundeSimulieren()
    {
        kontakanzahlBestimmen();
        int neueErkrankte, verstorbene, neueGenesene;
        neueErkrankte = (int) (erkrankte * anzahlKontakte * ansteckungswahrscheinlichkeit);
        neueGenesene = (int) (genesene + (erkrankte * 0.5));
        verstorbene = (int) (erkrankte * 0.05);
        erkrankte = neueErkrankte + erkrankte - neueGenesene - verstorbene;
        genesene = neueGenesene + genesene;
        einwohnerzahl = einwohnerzahl - neueGenesene - verstorbene;
    }


    public void ausgangssperreErlassen()
    {

        if (!ausgangssperre) {
            ausgangssperre = true;
        }
    }

    public void kontaktverbotErlassen()
    {
        if (!kontaktverbot) {
            kontaktverbot = true;
        }
    }

    public void grenzenSchließen()
    {
        if (!grenzenGeschlossen) {
            grenzenGeschlossen = true;
        }
    }

    public String getName()
    {
        return name;
    }

    public int getEinwohnerzahl()
    {
        return einwohnerzahl;
    }

    public int getErkrankte()
    {
        return erkrankte;
    }

    public int getGenesene()
    {
        return genesene;
    }

    public boolean getSchulenGeschlossen()
    {
        return schulenGeschlossen;
    }

    public boolean getAusgangssperre()
    {
        return ausgangssperre;
    }

    public boolean getKontaktverbot()
    {
        return kontaktverbot;
    }

    public boolean getGrenzenGeschlossen()
    {
        return grenzenGeschlossen;
    }

    public int getBeatmungsplätze()
    {
        return beatmungsplätze;
    }
}