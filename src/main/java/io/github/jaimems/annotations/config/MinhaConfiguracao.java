package io.github.jaimems.annotations.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import io.github.jaimems.annotations.Development;

/*
 * @Profile("production") foi usado neste contexto para executar
 * configurações em ambiente de produção
 */

@Development
public class MinhaConfiguracao {

	/*
	 * O CommandLineRunner É EXECUTADO ASSIM QUE A APLICAÇÃO SOBE
	 * O Spring PROCURA PELAS @Configuration, @Bean E CommandLineRunner
	 */
	
	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("CONFIGURAÇÕES DE DESENVOLVIMENTO");
		};
	}
}
