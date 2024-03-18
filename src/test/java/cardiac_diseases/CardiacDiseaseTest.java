package cardiac_diseases;

import java.util.ArrayList;
import java.util.List;

import cardiac_diseases.*;
import dss.MeasurementUnit;
import org.drools.ruleunits.api.RuleUnitProvider;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CardiacDiseaseTest {

    static final Logger LOG = LoggerFactory.getLogger(dss.RuleTest.class);

    @Test
    public void test() {
        LOG.info("Creating RuleUnit");
        PatientUnit patientUnit = new PatientUnit();

        RuleUnitInstance<PatientUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(patientUnit);
        try {
            LOG.info("Insert data");
            Patient patient = new Patient("Blanca", "Pueche", 20);

            // 2. Setting properties
            List<Symptom> symptomList = new ArrayList<>();
            symptomList.add(Symptom.CHEST_PAIN);

            LOG.info("Run query. Rules are also fired");
            assertEquals(Disease.TEST, patient.getDisease());
        } finally {
            instance.close();
        }
    }
}