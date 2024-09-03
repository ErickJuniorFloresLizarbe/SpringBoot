package pe.edu.vallegrande.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.proyecto.service.GeminiService;

import java.util.Map;

@RestController
@RequestMapping("/api/gemini")
public class GeminiController {

    @Autowired
    private GeminiService geminiService;

    @PostMapping("/generate")
    public String generateContent(@RequestBody Map<String, String> request) {
        String prompt = request.get("text");
        return geminiService.generateContent(prompt);
    }
}