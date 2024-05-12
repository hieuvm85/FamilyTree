package com.example.mb_be.model.service;

import java.util.List;

import com.example.mb_be.model.entity.FamilyTree;





public interface FamilyTreeService {
	FamilyTree createFamilyTree(FamilyTree familyTree);
	FamilyTree updateFamilyTree(int id, FamilyTree familyTree);
	FamilyTree getFamilyTreeById(int id);
	boolean deleteFamilyTree(int id);
	List<FamilyTree> getAllFamilyTree();
	
	FamilyTree saveOrUpdate(FamilyTree familyTree);
}
