/**
 * Created by Rafal Gromek on @ {DATE}.
 */
public class User {

    private String imie;
    private String nazwisko;
    private String plec;
    private int wiek;
    private String mail;

    public User(String imie, String nazwisko, String plec, int wiek,String mail){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.wiek = wiek;
        this.mail =mail;
    }

    public void logowanie (){

    }
    public void usuniecieKonta () {

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public int getWiek() {
        return wiek;
    }

    public String getMail() {
        return mail;
    }
}