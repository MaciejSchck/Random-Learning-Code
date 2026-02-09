import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int inputNo = fetchUserInput();

        long start = (System.nanoTime());

        boolean isPrime = checkPrime(inputNo);

        printOutput(isPrime, inputNo);

        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println("Finished in " + duration + "ms.");
    }

    public static int fetchUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check: ");
        return scanner.nextInt();
    }

    public static boolean checkPrime(int inputNo){
        for(int i=2; i<=inputNo/2;i++){
            if(inputNo % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printOutput(boolean isPrime, int inputNo){
        if(isPrime){
            System.out.println(inputNo+" is prime.");
        }
        else{
            System.out.println(inputNo+" is primen't.");
        }
    }
}
