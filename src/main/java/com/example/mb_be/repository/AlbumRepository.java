package com.example.mb_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mb_be.model.entity.Album;



public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
