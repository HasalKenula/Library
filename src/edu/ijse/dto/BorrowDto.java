/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BorrowDto {
    
    private String borrowId;
    private String date;
    private String memId;
    private String dueDate;
    
    private ArrayList<BorrowDetailDto> borrowDetailDtos;

    public BorrowDto() {
    }

    public BorrowDto(String borrowId, String date, String memId, String dueDate, ArrayList<BorrowDetailDto> borrowDetailDtos) {
        this.borrowId = borrowId;
        this.date = date;
        this.memId = memId;
        this.dueDate = dueDate;
        this.borrowDetailDtos = borrowDetailDtos;
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

    /**
     * @return the borrowDetailDtos
     */
    public ArrayList<BorrowDetailDto> getBorrowDetailDtos() {
        return borrowDetailDtos;
    }

    /**
     * @param borrowDetailDtos the borrowDetailDtos to set
     */
    public void setBorrowDetailDtos(ArrayList<BorrowDetailDto> borrowDetailDtos) {
        this.borrowDetailDtos = borrowDetailDtos;
    }

    @Override
    public String toString() {
        return "BorrowDto{" + "borrowId=" + borrowId + ", date=" + date + ", memId=" + memId + ", dueDate=" + dueDate + ", borrowDetailDtos=" + borrowDetailDtos + '}';
    }

    
    
}
