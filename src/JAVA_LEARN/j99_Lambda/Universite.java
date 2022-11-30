package JAVA_LEARN.j99_Lambda;

public class Universite {

    private  String universite ;
    private  String bolum ;
    private  int ogrcSayisi ;
    private  int notOrt ;

    public Universite(String universite, String bolum, int ogrcSayisi, int notOrt) {//telescopic const.
        this.universite = universite;
        this.bolum = bolum;
        this.ogrcSayisi = ogrcSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrcSayisi() {
        return ogrcSayisi;
    }

    public void setOgrcSayisi(int ogrcSayisi) {
        this.ogrcSayisi = ogrcSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "universite='" + universite + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrcSayisi=" + ogrcSayisi +
                ", notOrt=" + notOrt;
    }}
