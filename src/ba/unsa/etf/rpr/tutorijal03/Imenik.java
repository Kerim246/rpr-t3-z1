package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    public HashMap<String, TelefonskiBroj> getBrojKorisnik() {
        return brojKorisnik;
    }

    private HashMap<String,TelefonskiBroj> brojKorisnik = new HashMap<>();

    public Imenik(){}

    public void dodaj(String ime_Prezime, TelefonskiBroj broj) {
        brojKorisnik.putIfAbsent(ime_Prezime,broj);
    }

    public String dajBroj(String ime_Prezime) {
        return brojKorisnik.get(ime_Prezime).ispisi();
    }

    public Set<String> izGrada(FiksniBroj.Grad nazivGrada) {
        Set<String> townPeople = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> element : brojKorisnik.entrySet()) {
            TelefonskiBroj broj = element.getValue();
            if (broj instanceof FiksniBroj){
                if(((FiksniBroj)broj).getGrad().equals(nazivGrada))townPeople.add(element.getKey());
            }
        }
        return townPeople;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad nazivGrada) {
        Set<TelefonskiBroj> brojeviIzGrada = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> element : brojKorisnik.entrySet()) {
            TelefonskiBroj broj = element.getValue();
            if (broj instanceof FiksniBroj){
                if(((FiksniBroj)broj).getGrad().equals(nazivGrada))brojeviIzGrada.add(element.getValue());
            }
        }
        return brojeviIzGrada;
    }

    public String naSlovo(char s) {
        int flag = 1;
        StringBuilder people = new StringBuilder();
        for(Map.Entry<String, TelefonskiBroj> element : brojKorisnik.entrySet()) {
            if(element.getKey().charAt(0)==s){
                people.append(String.format("%d. %s - %s\n", flag, element.getKey(), element.getValue().ispisi()));
                flag++;
            }
        }
        return people.toString();
    }

    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> element : brojKorisnik.entrySet()) {
            if(element.getValue().compareTo(broj)==0)
                return element.getKey();
        }
        return "";
    }
}


