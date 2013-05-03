package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListarConteudo implements ListaConteudoDiretorio {
	
	private final static String SEPARADOR = " ";
	private final static String DIRETORIO = "d";
	private final static String ARQUIVO = "-";
	

	@Override
	public String[] listarConteudo(File diretorio) {
		
		List<String> linhasDir = new ArrayList<String>();
		List<String> linhasArq = new ArrayList<String>();
        String [] resultado = null;
        String str = null;
        Integer cont = 0;
		
		if (!isExists(diretorio)){
			System.out.println("diretorio nao existe");
			throw new IllegalArgumentException();
		}	
		
		if (isCanRead(diretorio)) {
			System.out.println("posso ler");
		}else{
			System.out.println("nao posso ler");
			throw new IllegalArgumentException();
		}	
		
		if (isCanWrite(diretorio)) {
			System.out.println("posso escrever");
		}else{
			System.out.println("nao posso escrever");
			throw new IllegalArgumentException();
		}
		
		if (isCanExecute(diretorio)) {
			System.out.println("posso executar");
		}else{
			System.out.println("nao posso executar");
			throw new IllegalArgumentException();
		}
		
		if (isNull(diretorio)){
			System.out.println("diretorio null");
			throw new IllegalArgumentException();
		} else {
		
		if (isExists(diretorio)){
			System.out.println("diretorio existe");
			
			File[] arqs = null;

			arqs = diretorio.listFiles();
			if (arqs != null) {
				for (File f : arqs) {
					
					str = null;
					System.out.println(f);
					
					
					if (isDir(f)){
					str = tipoObj(f) + SEPARADOR ;
					str += montaPermissoes(f) + SEPARADOR;
					str += f.length() + f.length() + SEPARADOR; 
					str += f.getName();
					linhasDir.add(str);
					} else{
						str = tipoObj(f) + SEPARADOR ;
						str += montaPermissoes(f) + SEPARADOR;
						str += f.length() + f.length() + SEPARADOR; 
						str += f.getName();
						linhasArq.add(str);
					}
					
					
				}
				resultado = new String[linhasDir.size()+linhasArq.size()];
		        
				for (int i = 0; i < linhasDir.size() ; i++){
		        	
					resultado[cont] = linhasDir.get(i);
					cont++;
		        }
				for (int j = 0; j < linhasArq.size() ; j++){
		        	
					resultado[cont] = linhasArq.get(j);
					cont++;
		        }
				
		        for (int t = 0 ; t < resultado.length ; t++){
		        	System.out.println(resultado[t]);
		        }
			}else {
				System.out.println("diretorio vazio");
				throw new IllegalArgumentException();
			}
			
		}else {
			System.out.println("diretorio nao existe");
			throw new IllegalArgumentException();
		}
		
		}    
		
		return resultado;
	}


	private String montaPermissoes(File f) {
		
		String resultado = null;
		
		if (isCanRead(f)){
			resultado = "r";
		}else {
			resultado = "-";
		}
		
		if (isCanWrite(f)){
			resultado += "w";
		}else {
			resultado += "-";
		}
		
		if (f.canExecute()){
			resultado += "x";
		}else {
			resultado += "-";
		}
		
		return resultado;
		
	}


	private String tipoObj(File f) {
		
		String resultado = null;
		
		if (isDir(f)){
			resultado = DIRETORIO;
    		
    	} else if (isArq(f)){
    		resultado = ARQUIVO;
    	} else {
    		throw new IllegalArgumentException();
    	}
		
		return resultado;
		
	}

	private boolean isCanExecute(File diretorio) {
		
		boolean resultado = false;
		
		if (diretorio.canExecute()){
			resultado = true;
		}
		
		return resultado;
	}

	private boolean isCanWrite(File diretorio) {
		
		boolean resultado = false;
		
		if (diretorio.canWrite()){
			resultado = true;
		}
		
		return resultado;
	}

	private boolean isCanRead(File diretorio) {
		
		boolean resultado = false;
		
		if (diretorio.canRead()){
			resultado = true;
		}
		
		return resultado;
		
	}

	private boolean isArq(File nomeObj) {
		
		boolean resultado = false;
		
		if (nomeObj.isFile()){
			resultado = true;
		}
		
		return resultado;
	}

	private boolean isDir(File nomeObj) {
		
		boolean resultado = false;
		
		if (nomeObj.isDirectory()){
			resultado = true;
		}
		
		return resultado;
	}

	private boolean isNull(File dir) {
		
		boolean resultado = false;
		
		if(dir == null || dir.equals("")){
			resultado = true;
		}
		
		return resultado;
	}

	private boolean isExists(File dir) {
		
		boolean resultado = false;
		
		if(dir.exists()){
			resultado = true;
		}
		
		return resultado;
	}

}