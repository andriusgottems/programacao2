package br.com.senacrs.alp.aulas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListarObjetos implements ListaConteudoDiretorio {

	@Override
	public String[] listarConteudo(File diretorio) {
		
		
		List<String> linhas = new ArrayList<String>();
        String [] resultado = null;
        String nome = null;
		
		System.out.println("1 " + diretorio);
		
		if (isCanRed(diretorio)) {
			System.out.println("posso ler");
		
		if (isNull(diretorio)){
			System.out.println("diretorio null");
		} else {
		
		if (isExists(diretorio)){
			System.out.println("diretorio existe");
			//String[] arqs = diretorio.list();
			
			File[] arqs = null;

			arqs = diretorio.listFiles();
			if (arqs != null) {
				for (File f : arqs) {
					nome = null;
					System.out.println(f);
					if (isDir(f)){
			    		System.out.println("é diretorio");
			    		nome = "d";
			    		
			    	} else if (isArq(f)){
			    		System.out.println("é arquivo");
			    		nome = "-";
			    	} else {
			    		System.out.println("não é nada");
			    		System.out.println(f);
			    	}
				}
			}else {
				System.out.println("diretorio vazio");
			}
				
		    /*for(int i = 0; i < arqs.length; i++){
		    	
		    	
		    	File nomeObj = new File(arqs[i]);
				
				
		    	if (isDir(nomeObj)){
		    		System.out.println("é diretorio");
		    	} else if (isArq(nomeObj)){
		    		System.out.println("é arquivo");
		    	} else {
		    		System.out.println("não é nada");
		    		System.out.println(nomeObj);
		    	}
		    }*/
			
		}else {
			System.out.println("diretorio nao existe");
		}
		
		}
		}else{
			System.out.println("nao posso ler");
		}
		return resultado;
	}

	private boolean isCanRed(File diretorio) {
		
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
