package com.example.cliente_estoque;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstoqueController {

	@Value("${servico.mensagem}")
	private String mensagemConfiguracao;

	@GetMapping("/estoque/info")
	public String getInfo() {
		return "ESTOQUE: Configuracao Carregada: " + mensagemConfiguracao;
	}
}