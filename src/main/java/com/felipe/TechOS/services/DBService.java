package com.felipe.TechOS.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.TechOS.domain.Cliente;
import com.felipe.TechOS.domain.OS;
import com.felipe.TechOS.domain.Tecnico;
import com.felipe.TechOS.domain.enuns.Prioridade;
import com.felipe.TechOS.domain.enuns.Status;
import com.felipe.TechOS.repositories.ClienteRepository;
import com.felipe.TechOS.repositories.OSRepository;
import com.felipe.TechOS.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Valdir Cezar", "048.775.560-01", "(65) 99735-3030");
		Cliente c1 = new Cliente(null, "Betina Campos", "593.518.970-44", "(81) 99849-5176");

		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
