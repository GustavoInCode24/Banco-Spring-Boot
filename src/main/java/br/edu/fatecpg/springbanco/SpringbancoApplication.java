package br.edu.fatecpg.springbanco;

import br.edu.fatecpg.springbanco.model.Endereco;
import br.edu.fatecpg.springbanco.repository.EnderecoRepository;
import br.edu.fatecpg.springbanco.service.BuscaEndereco;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringbancoApplication<objectMapper> implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(SpringbancoApplication.class, args);
	}

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private BuscaEndereco buscaEndereco;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---Iniciando---");

        String cep = "11722050";

        ObjectMapper mapper = new ObjectMapper();


        Optional<Endereco> existente = enderecoRepository.findByCep(cep);

        if(existente.isPresent()){
            System.out.println("Esse cep já existe");
            System.out.println(existente.get());
        }else{
            String json = buscaEndereco.obterEndereco(cep);

            Endereco endereco = mapper.readValue(json, Endereco.class);

            enderecoRepository.save(endereco);

            System.out.println("Cep Registrado");
            System.out.println(endereco);
        }
    }
}
