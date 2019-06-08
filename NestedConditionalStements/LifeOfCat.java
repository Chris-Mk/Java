package NestedConditionalStements;

import java.util.Scanner;

public class LifeOfCat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String breed = scan.nextLine();
        char gender = scan.next().charAt(0);
        double catMonths;

        if (breed.equals("BritishShorthair")) {
            if (gender == 'm') {
                catMonths = 13 * 2;
            } else {
                catMonths = 14 * 2;
            }
        } else if (breed.equals("Siamese")) {
            if (gender == 'm') {
                catMonths = 15 * 2;
            } else {
                catMonths = 16 * 2;
            }
        } else if (breed.equals("Persian")) {
            if (gender == 'm') {
                catMonths = 14 * 2;
            } else {
                catMonths = 15 * 2;
            }
        } else if (breed.equals("Ragdoll")) {
            if (gender == 'm') {
                catMonths = 16 * 2;
            } else {
                catMonths = 17 * 2;
            }
        } else if (breed.equals("AmericanShorthair")) {
            if (gender == 'm') {
                catMonths = 12 * 2;
            } else {
                catMonths = 13 * 2;
            }
        } else if (breed.equals("Siberian")) {
            if (gender == 'm') {
                catMonths = 11 * 2;
            } else {
                catMonths = 12 * 2;
            }
        } else {
            System.out.printf("%s is invalid cat!", breed);
            return;
        }
        System.out.printf("%.0f cat months", Math.floor(catMonths));
    }
}
