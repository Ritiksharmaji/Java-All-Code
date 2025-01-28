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
@RequestMapping("/api/registration")
public class RegistrationController3 {

    @Autowired
    private RegistrationService registrationService;

    // Folder to save uploaded files (configured in application.properties)
    @Value("${file.upload-dir}")
    private String uploadDir;

    /**
     * Displays the registration form.
     * Adds a new Registration object to the model for form binding.
     *
     * @param model The Model object for passing data to the view.
     * @return The name of the view template for the registration form.
     */
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "registration-form"; // View name for the registration form
    }

    /**
     * Handles the submission of the registration form.
     * Uploads photo and signature files, saves their paths, and persists the registration details.
     *
     * @param registration The Registration object bound to the form data.
     * @param photoFile    The uploaded photo file.
     * @param sigFile      The uploaded signature file.
     * @return The name of the view template for successful registration or error handling.
     */
    @PostMapping("/register")
    public String submitRegistrationForm(
            @ModelAttribute Registration registration,
            @RequestParam("photoFile") MultipartFile photoFile,
            @RequestParam("sigFile") MultipartFile sigFile) {

        try {
            // Save the photo file if it is not empty
            if (!photoFile.isEmpty()) {
                // Generate a unique file name using the current timestamp
                String photoFileName = System.currentTimeMillis() + "_" + photoFile.getOriginalFilename();
                // Define the path to save the file in the "images" directory
                Path photoPath = Paths.get(uploadDir, "images", photoFileName);
                // Create the directories if they do not exist
                Files.createDirectories(photoPath.getParent());
                // Transfer the file to the specified location
                photoFile.transferTo(photoPath.toFile());
                // Save the file path to the Registration entity
                registration.setPhoto("/images/" + photoFileName);
            }

            // Save the signature file if it is not empty
            if (!sigFile.isEmpty()) {
                // Generate a unique file name using the current timestamp
                String sigFileName = System.currentTimeMillis() + "_" + sigFile.getOriginalFilename();
                // Define the path to save the file in the "images" directory
                Path sigPath = Paths.get(uploadDir, "images", sigFileName);
                // Create the directories if they do not exist
                Files.createDirectories(sigPath.getParent());
                // Transfer the file to the specified location
                sigFile.transferTo(sigPath.toFile());
                // Save the file path to the Registration entity
                registration.setSig("/images/" + sigFileName);
            }

            // Save the registration details in the database
            registrationService.saveRegistration(registration);

        } catch (Exception e) {
            // Print the stack trace for debugging purposes
            e.printStackTrace();
            // Return the error view if an exception occurs
            return "error";
        }

        // Return the success view if registration is successful
        return "registration-success";
    }
}
