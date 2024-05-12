package com.example.mb_be.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mb_be.model.entity.Album;
import com.example.mb_be.model.entity.FamilyTree;
import com.example.mb_be.model.entity.Image;
import com.example.mb_be.model.request.AlbumRequest;
import com.example.mb_be.model.request.ImageRequest;
import com.example.mb_be.model.service.AlbumService;
import com.example.mb_be.model.service.FamilyTreeService;
import com.example.mb_be.model.service.ImageService;

@RestController
@RequestMapping("/api/image")
public class ImageController {

	@Autowired
	FamilyTreeService familyTreeService;
	@Autowired
	AlbumService albumService;
	@Autowired
	ImageService imageService;
	
	@PostMapping("/album/create")
	public ResponseEntity<?> createAlbum(@RequestBody AlbumRequest albumRequest,@RequestParam("idTree") int idTree){
		Album album= new Album();
		album.setName(albumRequest.getName());
		album.setCreatAt(LocalDateTime.now());
		FamilyTree familyTree= familyTreeService.getFamilyTreeById(idTree);
		album.setFamilyTree(familyTree);
		albumService.createAlbum(album);
		return ResponseEntity.ok(album);
	}
	
	@PostMapping("/image/create")
	public ResponseEntity<?> createImage(@RequestBody List<ImageRequest> imageRequests,@RequestParam("idAlbum") int idAlbum){
		Album album= 	albumService.getAlbumById(idAlbum);
		for( ImageRequest imageRequest : imageRequests) {
			Image image = new Image();
			image.setImageUrl(imageRequest.getUrl());
			image.setAlbum(album);
			imageService.createImage(image);
		}
		return ResponseEntity.ok(album.getImage());
	}
	
	@GetMapping("/album/gets")
	public ResponseEntity<?> getsAlbum(@RequestParam("idTree") int idTree){
		FamilyTree familyTree= familyTreeService.getFamilyTreeById(idTree);
		return ResponseEntity.ok(familyTree.getAlbum());
	}
	@GetMapping("/image/gets")
	public ResponseEntity<?> getsImage(@RequestParam("idAlbum") int idAlbum){
		Album album= 	albumService.getAlbumById(idAlbum);
		return ResponseEntity.ok(album.getImage());
	}
}
