package com.simple.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.simple.registration.helper.FileUploadHelper;


@RestController
@RequestMapping("/api/v4") 
public class BookAPIs_Controller_4_FileUpload {
   
	@Autowired
	private FileUploadHelper fileUploadHelper;
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("image1") MultipartFile file){
// --------------- to display the details of the file ----------------------------------------		
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		
// -----------------------------------------------------------------------------
		if(file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("plz upload the file");
		}
		
		if( ! file.getContentType().equals("image/jpeg")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("plz upload the file in jpeg format !!!");
		}
		
		// where we have to store the file..
		boolean uploadFile = fileUploadHelper.uploadFile(file);
		
		if(uploadFile) {
			return ResponseEntity.ok("file upload done");
		}else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
			.body("error during file upload !!!");
		}
		
//		return ResponseEntity.ok("working");
	}
}
