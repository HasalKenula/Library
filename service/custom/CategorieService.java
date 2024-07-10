/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.CategorieDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface CategorieService extends SuperService {
    public String save(CategorieDto dto)throws Exception;
    public String update(CategorieDto dto)throws Exception;
    public String delete(String ID)throws Exception;
    public CategorieDto get(String ID)throws Exception;
    public ArrayList<CategorieDto> getAll()throws Exception;
}
