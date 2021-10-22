public class Hausverkauf {
    
    Kaeufer _kaeufer;
    Makler _makler;
    Haus _haus;

    public Hausverkauf(Makler makler, Kaeufer kaeufer, Haus haus){
        set_makler(_makler);
        set_kaeufer(_kaeufer);
        set_haus(_haus);
    }


    //Getter

    public Makler get_makler() {
        return _makler;
    }

    public Kaeufer get_kaeufer() {
        return _kaeufer;
    }

    public Haus get_haus() {
        return _haus;
    }

    //Setter

    public void set_makler(Makler _makler) {
        this._makler = _makler;
    }

    public void set_kaeufer(Kaeufer _kaeufer) {
        this._kaeufer = _kaeufer;
    }

    public void set_haus(Haus _haus) {
        this._haus = _haus;
    }

}
