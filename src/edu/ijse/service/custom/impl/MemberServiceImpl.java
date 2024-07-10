/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.MemberDao;
import edu.ijse.dto.MemberDto;
import edu.ijse.entity.MemberEntity;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MemberServiceImpl implements MemberService{
    
    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto dto) throws Exception {
      MemberEntity entity = new MemberEntity(dto.getMemID(), dto.getTitle(),
                dto.getMemName(), dto.getDob(), dto.getAddress(),dto.getCity(),dto.getProvince());
        return memberDao.save(entity) ;
    }

    @Override
    public String update(MemberDto dto) throws Exception {
        MemberEntity entity=new MemberEntity(dto.getMemID(),dto.getTitle(),dto.getMemName(),dto.getDob(),dto.getAddress(),dto.getCity(),dto.getProvince());
       return memberDao.update(entity);
    }

    @Override
    public String delete(String ID) throws Exception {
        
         return memberDao.delete(ID);
    }

    @Override
    public MemberDto get(String ID) throws Exception {
        MemberEntity entity=memberDao.get(ID);
        
        MemberDto dto = new MemberDto(entity.getMemID(),entity.getTitle(),entity.getMemName(),entity.getDob(),entity.getAddress(),entity.getCity(),entity.getProvince());
        return dto;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
      ArrayList<MemberDto> memberDtos=new ArrayList<>();
      ArrayList<MemberEntity> memberEntitys=memberDao.getAll();
      for(MemberEntity memberEntity:memberEntitys){
          MemberDto dto=new MemberDto(memberEntity.getMemID(), memberEntity.getTitle(),
                memberEntity.getMemName(), memberEntity.getDob(), memberEntity.getAddress(),memberEntity.getCity(),memberEntity.getProvince());
          memberDtos.add(dto);
      }
      
      return memberDtos;
    }
    
}
