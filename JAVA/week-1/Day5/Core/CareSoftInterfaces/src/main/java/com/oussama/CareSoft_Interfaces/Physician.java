package com.oussama.CareSoft_Interfaces;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    private ArrayList<String> patientNotes;
    private Integer id;



    public Physician(Integer id) {
        this.id = id;
    }

    // TO DO: Constructor that takes an IDcopy

    @Override
    public boolean assignPin(int pin) {

        if (pin>999 && pin<10000){
            return true;

        }
        return false ;
        // Method implementation goes here
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID){

        if(confirmedAuthID==this.id){
            return true;

        }
        return false;
    }


    // TO DO: Implement HIPAACompliantUser!

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
                "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    // TO DO: Setters & Getters
}