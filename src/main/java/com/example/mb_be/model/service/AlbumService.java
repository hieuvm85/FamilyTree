package com.example.mb_be.model.service;

import java.util.List;

import com.example.mb_be.model.entity.Album;



public interface AlbumService {
	Album createAlbum(Album album);
	Album updateAlbum(int id, Album album);
	Album getAlbumById(int id);
	boolean deleteAlbum(int id);
	List<Album> getAllAlbum();
}
