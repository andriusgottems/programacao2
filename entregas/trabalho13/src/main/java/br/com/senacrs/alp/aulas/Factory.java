package br.com.senacrs.alp.aulas;

public class Factory {
	
	private static final Factory instancia = new Factory();
	
	private Factory() {
	}
	
	public ValidarRequisicaoGet criarValidacao() {
	
		ValidarRequisicaoGet resultado = null;
		
		resultado = new MeuValidarRequisicao();
		
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}
