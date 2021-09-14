import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        double c_from = scanner.nextDouble();
        System.out.println("What is the exchange rate?");
        double rate = scanner.nextDouble();
        double c_to = c_from * rate;
        double dollars = Math.round(c_to*100.0) / 100.0;
        System.out.println(c_from+" euros at an exchange rate of "+rate+" is\n"+dollars+
                " U.S. Dollars.");

    }
}
