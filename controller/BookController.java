/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.BookDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BookController {
    
    
    private BookService boookService=(BookService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);
            
    public String save(BookDto dto)throws Exception{
        return boookService.save(dto);
    }
    
    public String update(BookDto dto)throws Exception{
        return boookService.update(dto);
    }
    
    public String delete(String ID) throws Exception{
        return boookService.delete(ID);
    }
    
      
    public BookDto get(String ID) throws Exception{
        return boookService.get(ID);
    }
    
    public ArrayList<BookDto> getAll()throws Exception{
        return boookService.getAll();
    }
}
