package com.mballem.curso.boot.service;

import java.util.List;

import com.mballem.curso.boot.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPoId(Long id);
	
	List<Funcionario> buscarTodos();
	
}