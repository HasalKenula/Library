/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author User
 */
public class ReturnEntity {
    
    private String returnId;
    private String date;
    private String memId;
    private Double fine;

    public ReturnEntity() {
    }

    public ReturnEntity(String returnId, String date, String memId, Double fine) {
        this.returnId = returnId;
        this.date = date;
        this.memId = memId;
        this.fine = fine;
    }

    /**
     * @return the returnId
     */
    public String getReturnId() {
        return returnId;
    }

    /**
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the memId
     */
    public String getMemId() {
        return memId;
    }

    /**
     * @param memId the memId to set
     */
    public void setMemId(String memId) {
        this.memId = memId;
    }

    /**
     * @return the fine
     */
    public Double getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(Double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "ReturnEntity{" + "returnId=" + returnId + ", date=" + date + ", memId=" + memId + ", fine=" + fine + '}';
    }
    
    
    
}
