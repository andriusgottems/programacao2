package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivos implements LeitorArquivos{

    @Override
    public String[] lerArquivo(String arquivo) {

        BufferedReader br = null;
        String linhaAtual = null;
        List<String> linhas = new ArrayList<String>();
        String [] resultado = null;
       
        try {
        	
        	br = new BufferedReader(new FileReader(arquivo));
        	
        	//verificarExistencia(br);
 
            while ((linhaAtual = br.readLine()) != null) {
               
                linhas.add(linhaAtual);
            }
           
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
       
         resultado = new String[linhas.size()];
         resultado = linhas.toArray(resultado);
        return resultado;
    }

   /* private void verificarExistencia(File arquivo) {

    	if (arquivo == null) {
    		throw new IllegalArgumentException();
    	}
    	if (arquivo.exists()) {
    		throw new IllegalArgumentException();
    	}
    	if (arquivo.isFile()) {
    		throw new IllegalArgumentException();
    	}
    	if (arquivo.canRead()) {
    		throw new IllegalArgumentException();
    	}
		
	}*/

	@Override
    public String[] lerArquivoComSubstituicao(String arquivo, String busca,
            String substituicao) {
		
		BufferedReader br = null;
        String linhaAtual = null;
        List<String> linhas = new ArrayList<String>();
        String [] resultado = null;
        String [] auxiliar  = null;
       
        try {
        	
        	br = new BufferedReader(new FileReader(arquivo));
        	
        	while ((linhaAtual = br.readLine()) != null) {
               
                linhas.add(linhaAtual);
                System.out.println(linhaAtual);
            }
        	
        	auxiliar = new String[linhas.size()];
        	auxiliar = linhas.toArray(resultado);
        	resultado = new String[linhas.size()];
        	
            for (int i = 0; i < auxiliar.length; i++){
            	
            	auxiliar[i].replace(busca, substituicao);
            	resultado[i]= auxiliar[i];
            	System.out.println(resultado[i]);
            }
            
           
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
       
         
        return resultado;
    }

}