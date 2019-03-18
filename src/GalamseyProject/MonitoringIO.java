package GalamseyProject;

import java.util.Scanner;

public class MonitoringIO {

    public static void main(String args[]){
        String prompt = "\nWhat would you like to do? Type a, b, c or d for desired option:";
        String prompt1 = " a. Enter Observatory data ";
        String prompt2 = " b. Enter Galamsey data";
        String prompt3 = " c. Monitor Statistics";
        String prompt4 = " d. Exit";
        String option = "Enter response here : ";

        Monitoring monitor = new Monitoring();

        while(true) {
            System.out.println(prompt);
            System.out.println(prompt1);
            System.out.println(prompt2);
            System.out.println(prompt3);
            System.out.println(prompt4);
            System.out.println();
            System.out.print(option);
            Scanner input = new Scanner(System.in);
            String response = input.nextLine();

            if (response.equals("a")) {
                Observatory observe = new Observatory();
                System.out.print("Enter Observatory Name : ");
                String obsvName = input.nextLine();
                observe.setObservatoryName(obsvName);
                System.out.print("Enter Observatory Country : ");
                String obsvCount = input.nextLine();
                observe.setObservatoryCountry(obsvCount);
                System.out.print("Enter Observatory Year : ");
                String obsvYear = input.nextLine();
                observe.setObservatoryYear(obsvYear);
                System.out.print("Enter Observatory Square Area : ");
                Double obsvSA = input.nextDouble();
                observe.setObservatoryArea(obsvSA);
                monitor.setObservatoryList(observe);
            }

            if (response.equals("b")) {
                Galamsey galamsey = new Galamsey();
                System.out.print("What is the Observatory name : ");
                String obsvName = input.nextLine();
                System.out.print("Enter Year of Galamsey Event : ");
                String galName = input.nextLine();
                galamsey.setYearOfEvent(galName);
                System.out.println("Enter number from 1-3 : 1 = Green, 2 = Yellow, 3 = Brown");
                System.out.print("Enter Color Value : ");
                int galcv = input.nextInt();
                galamsey.setColourValue(galcv);
                if (galcv == 1) {
                    galamsey.setVegetationColour("Green");
                }
                if (galcv == 2) {
                    galamsey.setVegetationColour("Yellow");
                }
                if (galcv == 1) {
                    galamsey.setVegetationColour("Brown");
                }
                if (galcv < 1 || galcv > 3) {
                    System.out.print("Enter number from 1-3 : 1 = Green, 2 = Yellow, 3 = Brown");
                    System.out.print("Enter Color Value : ");
                    int galcv1 = input.nextInt();
                    galamsey.setColourValue(galcv1);
                }
                System.out.print("Latitude : ");
                Double gallat = input.nextDouble();
                galamsey.setPosLatitude(gallat);
                System.out.print("Longitude : ");
                Double gallon = input.nextDouble();
                galamsey.setPosLongitude(gallon);
                for (Observatory o : monitor.getObservatoryList()){
                    if(o.getObservatoryName().equalsIgnoreCase(obsvName)){
                        o.setObservatoryGalamseyRecords(galamsey);
                        System.out.println("Successfully added to " + o.getObservatoryName());
                    }
                }
                System.out.println();
            }

            if (response.equals("c")) {
                String average = " Largest Average Galamsey(s) recorded : ";
                String max = " Largest Galamsey(s) recorded : ";
                String pro1 = " Above what colour value would you like to check? Response is from 1 - 3 ";
                String opt = "Enter response here : ";

                System.out.println(average + monitor.getMaxAvgGalamsey());
                System.out.println(max + monitor.getMaxMonGalamsey());
                System.out.println(pro1);
                System.out.print(opt);
                int value = input.nextInt();
                System.out.println(monitor.SelectedObservatoryRecords(value));
            }

            if (response.equals("d")) {
                System.out.println("Thank you for using our service");
                System.exit(0);
            }
        }

    }
}
