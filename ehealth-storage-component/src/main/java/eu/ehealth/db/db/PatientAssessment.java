package eu.ehealth.db.db;
// Generated Oct 1, 2013 11:39:06 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * PatientAssessment generated by hbm2java
 */
public class PatientAssessment  implements java.io.Serializable {


     private Integer id;
     private Integer patient;
     private Timestamp DateOfAssessment;
     private Integer Aetology;
     private Integer TimeElapsedSinceDiagnose;
     private Integer Severity;
     private String RelevantPathologyAntecedents;
     private String Comorbidity;
     private Integer CharlsonComobodityIndex;
     private Integer BarthelIndex;
     private Integer LawtonIndex;
     private Integer MMSE;
     private Integer MDRS;
     private BigDecimal BlessedScalePart1;
     private Integer BlessedScalePart2;
     private Integer BlessedScalePart3;
     private Integer ChecklistMBPC;
     private Integer NPQISeverity;
     private Integer NPQIStress;
     private Integer GDS;
     private Boolean Falls;
     private Boolean Incontinence;
     private Boolean Delirium;
     private Boolean Immobility;
     private Boolean SensorialDeficits;
     private String PharmacologyTreatment;
     private Patient m_Patient;
     private Set Measurements = new HashSet(0);

    public PatientAssessment() {
    }

