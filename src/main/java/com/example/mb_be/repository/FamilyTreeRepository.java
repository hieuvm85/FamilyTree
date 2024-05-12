package com.example.mb_be.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mb_be.model.entity.FamilyTree;
import com.example.mb_be.model.entity.Member;

public interface FamilyTreeRepository extends JpaRepository<FamilyTree, Integer>{
	
}
