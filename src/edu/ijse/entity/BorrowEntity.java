/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author User
 */
public class BorrowEntity {
    
    private String borrowId;
    private String date;
    private String memId;
    private String dueDate;

    public BorrowEntity() {
    }

    public BorrowEntity(String borrowId, String date, String memId, String dueDate) {
        this.borrowId = borrowId;
        this.date = date;
        this.memId = memId;
        this.dueDate = dueDate;
    }

    /**
     * @return the borrowId
     */
    public String getBorrowId() {
        return borrowId;
    }

    /**
     * @param borrowId the borrowId to set
     */
    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
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
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "BorrowEntity{" + "borrowId=" + borrowId + ", date=" + date + ", memId=" + memId + ", dueDate=" + dueDate + '}';
    }

    
    
}
