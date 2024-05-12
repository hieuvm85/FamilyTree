package com.example.mb_be.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mb_be.model.entity.FamilyTree;
import com.example.mb_be.model.service.FamilyTreeService;
import com.example.mb_be.repository.FamilyTreeRepository;



@Service
public class FamilyTreeServiceImpl implements FamilyTreeService{

	@Autowired
	private FamilyTreeRepository familyTreeRepository;
	
	@Override
	public FamilyTree createFamilyTree(FamilyTree familyTree) {
		// TODO Auto-generated method stub
		return familyTreeRepository.save(familyTree);
	}

	@Override
	public FamilyTree updateFamilyTree(int id, FamilyTree familyTree) {
		// TODO Auto-generated method stub
		familyTree.setId(id);
		return familyTreeRepository.save(familyTree);
	}

	@Override
	public FamilyTree getFamilyTreeById(int id) {
		// TODO Auto-generated method stub
		return familyTreeRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deleteFamilyTree(int id) {
		// TODO Auto-generated method stub
		familyTreeRepository.deleteById(id);
		return true;
	}

	@Override
	public List<FamilyTree> getAllFamilyTree() {
		// TODO Auto-generated method stub
		return familyTreeRepository.findAll();
	}

	@Override
	public FamilyTree saveOrUpdate(FamilyTree familyTree) {
		// TODO Auto-generated method stub
		return familyTreeRepository.save(familyTree);
	}

}
