package cardiac_diseases;

import java.util.LinkedList;
import java.util.Objects;

public class Patient {

    private String name;
    private String surname;
    private int age;
    private Diseases disease;
    private LinkedList<Symptoms> symptoms = new LinkedList<>();

    public Patient (String name, String surname, int age, Diseases disease){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.disease = disease;
    }

    public Patient (String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Diseases getDisease() {
        return disease;
    }

    public void setDisease(Diseases disease) {
        this.disease = disease;
    }

    public LinkedList<Symptoms> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(LinkedList<Symptoms> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return age == patient.age && Objects.equals(getName(), patient.getName()) && Objects.equals(getSurname(), patient.getSurname()) && getDisease() == patient.getDisease() && Objects.equals(getSymptoms(), patient.getSymptoms());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), age, getDisease(), getSymptoms());
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", disease=" + disease +
                ", symptoms=" + symptoms +
                '}';
    }

    public static void main(String[] args){
        try{
            Patient patient1 = new Patient("Pepe", "Aparicio", 57, Diseases.INTERAURICULAR_COMMUNICATION );
            System.out.println(patient1);

            patient1.symptoms.add(Symptoms.BRADYCHARDIA);
            patient1.symptoms.add(Symptoms.STRIDOR);
            System.out.println(patient1);

        }catch(Exception ex){
            System.out.printf("Error: " + ex);}
    }
}
