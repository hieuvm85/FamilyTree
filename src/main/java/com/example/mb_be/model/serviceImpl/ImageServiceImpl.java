package com.example.mb_be.model.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mb_be.model.entity.Image;
import com.example.mb_be.model.service.ImageService;
import com.example.mb_be.repository.ImageRepository;



@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageRepository imageRepository;
	
	@Override
	public Image createImage(Image image) {
		// TODO Auto-generated method stub
		return imageRepository.save(image);
	}

	@Override
	public Image updateImage(int id, Image image) {
		// TODO Auto-generated method stub
		image.setId(id);
		return imageRepository.save(image);
	}

	@Override
	public Image getImageById(int id) {
		// TODO Auto-generated method stub
		return imageRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deleteImage(int id) {
		// TODO Auto-generated method stub
		imageRepository.deleteById(id);
		return true;
	}

}
