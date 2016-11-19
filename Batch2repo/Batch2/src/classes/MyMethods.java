package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B211 on 11/12/2016.
 */
public class MyMethods {
    public static int Subjects(boolean student, boolean work)
    {
        //if/else if

        int subjects = 6;
        if (work)
        {
            subjects = 6;
        } else if (student)
        {
            subjects=7;
        }else subjects = 5;

        return subjects;
    }
    public static void whileLoop(int number)
    {
        //while statements

        while (number<7)
        {
            System.out.print("  [" + number + "]");
            number++;
        }

  }
    public static int getsum()
    {
        //while exercise

        int number = 0;
        int total=0;


        while(number<6)
        {
            number++;
            total+=number;
        }
        return total;


    }
    public static String doWhileLoop(int numberToAdd)
    {
        //do while statements
        int numbered =1;
        String Stringint="";
        do {
            //System.out.print("  [" + numbered + "]");
            Stringint+="[" + numbered + "] ";
            numbered++;
        } while (numbered < numberToAdd+1);
        return Stringint;
    }
    /*public static String forLoop()
    {
        int limiter;
        String printNames[] = new String [5];
        for (limiter=0,limiter<6,limiter++)

       return printNames;
    }*/
    public static String takeMyFriend()
    {
       //List interface arrays
        List<String> myFriends = new ArrayList<String>();
        myFriends.add("bogart");
        myFriends.add("boglort");
        myFriends.add("chokart");
        myFriends.add("boyoyoy");
        myFriends.add("timoy");
        Random rand = new Random();
        int value = rand.nextInt(5);

        return myFriends.get(value);
    }
    public static String takeMygirls()
    {
        List<String> myGirls = new ArrayList<String>();
        myGirls.add("Anna");
        myGirls.add("Lorna");
        myGirls.add("Fe");
        myGirls.add("Meann");
        myGirls.add("Gina");
        Random rand = new Random();
        int value = rand.nextInt(5);

        return myGirls.get(value);
    }
    public static String status()
    {
        List<String> currentStatus = new ArrayList<String>();
        currentStatus.add("love");
        currentStatus.add("hate");
        currentStatus.add("ewws");
        currentStatus.add("wins");
        currentStatus.add("trash");
        Random rand = new Random();
        int value = rand.nextInt(5);

        return currentStatus.get(value);
    }
    public static int pal1()
    {
        int palibog;
        Random rand = new Random();
        palibog = rand.nextInt(2);
        return palibog;
    }
    public static int pal2()
    {
        int palibog2;
        Random rand = new Random();
        palibog2 = rand.nextInt(2);
        return palibog2;
    }
}


// work?true:false;
