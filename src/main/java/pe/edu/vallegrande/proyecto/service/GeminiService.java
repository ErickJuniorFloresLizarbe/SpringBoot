package pe.edu.vallegrande.proyecto.service;

import lombok.Getter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GeminiService {
    private final String apiUrl = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=AIzaSyCAqc7_Bf4xh8u8SlGKV8H-Ay0U7-8vnVE";

    // Método para obtener el historial
    // Lista para almacenar el historial de consultas
    @Getter
    private final List<Map<String, String>> history = new ArrayList<>();

    public String generateContent(String prompt) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            Map<String, Object> requestBody = new HashMap<>();
            Map<String, Object> content = new HashMap<>();
            Map<String, Object> part = new HashMap<>();

            part.put("text", prompt);
            content.put("parts", new Map[]{part});
            requestBody.put("contents", new Map[]{content});

            HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);

            String response = restTemplate.exchange(apiUrl, HttpMethod.POST, entity, String.class).getBody();

            // Almacena la consulta y la respuesta en el historial
            Map<String, String> entry = new HashMap<>();
            entry.put("prompt", prompt);
            entry.put("response", response);
            history.add(entry);

            return response;

        } catch (HttpClientErrorException e) {
            System.err.println("Error HTTP: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
            return "Error en la solicitud HTTP: " + e.getStatusCode();
        } catch (RestClientException e) {
            System.err.println("Error en la solicitud REST: " + e.getMessage());
            return "Error al realizar la solicitud: " + e.getMessage();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            return "Error inesperado: " + e.getMessage();
        }
    }

}
