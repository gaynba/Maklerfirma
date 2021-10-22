public class Haus {
    
    int _preis;
    int _stockwerke;
    int _quadratmeter;
    String _beschreibung;
    String _titel;
    
    
    public Haus(String titel, int preis, String beschreibung, int stockwerke, int quadratmeter){
        set_titel(_titel);
        set_preis(_preis);
        set_beschreibung(_beschreibung);
        set_stockwerke(_stockwerke);
        set_quadratmeter(_quadratmeter);
        
    }


    // Getter
    public String get_titel() {
        return _titel;
    }

    public int get_preis() {
        return _preis;
    }

    public String get_beschreibung() {
        return _beschreibung;
    }

    public int get_stockwerke() {
        return _stockwerke;
    }

    public int get_quadratmeter() {
        return _quadratmeter;
    }

    

    // Setter
    public void set_preis(int _preis) {
        this._preis = _preis;
    }

    public void set_titel(String _titel) {
        this._titel = _titel;
    }

    public void set_beschreibung(String _beschreibung) {
        this._beschreibung = _beschreibung;
    }

    public void set_stockwerke(int _stockwerke) {
        this._stockwerke = _stockwerke;
    }

    public void set_quadratmeter(int _quadratmeter) {
        this._quadratmeter = _quadratmeter;
    }

    


}
