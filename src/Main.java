import java.util.ArrayList;
import java.util.Locale;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        int a = 5;
//        char b ='i';
//        long c = 400;
//        double d = 3.2;
//
//        String name = "John";
//        System.out.println(name.toUpperCase());
        System.out.println(addExclamationPoint("Anastasia"));

        ArrayList<Integer> a = new ArrayList<Integer>();
        doStuff();

    }

    public static String addExclamationPoint(String s){
        return s + "!";
    }

    public static void doStuff(){
        int a = 5;
        if(a == 0 ){
        } else if (a == 1){

        } else {
            System.out.println("It works");
            for (int i = 0; i < 8; i++) {
                for (int k = 0; k < 8; k++) {
                    System.out.println("Hi!");
                }
                System.out.println(i);
            }
        }

        try{
            System.out.println("5");
        } catch(Exception e){

        }
    }
}
