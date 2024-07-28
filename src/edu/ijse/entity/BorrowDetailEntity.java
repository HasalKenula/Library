/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author User
 */
public class BorrowDetailEntity {
    
    private String borrowId;
    private String bkCode ;
    private Integer qty;

    public BorrowDetailEntity() {
    }

    public BorrowDetailEntity(String borrowId, String bkCode, Integer qty) {
        this.borrowId = borrowId;
        this.bkCode = bkCode;
        this.qty = qty;
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
     * @return the bkCode
     */
    public String getBkCode() {
        return bkCode;
    }

    /**
     * @param bkCode the bkCode to set
     */
    public void setBkCode(String bkCode) {
        this.bkCode = bkCode;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "BorrowDetailEntity{" + "borrowId=" + borrowId + ", bkCode=" + bkCode + ", qty=" + qty + '}';
    }
    
    
}
