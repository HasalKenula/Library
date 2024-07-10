/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.CategorieDao;
import edu.ijse.entity.CategorieEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author User
 */
public class CategorieDaoImpl implements CategorieDao {

    @Override
    public String save(CategorieEntity t) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO categorie VALUES(?,?)",t.getCatCode(),t.getCatDep());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(CategorieEntity t) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE categorie SET CategorieDescription =? WHERE CategorieCode=?",t.getCatDep(),t.getCatCode());
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String delete(String id) throws Exception {
        boolean isDeleted=CrudUtil.executeUpdate("Delete FROM categorie WHERE categorieCode=?", id);
        return isDeleted ?"Success" : "Fail";
    }

    @Override
    public CategorieEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM categorie WHERE CategorieCode =?",id);
        if(rst.next()){
            CategorieEntity entity=new CategorieEntity(rst.getString("CategorieCode"),rst.getString("CategorieDescription" ));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<CategorieEntity> getAll() throws Exception {
        ArrayList<CategorieEntity> categorieEntity=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM categorie");
        while(rst.next()){
            CategorieEntity entity=new CategorieEntity(rst.getString("CategorieCode"),rst.getString("CategorieDescription"));
            categorieEntity.add(entity);
        }
       return categorieEntity;
    }
    
}
