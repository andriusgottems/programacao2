package br.com.senacrs.alp.aulas;

public class Factory {
	
	private static final Factory instancia = new Factory();
	
	private Factory() {
	}
	
	public Funcionario criarFuncionario(
			Departamento departamento, 
			String nome, 
			double salario) {
	
		Funcionario resultado = null;
		
		resultado = new MeuFuncionario(nome, departamento, salario);
		
		return resultado;
	}
	
	public Departamento criarDepartamento(
			Empresa empresa, 
			String nome) {
	
		Departamento resultado = null;
		
		resultado = new MeuDepartamento(nome, empresa);
		
		return resultado;
	}
	
	public Empresa criarEmpresa(
			String nome) {
	
		Empresa resultado = null;
		
		resultado = new MinhaEmpresa(nome);
		
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}
