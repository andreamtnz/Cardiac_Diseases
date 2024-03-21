package cardiac_diseases;

import java.io.*;
import java.util.LinkedList;

public class FileManager {

       private static String name ;

    public static  boolean downloadCSV(Hospital hospital){
            boolean check=true;

            try {
                File file= new File("C://" + hospital.getName() + ".xlsx");
                FileWriter fileWriter = new FileWriter(file);// FileWriter(file) da error

                String heading = "Hospital, Patient name,Patient Lastname, Patient Age, Symptoms, Disease\n";
                fileWriter.write(heading);
                for (Patient patient : hospital.getListOfPatients()){
                    String row = hospital.toString() +"," + patient.toString();
                    fileWriter.write(row);
                }
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                check = false;
            }
            return check;
        }

        public static Hospital uploadCSV() {
            Hospital hospital=null;

            LinkedList<Patient> listPatients = new LinkedList<>();

            try {
                FileReader fileCSV = new FileReader(name + ".xlsx");
                BufferedReader reader = new BufferedReader(fileCSV);

                String row = reader.readLine();//Se salta la linea del encabezado que es como se ha escrito en guardarCSV()
                row = reader.readLine();
                String[] data = row.split(",");
                hospital= new Hospital(data[0]);

                while ((row = reader.readLine()) != null) {
                    String symptomsData = data[4];
                    String[] symptomsArray = symptomsData.split(",");
                    LinkedList<Symptom> symptoms = new LinkedList<>();

                    for (String symptom : symptomsArray) {
                        try {
                            Symptom demoType = Symptom.valueOf(symptom);
                            symptoms.add(demoType);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: '" + symptom + "' is not a valid symptom for the enum.");
                        }
                    }

                    String diseaseData = data[5];
                    Disease disease = null;
                    try {
                         disease = Disease.valueOf(diseaseData);
                    }catch(IllegalArgumentException e) {
                        System.out.println("Error: '" + diseaseData + "' is not a valid disease for the enum.");
                    }

                    Patient Patient = new Patient(data[1],data[2], Integer.parseInt(data[3]),
                            symptoms, disease);
                    listPatients.add(Patient);
                    System.out.println(Patient);
                }
                hospital.setListOfPatients(listPatients);
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
                ex.printStackTrace();
            }
            return hospital;
        }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FileManager.name = name;
    }


    public static void  main(String [] args){
        Hospital hospital = new Hospital("Nuevo Hospital");

        LinkedList<Symptom> symptoms1 = new LinkedList<>();
        symptoms1.add(Symptom.BRADYCHARDIA);

        Patient patient1 = new Patient("Andrea", "Martinez", 20, symptoms1, Disease.AORTIC_INSUFICIENCY);
        LinkedList<Patient> patients = new LinkedList<>();
        patients.add(patient1);
        hospital.setListOfPatients(patients);

        boolean b = downloadCSV(hospital);
        if(b == true){
        System.out.println("todo okey");}
    }
}
