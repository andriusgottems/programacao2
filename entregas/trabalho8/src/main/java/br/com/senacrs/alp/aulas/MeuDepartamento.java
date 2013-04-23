package br.com.senacrs.alp.aulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MeuDepartamento implements Departamento, Empresa, Comparator<Departamento> {
	
	private String nome;
	private Empresa empresa;
	
	public MeuDepartamento(String nome, Empresa empresa) {
		if(nome != null && empresa != null) {
			this.nome = nome;
			this.empresa = empresa;
		} else {
			throw new IllegalArgumentException();
		}	
	}
	
	ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

	@Override
	public int compare(Departamento o1, Departamento o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Departamento> listaDepartamentoOrdemCrescentePorQtdFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empresa getEmpresa() {
		return this.empresa;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public List<Funcionario> listarFuncionariosPorOrdemAlfabetica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> listarFuncionariosPorDecrescenteSalario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int quantidadeFuncionarios() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void adicionarFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

}
