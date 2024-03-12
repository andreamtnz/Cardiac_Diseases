package cardiac_diseases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                case 1: {
                    //TODO
                }
                case 2: {
                    //TODO
                }
                case 3: {
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
        Patient patient = new Patient(name, surname, age);
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


}
