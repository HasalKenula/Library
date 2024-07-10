/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.dto.BookDto;
import edu.ijse.entity.BookEntity;
import edu.ijse.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BookServiceImpl implements BookService{
    
    private BookDao bookDao=(BookDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto dto) throws Exception {
        BookEntity entity =new BookEntity(dto.getBkCode(),dto.getBkDep(),dto.getBkAuthor(),dto.getBkQty(),dto.getBkCatCode());
        return bookDao.save(entity);
    }

    @Override
    public String update(BookDto dto) throws Exception {
        BookEntity entity =new BookEntity(dto.getBkCode(),dto.getBkDep(),dto.getBkAuthor(),dto.getBkQty(),dto.getBkCatCode());
        return bookDao.update(entity);
    }

    @Override
    public String delete(String ID) throws Exception {
      return bookDao.delete(ID);
    }

    @Override
    public BookDto get(String ID) throws Exception {
         BookEntity entity=bookDao.get(ID);
         BookDto dto = new BookDto(entity.getBkCode(),entity.getBkDep(),entity.getBkAuthor(),entity.getBkQty(),entity.getBkCatCode());
         return dto;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception{ 
        ArrayList<BookDto> bookDtos=new ArrayList<>();
        ArrayList<BookEntity> bookEntitys=bookDao.getAll();
        for(BookEntity entity:bookEntitys){
            BookDto dto=new BookDto(entity.getBkCode(),entity.getBkDep(),entity.getBkAuthor(),entity.getBkQty(),entity.getBkCatCode());
           bookDtos.add(dto);
        }
        
        return bookDtos;
    }
    
}
