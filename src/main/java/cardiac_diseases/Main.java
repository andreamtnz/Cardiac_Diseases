package cardiac_diseases;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;




public class Main {
private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {

        boolean program = true;
        while (program) {

            printMenu();

            Scanner sc = new Scanner(System.in);
            Integer choice = Integer.parseInt(sc.nextLine());


            switch (choice) {
                case 1: { // Add patient
                    Patient patient = createPatient();
                    System.out.println(patient.getSymptoms());

                }
                case 2: { // Modify patient
                    //TODO
                }
                case 3: { // Make diagnosis
                    //TODO
                }
                case 4: {
                    //TODO
                }
                case 5: {
                    //TODO
                }
                case 6: {
                    //TODO
                }
                case 7: {
                    System.out.println("Closing app...");
                    program = false;
                }


            }
        }
    }

    private static void printMenu(){
        System.out.println("-----------------MENU-----------------");
        System.out.println("   1: Add patient ");
        System.out.println("   2: Modify patient");
        System.out.println("   3: Make diagnosis");

        System.out.println("   7: Exit");
    }

    private static Patient createPatient() throws IOException {

        System.out.println("Introduce the name of the patient:");
        String name = reader.readLine();
        System.out.println("Introduce the lastname of the patient:");
        String surname = reader.readLine();
        int age = readAge();
        showAllSymptoms();
        LinkedList<Symptom> symptoms = selectSymptoms();
        Patient patient = new Patient(name, surname, age, symptoms);
    return patient;
    }

    public static int readAge (){
        boolean check = false;
        String stringLeida="";
        int intLeido = 0;
        System.out.println("Introduce the age of the patient:");
        while (!check){
            try{
                stringLeida = reader.readLine();
                intLeido = Integer.parseInt(stringLeida);
                check=true;
            }catch (IOException ioe){
                System.out.println("Error while reading.");
            }catch (NumberFormatException nfe){
                System.out.println("You must enter an integer number.");
            }
        }
        return intLeido;
    }

    public static void showAllSymptoms(){
        Symptom [] valores = Symptom.values();
        int n= 0;
        for (Symptom symptom : valores) {
            System.out.println(n + "." +symptom);
            n++;
        }
    }

    public static LinkedList<Symptom> selectSymptoms(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of selected symptoms (separated by spaces): ");
        String input = sc.nextLine();
        Symptom [] symptoms = Symptom.values();
        // Split the input by spaces and convert them to integers
        String[] numbers = input.split("\\s+");
        LinkedList<Symptom> selectedSymptoms = new LinkedList<>();
        int numberOfSympltoms = 156;
        for (String number : numbers) {
            int index = Integer.parseInt(number) - 1;
            if (index >= 0 && index < symptoms.length && !selectedSymptoms.contains(symptoms[index]) && index <= numberOfSympltoms ) {
                selectedSymptoms.add(symptoms[index]);
            }
        }
        return selectedSymptoms;
    }



}
