/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class ReturnDetailDto {
    
    private String bkCode ;
    private Integer qty;

    public ReturnDetailDto() {
    }

    public ReturnDetailDto(String bkCode, Integer qty) {
        this.bkCode = bkCode;
        this.qty = qty;
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
        return "ReturnDetailDto{" + "bkCode=" + bkCode + ", qty=" + qty + '}';
    }
    
    
}
