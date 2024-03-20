package cardiac_diseases;
import java.util.HashMap;
import java.util.Map;

public class Summary {

    private Map<Disease, String> diseaseSummary;

    public Summary(){
        diseaseSummary = new HashMap<>();
        initialize();
    }

    private void initialize(){
        diseaseSummary.put(Disease.VARICOSE_VEINS, "Varicose veins are swollen, twisted veins that you can see just under the skin.\nThey usually occur in the legs, but also can form in other parts of the body.\nHemorrhoids are a type of varicose vein. Your veins have one-way valves that help keep blood flowing toward your heart.\nIf the valves are weak or damaged, blood can back up and pool in your veins.\nThis causes the veins to swell, which can lead to varicose veins.");
        diseaseSummary.put(Disease.PULMONAR_STENOSIS, "Pulmonic stenosis is a heart valve disorder that involves the pulmonary valve.\nThis is the valve separating the right ventricle (one of the chambers in the heart) and the pulmonary artery.\nThe pulmonary artery carries oxygen-poor blood to the lungs.\nStenosis, or narrowing, occurs when the valve cannot open wide enough. As a result, less blood flows to the lungs.");
        diseaseSummary.put(Disease.AORTIC_STENOSIS, "The aorta is the main artery that carries blood out of the heart to the rest of the body.\nBlood flows out of the heart and into the aorta through the aortic valve.\nIn aortic stenosis, the aortic valve does not open fully.\nThis decreases blood flow from the heart. ");
        diseaseSummary.put(Disease.AORTIC_INSUFICIENCY, "Aortic insufficiency is a heart valve disease where the aortic valve no longer functions adequately to control the flow of blood from the left ventricle into the aorta.\nCommonly, aortic insufficiency shows no symptoms for many years. Symptoms may then occur gradually or suddenly.\nSurgical repair or replacement of the aortic valve corrects aortic insufficiency.");
        diseaseSummary.put(Disease.MITRAL_INSUFICIENCY, "Mitral regurgitation is a disorder in which the mitral valve on the left side of the heart does not close properly.\nRegurgitation means leaking from a valve that does not close all the way. ");
        diseaseSummary.put(Disease.MITRAL_STENOSIS, "Mitral stenosis is a disorder in which the mitral valve does not fully open. This restricts the flow of blood. ");
        diseaseSummary.put(Disease.REVERSIBLE_CRASH, "Shock is a clinical syndrome that leads to reduced perfusion of tissues and organs, and the insufficiency of the latter.\nIt can be classified into three categories: distributive (neurogenic and septic), cardiogenic and hypovolemic. ");
        diseaseSummary.put(Disease.PROGRESSIVE_CRASH, "Shock is a clinical syndrome that leads to reduced perfusion of tissues and organs, and the insufficiency of the latter.\nIt can be classified into three categories: distributive (neurogenic and septic), cardiogenic and hypovolemic. ");
        diseaseSummary.put(Disease.COMPENSATORY_CRASH, "Shock is a clinical syndrome that leads to reduced perfusion of tissues and organs, and the insufficiency of the latter.\nIt can be classified into three categories: distributive (neurogenic and septic), cardiogenic and hypovolemic. ");
        diseaseSummary.put(Disease.REUMATIC_HEART_FAILURE, "Rheumatic heart disease refers to the cardiac manifestations of rheumatic fever, including pancarditis during early acute phase and chronic valvular disease later on.\nIntroduces Yourself heart involvement in up to 50% of patients.\nRheumatic fever tends to run in families, which supports the existence of a genetic predisposition. Environmental factors also appear to be important for the development of the disease.");
        diseaseSummary.put(Disease.RAYNAUD_DISEASE, "Raynaud's disease is a rare disorder of the blood vessels, usually in the fingers and toes.\nIt causes the blood vessels to narrow when you are cold or feeling stressed. When this happens, blood can't get to the surface of the skin and the affected areas turn white and blue.\nWhen the blood flow returns, the skin turns red and throbs or tingles.\nIn severe cases, loss of blood flow can cause sores or tissue death. ");
        diseaseSummary.put(Disease.PERICARDITIS, "Pericarditis is a condition in which the sac-like covering around the heart (pericardium) becomes inflamed.");
        diseaseSummary.put(Disease.MYOCARDYTIS, "Myocarditis is inflammation of the heart muscle. When you have an infection, your immune system produces special cells to fight off disease.\nIf the infection affects your heart, the disease-fighting cells enter the heart. However, the chemicals made by these cells can also damage the heart muscle.\nAs a result, the heart can become thick, swollen, and weak. ");
        diseaseSummary.put(Disease.MYOCARDIAL_INFARCTION, "Each year almost 800,000 Americans have a heart attack. A heart attack happens when blood flow to the heart suddenly becomes blocked.\nWithout the blood coming in, the heart can't get oxygen. If not treated quickly, the heart muscle begins to die.\nBut if you do get quick treatment, you may be able to prevent or limit damage to the heart muscle.\nThat's why it's important to know the symptoms of a heart attack and call 911 if you or someone else is having them.\nYou should call, even if you are not sure that it is a heart attack.");
        diseaseSummary.put(Disease.MITRAL_VALVE_PROLAPSE, "Mitral valve prolapse (MVP) happens when the flaps of the mitral valve become floppy and don't close tightly.\nIn some cases, blood may leak backwards through the valve to the chamber it came from. This is called backflow, or regurgitation.\nWhen there is a lot of mitral valve backflow, the heart can't push enough blood out to the body.\nBut most people who have MVP don't have any backflow. In fact, MVP doesn't cause any health problems for most people who have it.");
        diseaseSummary.put(Disease.HYPERTENSION, " To diagnose high blood pressure, your health care provider examines you and asks questions about your medical history and any symptoms.\nYour provider listens to your heart using a device called a stethoscope. Your blood pressure is checked using a cuff, usually placed around your arm.");
        diseaseSummary.put(Disease.RIGHT_HEART_FAILURE, "Heart failure means that your heart can't pump enough oxygen-rich blood to meet your body's needs.\nHeart failure doesn't mean that your heart has stopped or is about to stop beating.\nBut without enough blood flow, your organs may not work well, which can cause serious problems.\nWith right-sided heart failure, your heart is too weak to pump enough blood to your lungs to get oxygen. ");
        diseaseSummary.put(Disease.LEFT_HEART_FAILURE, "Heart failure means that your heart can't pump enough oxygen-rich blood to meet your body's needs.\nHeart failure doesn't mean that your heart has stopped or is about to stop beating.\nBut without enough blood flow, your organs may not work well, which can cause serious problems.\nWith left-sided heart failure, your heart can't pump enough oxygen-rich blood out to your body.\nThis happens when the left side of your heart becomes either: Too weak to pump enough blood. Too thick or stiff to relax and fill with enough blood. ");
        diseaseSummary.put(Disease.ENDOCARDITIS, "Endocarditis is sometimes called infective endocarditis.\nIt's a rare, but life-threatening inflammation of the lining inside your heart's chambers and valves (the endocardium).\nEndocarditis is usually caused by germs that get into your bloodstream and travel to your heart.\nOnce they get inside your heart, the germs can attach to the lining or get trapped in the valves. They start to grow, causing an infection.\nIf not treated quickly, the infection can cause damage to the heart and lead to serious health problems. ");
        //TODO the rest of diseases
    }

    public String getSummary(Disease disease) {
        return diseaseSummary.getOrDefault(disease, "Summary not available for this disease.");
    }

    public void displaySummary(Disease disease) {
        String summary = getSummary(disease);
        System.out.println(summary);
    }

    //TODO delete
    public static void main(String[] args) {
        Summary summaries = new Summary();

        // Displaying summary for a specific disease
        Disease disease = Disease.ENDOCARDITIS;
        System.out.println("Summary for " + disease + ":");
        summaries.displaySummary(disease);
    }
}
