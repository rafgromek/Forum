/**
 * Created by Rafal Gromek on @ {DATE}.
 */
public class Application {

    public static void main(String[] args) {

        ForumUser user1 = new ForumUser("user:",
                4,true, "imie:", "nazwisko:",
                "plec:",30,"mail:");

        user1.przedstawUzytkownika();
    }
}
