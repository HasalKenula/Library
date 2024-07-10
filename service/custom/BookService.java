/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.BookDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface BookService extends SuperService {
    public String save(BookDto dto)throws Exception;
    public String update(BookDto dto)throws Exception;
    public String delete(String ID)throws Exception;
    public BookDto get(String ID)throws Exception;
    public ArrayList<BookDto> getAll()throws Exception;
}
