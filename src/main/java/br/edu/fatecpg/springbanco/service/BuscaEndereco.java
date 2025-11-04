package br.edu.fatecpg.springbanco.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

    @Service
    public class BuscaEndereco {
        public String obterEndereco(String cep) throws IOException, InterruptedException {
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                return response.body();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

