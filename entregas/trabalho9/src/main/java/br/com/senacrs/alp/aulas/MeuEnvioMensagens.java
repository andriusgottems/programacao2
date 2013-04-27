package br.com.senacrs.alp.aulas;

public class MeuEnvioMensagens implements EmissorMensagens{

	@Override
	public String formatarMensagem(String chave, Object... argumentos) {
		
		System.out.println(chave);
		
		return null;
	}

}
