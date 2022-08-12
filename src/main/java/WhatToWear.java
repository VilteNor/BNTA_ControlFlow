import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {

//        Allow your program to collect some descriptive user input about the weather ("rainy", "sunny", "cloudy", "snow", etc)
//        and the average temperature for the day (8, 18, 28, etc).
//        Let your program output clothing suggestions depending on a combination of weather conditions and
//        temperature.
//         e.g. if it is both "rainy" and less than 12 degrees, output "wear a waterproof winter coat"

        System.out.println("how does the weather seem? (e.g. rainy, sunny, cloudy, snowy)");
        Scanner weatherReader = new Scanner(System.in);
        String weatherInfo = weatherReader.nextLine();
        System.out.println("what is the average temperature today?");
        Scanner tempReader = new Scanner(System.in);
        int temperature = tempReader.nextInt();

        if (weatherInfo.equals("rainy") && temperature<=12){
            System.out.println("wear a waterproof winter coat.");
        }
        else if (weatherInfo.equals("rainy") && temperature>13){
            System.out.println("wear a light waterproof coat.");
        }
        else if (weatherInfo.equals("sunny") && temperature<=12){
            System.out.println("wear a winter coat.");
        }
        else if (weatherInfo.equals("sunny") && temperature<=20){
            System.out.println("wear a light jacket.");
        }
        else if (weatherInfo.equals("sunny") && temperature>21){
            System.out.println("wear summer clothes, it's hot outside.");
        }

        else if (weatherInfo.equals("cloudy") && temperature<=12){
            System.out.println("wear a winter coat and take an umbrella.");
        }
        else if (weatherInfo.equals("cloudy") && temperature<=20){
            System.out.println("wear a warm coat and take an umbrella.");
        }
        else if (weatherInfo.equals("cloudy") && temperature>21){
            System.out.println("wear summer clothes and take an umbrella.");
        }
        else if (weatherInfo.equals("snowy") && temperature<=0){
            System.out.println("wear a waterproof thick winter coat.");
        }
        else if (weatherInfo.equals("snowy") && temperature<5){
            System.out.println("wear a winter coat, but the snow might melt soon.");
        }
        else if (weatherInfo.equals("snowy") && temperature>5){
            System.out.println("are you sure it's really snowing outside?");
        }
        else {
            System.out.println("you have to decide what to wear yourself");
        }
    }
    }
