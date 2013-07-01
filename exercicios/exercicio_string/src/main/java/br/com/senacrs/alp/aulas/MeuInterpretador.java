package br.com.senacrs.alp.aulas;

public class MeuInterpretador implements InterpretadorStrings {

	@Override
	public TIPO_STRING lerString(String str) {
		
		TIPO_STRING resultado = null;
		
		System.out.println(str);
		if (str == null){
			resultado = TIPO_STRING.MAL_FORMADA;
		}else if (ehcomentario(str)){
			resultado = TIPO_STRING.COMENTARIO;
		}else if (ehbemformada(str)){
			resultado = TIPO_STRING.BEM_FORMADA;
		}else{
			resultado = TIPO_STRING.MAL_FORMADA;
		}
		
		return resultado;
	}

	private boolean existeString(String str){
		
		boolean resultado = false;
		
		resultado = (str != null) && !str.trim().isEmpty();
		
		return resultado;
		
	}

	private boolean ehbemformada(String str) {
		
		boolean resultado = false;
		String[] strings = null;
		
		strings = str.split(SEPARADOR);
		
		if ((strings.length == 2) && (existeString(strings[0])) && (existeString(strings[1]))){
			resultado = true;
		}
		
		return resultado;
	}



	private boolean ehcomentario(String str) {
		
		boolean resultado = false;
		
		resultado = str.trim().startsWith(PREFIXO_COMENTARIO);
		
		return resultado;
	}

}