    public PatientAssessment(Integer patient, Timestamp DateOfAssessment, Integer Aetology, Integer TimeElapsedSinceDiagnose, Integer Severity, String RelevantPathologyAntecedents, String Comorbidity, Integer CharlsonComobodityIndex, Integer BarthelIndex, Integer LawtonIndex, Integer MMSE, Integer MDRS, BigDecimal BlessedScalePart1, Integer BlessedScalePart2, Integer BlessedScalePart3, Integer ChecklistMBPC, Integer NPQISeverity, Integer NPQIStress, Integer GDS, Boolean Falls, Boolean Incontinence, Boolean Delirium, Boolean Immobility, Boolean SensorialDeficits, String PharmacologyTreatment, Patient m_Patient, Set Measurements) {
       this.patient = patient;
       this.DateOfAssessment = DateOfAssessment;
       this.Aetology = Aetology;
       this.TimeElapsedSinceDiagnose = TimeElapsedSinceDiagnose;
       this.Severity = Severity;
       this.RelevantPathologyAntecedents = RelevantPathologyAntecedents;
       this.Comorbidity = Comorbidity;
       this.CharlsonComobodityIndex = CharlsonComobodityIndex;
       this.BarthelIndex = BarthelIndex;
       this.LawtonIndex = LawtonIndex;
       this.MMSE = MMSE;
       this.MDRS = MDRS;
       this.BlessedScalePart1 = BlessedScalePart1;
       this.BlessedScalePart2 = BlessedScalePart2;
       this.BlessedScalePart3 = BlessedScalePart3;
       this.ChecklistMBPC = ChecklistMBPC;
       this.NPQISeverity = NPQISeverity;
       this.NPQIStress = NPQIStress;
       this.GDS = GDS;
       this.Falls = Falls;
       this.Incontinence = Incontinence;
       this.Delirium = Delirium;
       this.Immobility = Immobility;
       this.SensorialDeficits = SensorialDeficits;
       this.PharmacologyTreatment = PharmacologyTreatment;
       this.m_Patient = m_Patient;
       this.Measurements = Measurements;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPatient() {
        return this.patient;
    }
    
    public void setPatient(Integer patient) {
        this.patient = patient;
    }
    public Timestamp getDateOfAssessment() {
        return this.DateOfAssessment;
    }
    
    public void setDateOfAssessment(Timestamp DateOfAssessment) {
        this.DateOfAssessment = DateOfAssessment;
    }
    public Integer getAetology() {
        return this.Aetology;
    }
    
    public void setAetology(Integer Aetology) {
        this.Aetology = Aetology;
    }
    public Integer getTimeElapsedSinceDiagnose() {
        return this.TimeElapsedSinceDiagnose;
    }
    
    public void setTimeElapsedSinceDiagnose(Integer TimeElapsedSinceDiagnose) {
        this.TimeElapsedSinceDiagnose = TimeElapsedSinceDiagnose;
    }
    public Integer getSeverity() {
        return this.Severity;
    }
    
    public void setSeverity(Integer Severity) {
        this.Severity = Severity;
    }
    public String getRelevantPathologyAntecedents() {
        return this.RelevantPathologyAntecedents;
    }
    
    public void setRelevantPathologyAntecedents(String RelevantPathologyAntecedents) {
        this.RelevantPathologyAntecedents = RelevantPathologyAntecedents;
    }
    public String getComorbidity() {
        return this.Comorbidity;
    }
    
    public void setComorbidity(String Comorbidity) {
        this.Comorbidity = Comorbidity;
    }
    public Integer getCharlsonComobodityIndex() {
        return this.CharlsonComobodityIndex;
    }
    
    public void setCharlsonComobodityIndex(Integer CharlsonComobodityIndex) {
        this.CharlsonComobodityIndex = CharlsonComobodityIndex;
    }
    public Integer getBarthelIndex() {
        return this.BarthelIndex;
    }
    
    public void setBarthelIndex(Integer BarthelIndex) {
        this.BarthelIndex = BarthelIndex;
    }
    public Integer getLawtonIndex() {
        return this.LawtonIndex;
    }
    
    public void setLawtonIndex(Integer LawtonIndex) {
        this.LawtonIndex = LawtonIndex;
    }
    public Integer getMMSE() {
        return this.MMSE;
    }
    
    public void setMMSE(Integer MMSE) {
        this.MMSE = MMSE;
    }
    public Integer getMDRS() {
        return this.MDRS;
    }
    
    public void setMDRS(Integer MDRS) {
        this.MDRS = MDRS;
    }
    public BigDecimal getBlessedScalePart1() {
        return this.BlessedScalePart1;
    }
    
    public void setBlessedScalePart1(BigDecimal BlessedScalePart1) {
        this.BlessedScalePart1 = BlessedScalePart1;
    }
    public Integer getBlessedScalePart2() {
        return this.BlessedScalePart2;
    }
    
    public void setBlessedScalePart2(Integer BlessedScalePart2) {
        this.BlessedScalePart2 = BlessedScalePart2;
    }
    public Integer getBlessedScalePart3() {
        return this.BlessedScalePart3;
    }
    
    public void setBlessedScalePart3(Integer BlessedScalePart3) {
        this.BlessedScalePart3 = BlessedScalePart3;
    }
    public Integer getChecklistMBPC() {
        return this.ChecklistMBPC;
    }
    
    public void setChecklistMBPC(Integer ChecklistMBPC) {
        this.ChecklistMBPC = ChecklistMBPC;
    }
    public Integer getNPQISeverity() {
        return this.NPQISeverity;
    }
    
    public void setNPQISeverity(Integer NPQISeverity) {
        this.NPQISeverity = NPQISeverity;
    }
    public Integer getNPQIStress() {
        return this.NPQIStress;
    }
    
    public void setNPQIStress(Integer NPQIStress) {
        this.NPQIStress = NPQIStress;
    }
    public Integer getGDS() {
        return this.GDS;
    }
    
    public void setGDS(Integer GDS) {
        this.GDS = GDS;
    }
    public Boolean getFalls() {
        return this.Falls;
    }
    
    public void setFalls(Boolean Falls) {
        this.Falls = Falls;
    }
    public Boolean getIncontinence() {
        return this.Incontinence;
    }
    
    public void setIncontinence(Boolean Incontinence) {
        this.Incontinence = Incontinence;
    }
    public Boolean getDelirium() {
        return this.Delirium;
    }
    
    public void setDelirium(Boolean Delirium) {
        this.Delirium = Delirium;
    }
    public Boolean getImmobility() {
        return this.Immobility;
    }
    
    public void setImmobility(Boolean Immobility) {
        this.Immobility = Immobility;
    }
    public Boolean getSensorialDeficits() {
        return this.SensorialDeficits;
    }
    
    public void setSensorialDeficits(Boolean SensorialDeficits) {
        this.SensorialDeficits = SensorialDeficits;
    }
    public String getPharmacologyTreatment() {
        return this.PharmacologyTreatment;
    }
    
    public void setPharmacologyTreatment(String PharmacologyTreatment) {
        this.PharmacologyTreatment = PharmacologyTreatment;
    }
    public Patient getM_Patient() {
        return this.m_Patient;
    }
    
    public void setM_Patient(Patient m_Patient) {
        this.m_Patient = m_Patient;
    }
    public Set getMeasurements() {
        return this.Measurements;
    }
    
    public void setMeasurements(Set Measurements) {
        this.Measurements = Measurements;
    }




}

