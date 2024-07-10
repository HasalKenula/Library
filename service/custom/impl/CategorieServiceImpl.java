/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.CategorieDao;
import edu.ijse.dto.CategorieDto;
import edu.ijse.entity.CategorieEntity;
import edu.ijse.service.custom.CategorieService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CategorieServiceImpl implements CategorieService{
    
    private CategorieDao categorieDao=(CategorieDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORIE);

    @Override
    public String save(CategorieDto dto) throws Exception {
        CategorieEntity entity =new CategorieEntity(dto.getCatCode(),dto.getCatDep());
        return categorieDao.save(entity);
    }

    @Override
    public String update(CategorieDto dto) throws Exception {
        CategorieEntity entity =new CategorieEntity(dto.getCatCode(),dto.getCatDep());
        return categorieDao.update(entity);
    }

    @Override
    public String delete(String ID) throws Exception {
      return categorieDao.delete(ID);
    }

    @Override
    public CategorieDto get(String ID) throws Exception {
        CategorieEntity entity=categorieDao.get(ID);
        CategorieDto dto=new CategorieDto(entity.getCatCode(),entity.getCatDep());
        return dto;
    }

    @Override
    public ArrayList<CategorieDto> getAll() throws Exception {
        ArrayList<CategorieDto> catogarieDtos=new ArrayList<>();
        ArrayList<CategorieEntity> categorieEntitys= categorieDao.getAll();
        for(CategorieEntity catogarieEntity:categorieEntitys){
            CategorieDto dto=new CategorieDto(catogarieEntity.getCatCode(),catogarieEntity.getCatDep());
            catogarieDtos.add(dto);
        }
        return catogarieDtos;
    }
    
}
