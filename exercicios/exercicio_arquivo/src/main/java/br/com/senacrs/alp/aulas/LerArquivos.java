package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivos implements LeitorArquivos{

    @Override
    public String[] lerArquivo(String arquivo) {

        BufferedReader br = null;
        String linhaAtual;
        List<String> linhas = new ArrayList<String>();
       
        try {
 
            br = new BufferedReader(new FileReader(arquivo));
 
            while ((linhaAtual = br.readLine()) != null) {
               
                linhas.add(linhaAtual);
                System.out.println(linhaAtual);
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
       
        String [] resultado = linhas.toArray(new String[linhas.size()]);
        return resultado;
    }

    @Override
    public String[] lerArquivoComSubstituicao(String arquivo, String busca,
            String substituicao) {
        // TODO Auto-generated method stub
        return null;
    }

}