package com.example.cliente_vendas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendasController {

	// Injeta a propriedade 'servico.mensagem' que vem do Config Server/Git
	@Value("${servico.mensagem}")
	private String mensagemConfiguracao;

	@GetMapping("/vendas/info")
	public String getInfo() {
		return "VENDAS: Configuracao Carregada: " + mensagemConfiguracao;
	}
}
