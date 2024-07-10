/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class BookDaoImpl implements BookDao{

    @Override
    public String save(BookEntity t) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO book VALUES(?,?,?,?,?)",t.getBkCode(),t.getBkDep(),t.getBkAuthor(),t.getBkQty(),t.getBkCatCode());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(BookEntity t) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE book SET Description =?,Author =?,BookQty =?,CategorieCode =? WHERE BookCode=?",t.getBkDep(),t.getBkAuthor(),t.getBkQty(),t.getBkCatCode(),t.getBkCode());
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String delete(String id) throws Exception {
         boolean isDeleted=CrudUtil.executeUpdate("Delete FROM book WHERE BookCode=?", id);
        return isDeleted ?"Success" : "Fail";
    }

    @Override
    public BookEntity get(String id) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book WHERE BookCode =?", id);
         if(rst.next()){
             BookEntity entity=new BookEntity(rst.getString("BookCode"),rst.getString("Description"),rst.getString("Author"),rst.getString("BookQty"),rst.getString("CategorieCode"));
             return entity;
         }
         return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> bookEntity=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM book");
        while(rst.next()){
            BookEntity entity=new BookEntity(rst.getString("BookCode"),rst.getString("Description"),rst.getString("Author"),rst.getString("BookQty"),rst.getString("CategorieCode"));
            bookEntity.add(entity);
        }
        return bookEntity;
    }
    
}
