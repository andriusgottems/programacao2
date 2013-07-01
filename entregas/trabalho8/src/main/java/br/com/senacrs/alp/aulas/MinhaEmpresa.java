package br.com.senacrs.alp.aulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinhaEmpresa implements Empresa, Comparator<Departamento>{
	
	private String nome;
	
	public MinhaEmpresa(String nome) {
		if (nome != null ) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	ArrayList<Departamento> lista = new ArrayList<Departamento>();
	
	@Override
	public String getNome() {
		return this.nome;
	}

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
		if(departamento != null) {
			lista.add(departamento);
		}else {
			throw new IllegalArgumentException();
		}	
	}

	@Override
	public int quantidadeFuncionarios() {
		int i = 0;
		int soma = 0;
		while(i < lista.size()){
			soma += lista.get(i).quantidadeFuncionarios();
			i++;
		}
		return soma;
	}

}
