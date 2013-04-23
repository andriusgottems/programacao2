package br.com.senacrs.alp.aulas;
import br.com.senacrs.alp.aulas.Empresa;

import java.util.Comparator;
import java.util.List;

public class MeuFuncionario implements Funcionario, Departamento, Comparator<Funcionario> {
	
	private String nome;
	private Empresa empresa;
	private Departamento departamento;
	private double salario;
	
	public MeuFuncionario(String nome, Departamento departamento, double salario) {
		
		if (nome != null && departamento != null && salario < 0) {
			this.nome = nome;
			this.departamento = departamento;
			this.salario = salario;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public Empresa getEmpresa() {
		return this.empresa;
	}

	@Override
	public Departamento getDepartamento() {
		return this.departamento;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}

	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		// TODO Auto-generated method stub
		return 0;
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
