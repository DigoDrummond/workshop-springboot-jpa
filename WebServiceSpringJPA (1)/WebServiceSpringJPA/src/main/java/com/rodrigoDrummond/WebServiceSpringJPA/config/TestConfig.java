package com.rodrigoDrummond.WebServiceSpringJPA.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.User;
import com.rodrigoDrummond.WebServiceSpringJPA.repositories.UserRepository;

//classe auxiliar de configuração


@Configuration//classe de configuração
@Profile("test")//configuração específica para perfil de teste
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	//tudo dentro desse método é executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		//salvar usuários no banco de dados
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
