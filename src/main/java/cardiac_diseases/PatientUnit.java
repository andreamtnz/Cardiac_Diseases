package cardiac_diseases;

import cardiac_diseases.Patient;
import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

import java.util.HashSet;
import java.util.Set;

public class PatientUnit implements RuleUnitData {

        private final DataStore<Patient> patients;
        private final Set<String> controlSet = new HashSet<>();

        public PatientUnit() {
            this(DataSource.createStore());
        }

        public PatientUnit(DataStore<Patient> patients) {
            this.patients = patients;
        }

        public DataStore<Patient> getPatients() {
            return patients;
        }

        public Set<String> getControlSet() {
            return controlSet;
        }
    }
