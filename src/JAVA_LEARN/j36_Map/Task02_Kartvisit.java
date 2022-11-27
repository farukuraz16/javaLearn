package JAVA_LEARN.j36_Map;

public class Task02_Kartvisit {
        String isim;
        String email;
        String adres;
        String telefon;
        int ID=100;

    public Task02_Kartvisit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        ID++;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\''
               ;
    }
}
