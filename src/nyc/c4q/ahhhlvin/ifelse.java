package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/14/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class ifelse {
    public static void main(String[] args) {

        int age = 68;

        if (age > 67) {   // IF, ELSE IF, ELSE WILL ONLY EXECUTE ONE OF THE OPTIONS (MUTUALLY EXCLUSIVE) !
            System.out.println("You are a little too old to be getting drunk");

        } else if ( age > 21 ) {
            System.out.println("Lets get crunk!");
        } else {
            System.out.println("You should drink apple juice");
        }





    }
}
