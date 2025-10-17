import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        countdown(fetchUserInput());
        
    }
    private static int fetchUserInput(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter how many seconds to count down from: ");
        return scanner.nextInt();
    }
    private static void countdown(int inputVal){
        System.out.println(inputVal);
        if(inputVal <= 1){
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countdown(inputVal-1);
    }
}
