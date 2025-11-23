package com.example.cliente_relatorios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelatoriosController {

	@Value("${servico.mensagem}")
	private String mensagemConfiguracao;

	@GetMapping("/relatorios/info")
	public String getInfo() {
		return "RELATORIOS: Configuracao Carregada: " + mensagemConfiguracao;
	}
}