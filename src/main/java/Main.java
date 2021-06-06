import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("What is your weight(in pounds)?");
        Scanner scanner = new Scanner(System.in);
        int goodToGo = 0;
        String W = scanner.nextLine();
        for (char c : W.toCharArray()) {
            if (Character.isAlphabetic(c)){
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
        }
        while(goodToGo == 1)
        {
            System.out.println("What is your weight? Please use numbers");
            W = scanner.nextLine();
            for (char c : W.toCharArray()) {
                if (Character.isAlphabetic(c)){
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        goodToGo = 0;
        double theWeight =Double.parseDouble(W);
        System.out.println("What is your height(in inches)?");
        String H = scanner.nextLine();
        for (char c : H.toCharArray()) {
            if (Character.isAlphabetic(c)){
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
        }
        while(goodToGo == 1)
        {
            System.out.println("What is your weight? Please use numbers");
            H = scanner.nextLine();
            for (char c : H.toCharArray()) {
                if (Character.isAlphabetic(c)){
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        goodToGo = 0;
        double theHeight =Double.parseDouble(H);
        double theBmi = ((theWeight / (theHeight * theHeight)) * 703);
        System.out.println("Your BMI is " + theBmi);
        if(theBmi <= 25 && theBmi >= 18.5)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
