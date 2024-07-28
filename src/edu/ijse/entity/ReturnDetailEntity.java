/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author User
 */
public class ReturnDetailEntity {
    
    private String returnId;
    private String bkCode ;
    private Integer qty;

    public ReturnDetailEntity() {
    }

    public ReturnDetailEntity(String returnId, String bkCode, Integer qty) {
        this.returnId = returnId;
        this.bkCode = bkCode;
        this.qty = qty;
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
        return "ReturnDetailEntity{" + "returnId=" + returnId + ", bkCode=" + bkCode + ", qty=" + qty + '}';
    }
    
    
}
