package com.simple.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.simple.registration.entities.Registration;
import com.simple.registration.service.RegistrationService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/api/v9")
public class RegistrationController2 {

    @Autowired
    private RegistrationService registrationService;

    // Folder to save uploaded files
    @Value("${file.upload-dir}")
    private String uploadDir;

    // Show the registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
    	
        model.addAttribute("registration", new Registration());
        return "registration-form"; // View name
    }

    // Handle form submission
    @PostMapping("/register")
    public String submitRegistrationForm(
            @ModelAttribute Registration registration,
            @RequestParam("photoFile") MultipartFile photoFile,
            @RequestParam("sigFile") MultipartFile sigFile ) {
    	 System.out.println("--------------------------------------------before execute the try catch block of postmapping---------------------------");
    	 System.out.println("registration name before call to registrationService object "+ registration.getName());
         System.out.println( "registration age before call to registrationService object "+registration.getAge());
         System.out.println( "registration course before call to registrationService object"+ registration.getCourse());
         System.out.println( "registration photo before call to registrationService object"+ registration.getPhoto());
         System.out.println("registration name before call to registrationService object "+ registration.getName());
         System.out.println( "registration photo before call to registrationService object"+ photoFile);
         System.out.println("registration name before call to registrationService object "+ sigFile);
        try {
            // Save the photo file
            if (!photoFile.isEmpty()) {
                String photoFileName = System.currentTimeMillis() + "_" + photoFile.getOriginalFilename();
                Path photoPath = Paths.get(uploadDir, "images", photoFileName);
                Files.createDirectories(photoPath.getParent());
                photoFile.transferTo(photoPath.toFile());
                registration.setPhoto("/images/" + photoFileName);
            }

            // Save the signature file
            if (!sigFile.isEmpty()) {
                String sigFileName = System.currentTimeMillis() + "_" + sigFile.getOriginalFilename();
                Path sigPath = Paths.get(uploadDir, "images", sigFileName);
                Files.createDirectories(sigPath.getParent());
                sigFile.transferTo(sigPath.toFile());
                registration.setSig("/images/" + sigFileName);
            }
            
          
            // Save registration details to the database
            registrationService.saveRegistration(registration);
            
            System.out.println("--------------------------------------------after execute the try catch block of postmapping---------------------------");
       	 System.out.println("registration name before call to registrationService object "+ registration.getName());
            System.out.println( "registration age after call to registrationService object "+registration.getAge());
            System.out.println( "registration course after call to registrationService object"+ registration.getCourse());
            System.out.println( "registration photo after call to registrationService object"+ registration.getPhoto());
            System.out.println("registration name after call to registrationService object "+ registration.getName());
            System.out.println( "registration photo after call to registrationService object"+ photoFile);
            System.out.println("registration name after call to registrationService object "+ sigFile);

        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

        return "registration-success"; 
    }
}
