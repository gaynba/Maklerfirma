public class Wohnungverkauf {

    Wohnung _wohnung;
    Kaeufer _kaeufer;
    Makler makler;


    public Wohnungverkauf(Makler makler, Kaeufer kaeufer, Wohnung wohnung){

    }

    // Getter

    public Makler getMakler() {
        return makler;
    }

    public Kaeufer get_kaeufer() {
        return _kaeufer;
    }

    public Wohnung get_wohnung() {
        return _wohnung;
    }


    //Setter

    public void setMakler(Makler makler) {
        this.makler = makler;
    }

    public void set_kaeufer(Kaeufer _kaeufer) {
        this._kaeufer = _kaeufer;
    }

    public void set_wohnung(Wohnung _wohnung) {
        this._wohnung = _wohnung;
    }


}
