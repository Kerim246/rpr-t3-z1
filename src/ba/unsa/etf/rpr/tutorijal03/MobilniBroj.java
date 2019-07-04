package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    private int mreza;
    private String broj;

    public MobilniBroj(int mreza, String broj) throws IllegalArgumentException {
        if(mreza>67 || mreza<60)throw new IllegalArgumentException("Neispravna mreža!");
        this.mreza = mreza;
        this.broj = broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String ispisi() {
        return "0" + mreza + "/" + broj;
    }
}
