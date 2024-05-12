package com.example.mb_be.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mb_be.model.entity.Album;
import com.example.mb_be.model.service.AlbumService;
import com.example.mb_be.repository.AlbumRepository;



@Service
public class AlbumServiceImpl implements AlbumService{
	
	@Autowired
	private AlbumRepository albumRepository;

	@Override
	public Album createAlbum(Album album) {
		// TODO Auto-generated method stub
		return albumRepository.save(album);
	}

	@Override
	public Album updateAlbum(int id, Album album) {
		// TODO Auto-generated method stub
		album.setId(id);
		return albumRepository.save(album);
	}

	@Override
	public Album getAlbumById(int id) {
		// TODO Auto-generated method stub
		return albumRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deleteAlbum(int id) {
		// TODO Auto-generated method stub
		albumRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Album> getAllAlbum() {
		// TODO Auto-generated method stub
		return albumRepository.findAll();
	}
}
