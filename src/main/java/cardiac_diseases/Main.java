package cardiac_diseases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;




public class Main {
private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
public static Hospital hospital;
public static File file;

    public static void main(String[] args) throws Exception {

        boolean program = true;
        Scanner sc = new Scanner(System.in);

        hospitalMenu();
        Integer num = Integer.parseInt(sc.nextLine());
        switch (num) {
            case 1: {
                System.out.println("Enter the name of the file you want to open: ");
                String name = sc.nextLine();
                file = new File(name);
                hospital = file.uploadCSV(); //creates a hospital based on the file
                break;
            }
            case 2: {
                System.out.println("Enter the name of the new file: ");
                String name = sc.nextLine();
                System.out.print("Creating new file...");
                hospital = new Hospital(name);
                file = new File(name);
                break;
            }
        }

        while (program) {

            printMenu();

            Integer choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: { // Add patient
                    Patient patient = createPatient();
                    System.out.println(patient.getSymptoms());
                    break;
                }
                case 2: { // Modify patient
                    //TODO
                    break;
                }
                case 3: { // Make diagnosis
                    //TODO
                    break;
                }
                case 7: {
                    boolean fileCreation = file.downloadCSV(hospital);
                    if (fileCreation){
                        System.out.print("Saved file correctly\n");
                    }else{
                        System.out.print("Couldn't save file correctly\n");
                    }
                    System.out.println("Closing app...");
                    program = false;
                }
            }
        }
        sc.close();
    }

    private static void printMenu(){
        System.out.println("-----------------MENU-----------------");
        System.out.println("   1: Add patient ");
        System.out.println("   2: Modify patient"); //TODO option to search for patients in the hospital
        System.out.println("   3: Make diagnosis"); //TODO select patient to make diagnosis

        System.out.println("   7: Exit");
    }

    private static void hospitalMenu(){
        System.out.println("-----------------WELCOME-----------------");
        System.out.println("Would you like to open a CSV with the patients or create a new one?:");
        System.out.println("   1: Open CSV ");
        System.out.println("   2: Create a new one");
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
        hospital.getListOfPatients().add(patient);
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
        int numberOfSymptoms = 156;
        for (String number : numbers) {
            int index = Integer.parseInt(number) - 1;
            if (index >= 0 && index < symptoms.length && !selectedSymptoms.contains(symptoms[index]) && index <= numberOfSymptoms ) {
                selectedSymptoms.add(symptoms[index]);
            }
        }
        sc.close();
        return selectedSymptoms;
    }



}
