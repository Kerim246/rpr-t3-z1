package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    public enum Grad { SARAJEVO, TUZLA, MOSTAR, BIHAC, GORAZDE}

    private Grad grad;
    private String broj;

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        String ispis="";
        switch (grad){
            case SARAJEVO:
                ispis+="033/";
                break;
            case TUZLA:
                ispis+="035/";
                break;
            case MOSTAR:
                ispis+="036/";
                break;
            case BIHAC:
                ispis+="037/";
                break;
            case GORAZDE:
                ispis+="038/";
                break;
        }
        ispis += broj;
        return ispis;

    }

    @Override
    public int hashCode() {
        return 0;
    }


}
