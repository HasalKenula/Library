/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author User
 */
public class BorrowDetailDto {
    
    private String bkCode ;
    private Integer qty;

    public BorrowDetailDto() {
    }

    public BorrowDetailDto(String bkCode, Integer qty) {
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
        return "BorrowDetailDto{" + "bkCode=" + bkCode + ", qty=" + qty + '}';
    }
    
    
   
}
