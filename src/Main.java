import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        try{
            checkAge(18);
        }
        catch (AgeException e)
        {
            System.out.println("A problem occurred: " + e);
        }

        System.out.println("Enter \"e\" ");
        String s = scan.next();

        try{
            chckE(s);
        }
        catch (EException e){
            System.out.println("A problem occurred: " + e);
        }

        System.out.println("Don't enter\"5\"");
        int no5Pls = scan.nextInt();

        try{
            check5(no5Pls);
        }
        catch (no5Exception e){
            System.out.println("A problem occurred: " + e);
        }
    }

    private static void check5(int number) throws no5Exception {
        if (number == 5){
            throw new no5Exception("Error you can't enter \"5\"");
        }
        else {
            System.out.println("Correct number");
        }
    }

    private static void chckE(String s)throws EException {
        if (s.equals("e")){
            System.out.println("Correct this is \"e\"");
        }
        else{
            throw new EException("This is not \"e\"");
        }
    }

    private static void checkAge(int age)throws AgeException {
        if (age < 18){
            throw new AgeException("\n you must be 18+ to sign up");
        }
        else {
            System.out.println("\n you are now sign up");
        }
    }
}