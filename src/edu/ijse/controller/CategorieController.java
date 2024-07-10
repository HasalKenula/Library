/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.CategorieDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.CategorieService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CategorieController {
    
    private CategorieService categorieService=(CategorieService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORIE);
    
    public String save(CategorieDto dto)throws Exception{
        return categorieService.save(dto);
    }
    
    public String update(CategorieDto dto)throws Exception{
        return categorieService.update(dto);
    }
    
    public String delete(String ID)throws   Exception{
        return categorieService.delete(ID);
    }
    
    public CategorieDto get(String ID)throws Exception{
        return categorieService.get(ID);
    }
    
    public ArrayList<CategorieDto> getAll()throws Exception{
        return categorieService.getAll();
    }
}
