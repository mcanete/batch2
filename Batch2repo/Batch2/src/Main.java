import classes.Customer;
import classes.Employee;
import classes.MyMethods;
import classes.Person;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // variable
        /*byte variable1 = 127;
        short variable2 = 32767;
        int variable3 = 83578375;
        long variable4 = 294567892;
        float variable5 = 726.478f;
        double variable6 = 9023456.24567d;
        boolean variable7 = true;
        char variable8 = 'M';
        String ErrorMessages []= new String[3];
        ErrorMessages[0] ="syntax error!";
        ErrorMessages[1] ="memory exceed!";
        ErrorMessages[2] ="maximum amount exceeded";
        System.out.println("integer: "+variable1);
        System.out.println("short: "+variable2);
        System.out.println("integer: "+variable3);
        System.out.println("long: "+variable4);
        System.out.println("float: "+variable5);
        System.out.println("double: "+variable6);
        System.out.println("boolean: "+variable7);
        System.out.println("character: "+variable8);
        System.out.println("Possible errors are: ");
        System.out.println(" "+ErrorMessages [0]);
        System.out.println(" "+ErrorMessages [1]);
        System.out.println(" "+ErrorMessages [2]);*/

        //class and objects
        //Person person = new Person("Boglort");
        /*personObject.setName("Mark Ariston Canete");
        personObject.setEmail("mark.vsmmc@gmail.com");
        personObject.setAge(35);
        personObject.setWeight(102.3f);
        personObject.setHeight(177f);
        personObject.setGender(true);
        String name = personObject.getName();
        String email = personObject.getEmail();
        int age = personObject.getAge();
        float weight = personObject.getWeight();
        float height = personObject.getHeight();
        boolean gender = personObject.isGender();
        System.out.println("name: "+name);
        System.out.println("email: "+email);
        System.out.println("age: "+age);
        System.out.println("weight: "+weight);
        System.out.println("height: "+height);
        System.out.println("gender: "+gender);*/

        //inheritance

        /*Employee employee = new Employee();
        Customer customer = new Customer();
        employee.setName("Butchokoy");
        employee.setEmail("butchokoy@gmail.com");
        employee.setAge(21);
        employee.setHeight(155f);
        employee.setWeight(100f);
        employee.setDepartment("IT DEPT");
        employee.setEmployeeid(100383788);
        employee.setSssid(100527228);
        employee.setPagibigid(2007121453);
        //employee.introduceYourSelf();



        customer.setName("Butchakay");
        customer.setEmail("butchakay@gmail.com");
        customer.setAge(20);
        customer.setHeight(155f);
        customer.setWeight(100f);
        customer.setCustomerid(100383788);
        customer.setMembershiplevel(1);
        customer.setCreditcardnumber(100527228);
        //customer.introduceYourSelf();


       /*System.out.println("Hi I am an employee "+employee.introduceYourSelf());
        System.out.println("Hi I am an employee "+employee.introduceYourself("Mckoy"));
        System.out.println("Employee name: "+employee.getName());
        System.out.println("Employee email: "+employee.getEmail());
        System.out.println("Employee Age: "+employee.getAge());
        System.out.println("Employee Height: "+employee.getHeight());
        System.out.println("Employee weight: "+employee.getWeight());
        System.out.println("Employee Department: "+employee.getDepartment());
        System.out.println("Employee ID number: "+employee.getEmployeeid());
        System.out.println("Employee SSID: "+employee.getSssid());
        System.out.println("Employee PAGIBIGID: "+employee.getPagibigid());

        System.out.println("Hi I am a customer "+customer.introduceYourSelf());
        System.out.println("Customer name: "+customer.getName());
        System.out.println("Customer age: "+customer.getAge());
        System.out.println("Customer height: "+customer.getHeight());
        System.out.println("Customer weight: "+customer.getWeight());
        System.out.println("Customer ID: "+customer.getCustomerid());
        System.out.println("Customer Credit card: "+customer.getCreditcardnumber());
        System.out.println("Customer Member level: "+customer.getMembershiplevel());

        System.out.println("Hi I am an employee "+employee.introduceYourself("Mackoy"," of HR Department"," from cebu city"));*/
        /*int number = 1;

        if (number<3) {
            System.out.println(number + " is less than 3");
        }
        else
        {
            System.out.println(number +" is equal or more than 3");
        }*/

        Scanner userInput = new Scanner(System.in);


        /*System.out.println("Please input number of students:");
        int students = userInput.nextInt();
        if (students<=15)
        {
            System.out.println("Date: Monday");
            System.out.println("Current subject is Math and teacher1 has less than or equal to 15");
        }
        else
        {
            if (students==20)
            {
                System.out.println("Date: Tuesday");
                System.out.println("Subject is Science and teacher3 has total of 20 students");
            }
            else
                {
                    if(students>15&&students<20)
                    {
                        System.out.println("Date: WED-FRI");
                        System.out.println("Subject is English,OOP and Server Maintenance. Teachers2,4,and 5 has less than 20");
                    }
                    else
                    {
                        System.out.println("Date: WED-FRI");
                        System.out.println("Subject is English,OOP and Server Maintenance. Teachers2,4,and 5 has greater than 20");
                    }
                }
        }*/
        /*boolean weekday,weekend,holiday;
        System.out.println("Is it holiday?");
        holiday = userInput.hasNextBoolean();
        System.out.println("Is it weekday?");
        weekday=userInput.hasNextBoolean();
        weekday = false;
        holiday = false;

        if(weekday==true&&holiday==false)
        {
            System.out.println("Today is working day");
        }
        else
        {
            if(weekday==true&&holiday==true)
            {
                System.out.println("Today is vacation day");
            }
            else
            {
                if(weekday==false&&holiday==false)
                {
                    System.out.println("Today is vacation day");
                }
                else
                {
                    if(weekday==false&&holiday==true)
                    {
                        System.out.println("Today is vacation day");
                    }
                }
            }
        }*/

    /*boolean student,work;

        student=false;
        work=false;

        System.out.println("You can take " + MyMethods.Subjects(student,work));*/


               /* if(!regular&&partime||regular&&partime)
                {
                    System.out.println("You can take 6 subjects");
                }
                else
                {
                    if(!regular&&!partime)
                    {
                        System.out.println("You can take 5 subjects");
                    }
                    else
                        {
                        System.out.println("You can take 7 subjects");
                        }
                }*/
                /*int number = 1;
                   MyMethods.whileLoop(number);*/

                /*boolean check = false;

        if (check == !true)
        {
            System.out.println("It is true");
        }
        else
            System.out.println("It is false");*/

        //System.out.println("Sum = "+MyMethods.getsum());
        //do while exercise
       /* int numberToAdd;
        System.out.println("Please Input number to display: ");
        numberToAdd=userInput.nextInt();
        System.out.println(MyMethods.doWhileLoop(numberToAdd));*/
        int limiter;

        /*String printNames[] = new String[5];
        for (limiter=0;limiter<5;limiter++)
        {
            System.out.println("Enter a name: ");
            printNames[limiter]= userInput.next();
        }
        for (limiter=0;limiter<5;limiter++)
        {
            System.out.println(printNames[limiter]);
        }*/

      /*  String printNames []= {"bogart","boglort","chokart","boyoyoy","timoy"};
        for (limiter=0;limiter<5;limiter++)
        {
            System.out.println(printNames[limiter]);
        }*/

      //random shuffling
        String randomName[] = new String[2];
        randomName[0] = MyMethods.takeMyFriend();
        randomName[1] = MyMethods.takeMygirls();

        int palibog,palibog2;
        do
        {
            palibog = MyMethods.pal1();
            palibog2 = MyMethods.pal2();
        }while(palibog == palibog2);

      System.out.println(randomName[palibog]+" "+MyMethods.status()+" "+randomName[palibog2]);
    }
   /*public static int Subjects(boolean student, boolean work)
    {
        int subjects;

        if (work)
        {
            subjects = 6;
        } else if (student)
        {
            subjects=7;
        }else subjects = 5;

        return subjects;
    }*/



}



