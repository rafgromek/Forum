/**
 * Created by Rafal Gromek on @ {DATE}.
 */
public class ForumUser  extends User {

    private String nazwaUzytkownika;
    private int liczbaPostow;
    private boolean zalogowany;

    public ForumUser(String nazwaUzytkownika, int liczbaPostow, boolean zalogowany, String imie, String nazwisko,
                     String plec, int wiek, String mail) {

        super (imie, nazwisko, plec, wiek, mail);
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.liczbaPostow = liczbaPostow;
        this.zalogowany = zalogowany;
    }

    public String getNazwaUzytkownika() {
        return nazwaUzytkownika;
    }

    public int getLiczbaPostow() {
        return liczbaPostow;
    }

    public boolean isZalogowany() {
        return zalogowany;
    }

    public void opublikowaniePostu () {

    }
    public void komentowaniePostu () {

    }
    public void przedstawUzytkownika () {


        System.out.println(nazwaUzytkownika);
        System.out.println(getImie());
        System.out.println(getNazwisko());
        System.out.println(getMail());
        System.out.println(getPlec());



    }
}
