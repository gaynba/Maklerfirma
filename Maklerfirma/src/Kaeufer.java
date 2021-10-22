public class Kaeufer {
    
    String _vorname;
    String _nachname;
    

    public Kaeufer(String vorname, String nachname){
        set_vorname(_vorname);
        set_nachname(_nachname);
        
    }

    public String get_vorname() {
        return _vorname;
    }

    public String get_nachname() {
        return _nachname;
    }

   


    public void set_vorname(String _vorname) {
        this._vorname = _vorname;
    }

    public void set_nachname(String _nachname) {
        this._nachname = _nachname;
    }


}
