/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author User
 */
public class MemberEntity {
    private String memID;
    private String title;
    private String memName;
    private String dob;
    private String address;
    private String city;
    private String province;

    public MemberEntity() {
    }

    public MemberEntity(String memID, String title, String memName, String dob, String address, String city, String province) {
        this.memID = memID;
        this.title = title;
        this.memName = memName;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.province = province;
    }

    /**
     * @return the memID
     */
    public String getMemID() {
        return memID;
    }

    /**
     * @param memID the memID to set
     */
    public void setMemID(String memID) {
        this.memID = memID;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the memName
     */
    public String getMemName() {
        return memName;
    }

    /**
     * @param memName the memName to set
     */
    public void setMemName(String memName) {
        this.memName = memName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "MemberEntity{" + "memID=" + memID + ", title=" + title + ", memName=" + memName + ", dob=" + dob + ", address=" + address + ", city=" + city + ", province=" + province + '}';
    }
    
    
}
