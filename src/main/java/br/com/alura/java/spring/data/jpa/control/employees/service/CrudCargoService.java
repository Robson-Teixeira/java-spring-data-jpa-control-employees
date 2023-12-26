package br.com.alura.java.spring.data.jpa.control.employees.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.java.spring.data.jpa.control.employees.orm.Cargo;
import br.com.alura.java.spring.data.jpa.control.employees.repository.CargoRepository;

@Service
public class CrudCargoService {

	private final CargoRepository cargoRepository;

	public CrudCargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public void inicial(Scanner scanner) {
		salvar(scanner);
	}

	private void salvar(Scanner scanner) {

		System.out.println("Descrição do cargo: ");
		String descricao = scanner.next();

		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);

		cargoRepository.save(cargo);

		System.out.println("Salvo!");

	}

}