package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/14/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class LoopsReview {
    public static void main(String[] args) {

        int i = 3;
        int k = 0;

        System.out.println(i);



        for (i = 0; i < 10; i++) {
            int j =3;
            System.out.println(i);
            System.out.println(j);


        }


        while(terminate(k)) {
            k++;
            System.out.println(k); // when k = 9, terminate will evaluate to TRUE and go through k++ in the while loop, then it will print out '10'=k and that will go through the terminate method and evaluate to FALSE which will then not enter the while loop, thus the last printed value is 10 because that was what last printed by the while loop when it was able to enter as '9'=k
        }
    }

    public static boolean terminate(int cat) {

        if (cat < 10) {
            return true;
        } else {
            return false;
        }

    }
}
