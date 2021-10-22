public class App {
    
    /* 
    Aufgabe 1:
    Für das Projekt müssen die Klassen Haus, Wohnung, Käufer und Makler erstellt werden.
    Verbunden sein werden später die Klassen Wohnung und Haus mit den Klassen Makler und Käufer durch Objekte die im späteren Verkauf zusammengefügt werden in einen Verkauf.
    Die Eigenschaften werden in einem Verkauf dann gesammelt angezeigt, je nachdem für welche Objekte man sich entschieden hat.
    OOP basiert auf Objektorientierung und hat die Grundidee die reale Welt in einem Code abzubilden. In der OOP wird mit Klassen und Objekten gearbeitet. klassen dienen dabei als Baupläne für Objekte. Für eine Klasse können beliebig viele Objekte erstellt werden


    Aufgabe 4: Reservierung von Häusern mehrerer Käufer
    Um ein Haus für mehrere Käufer zu reservieren könnte man eine Reservierung erstellen in der man mit einer if-Abfrage überprüft ob der Käufer der reservieren will auch einen int reservierung hat mit dem er das Haus reservieren darf.


    */
    
    static Haus[] _haeuser;
    static Wohnung[] _wohnungen;
    static Kaeufer[] _kaeufer;
    static Makler[] _makler;
    static Hausverkauf[] _hausverkaeufe;
    static Wohnungverkauf[] _wohnungsverkaeufe;
    
    
    public static void main(String[] args) throws Exception {
        
        // Initialisieren der Arrays

        _haeuser = new Haus[1];
        _wohnungen = new Wohnung[1];
        _kaeufer = new Kaeufer[2];
        _makler = new Makler[2];
        _hausverkaeufe = new Hausverkauf[10];
        _wohnungsverkaeufe = new Wohnungverkauf[10];

        // Demodaten

        _haeuser[0] = new Haus("Luigis Mansion", 100000, "Von Geistern heimgesuchtes Gebäude", 5, 600);
        
        _wohnungen[0] = new Wohnung("Die Wohnung", 1400, "schöne Wohnung im Randgebiet Hamburg", 1, 120);

        _kaeufer[0] = new Kaeufer("Dusty", "Mayron");
        _kaeufer[1] = new Kaeufer("Brad", "Whitaker");

        _makler[0] = new Makler("James", "Bond");
        _makler[1] = new Makler("Megan", "Mayron");


        
        System.out.println("Haus 1" + _haeuser.Haus[0] + "Makler: James Bond " +  _makler.Makler[0] + "Käufer: Dusty Mayron " +  _kaeufer.Kaeufer[0] + "Reservierung: 1" );
    }

    

    


    

    

}
