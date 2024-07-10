/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.MemberDao;
import edu.ijse.dao.CrudUtil;
import edu.ijse.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public String save(MemberEntity t) throws Exception {
         boolean isSaved = CrudUtil.executeUpdate("INSERT INTO member VALUES(?,?,?,?,?,?,?)",
               t.getMemID(), t.getTitle(), t.getMemName(),
               t.getDob(), t.getAddress(),t.getCity(),t.getProvince());
         return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(MemberEntity t) throws Exception {
        boolean isUpdate=CrudUtil.executeUpdate("UPDATE member SET MemberTitle=?,MemberName=?,DOB=?,MemberAddress=?,City=?,Province=? WHERE MemberID=?", t.getTitle(), t.getMemName(),
               t.getDob(), t.getAddress(),t.getCity(),t.getProvince(),t.getMemID());
        return isUpdate ? "Success":"Fail";
    }

    @Override
    public String delete(String id) throws Exception {
        boolean isDeleted=CrudUtil.executeUpdate("DELETE FROM member WHERE MemberID =?", id);
          return isDeleted ? "Success":"Fail";
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM member WHERE MemberID =?",id);
        if(rst.next()){
            return new MemberEntity(rst.getString("MemberID"),rst.getString("MemberTitle"),rst.getString("MemberName"),rst.getString("DOB"),rst.getString("MemberAddress"),rst.getString("City"),rst.getString("Province"));
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntitys=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM Member");
        while(rst.next()){
            MemberEntity entity=new MemberEntity(rst.getString("MemberID"),rst.getString("MemberTitle"),rst.getString("MemberName"),rst.getString("DOB"),rst.getString("MemberAddress"),rst.getString("City"),rst.getString("Province"));
            memberEntitys.add(entity);
        }
        
          return memberEntitys;
    }

}
