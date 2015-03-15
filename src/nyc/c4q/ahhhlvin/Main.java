package nyc.c4q.ahhhlvin;

public class Main {

    public static void main(String[] args) {


        /*******
         * WRITE VARIABLES AT THE TOP !!
         *******/
        int i = 3;
        int k = 0;
        String str = "c4q";

        System.out.println(i);


        for (i = 0; i < 10; i++) {

            System.out.println(weLoveJava(str)); //       will print out the RETURN of "c4q is SUPER awesome!"

        }


         i = 200;
         System.out.println(i);
    }


    public static String weLoveJava(String myStr) {
        System.out.println(myStr);  //      will print out the variable myStr = str = "c4q"

        return "c4q is SUPER awesome!";
    }
}









