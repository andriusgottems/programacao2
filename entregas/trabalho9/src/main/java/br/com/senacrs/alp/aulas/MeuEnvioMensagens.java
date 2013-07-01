package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MeuEnvioMensagens implements EmissorMensagens {

	String arquivoNovo;

@Override
public String formatarMensagem(String chave, Object... argumentos) {
String resultado = null;
// File FileReader exige que sua criação seja dentro de um try/catch
try {
// FileReader identifica as informações do arquivoNovo recebidas do
// arquivoEntrada
FileReader fr = new FileReader(arquivoNovo);
// BufferedReader le as linhas do arquivoNovo
BufferedReader br = new BufferedReader(fr);
// Identifica se o arquivo é valido ou não.
boolean arquivoExiste = false;
// cria uma variável para receber as informações da linha
String linha;

// Ira ler cada linha do arquivoNovo
while ((linha = br.readLine()) != null) {
// se for diferente de null o split jogara as informações do
// arquivoNovo em um
// array unidimensional, sendo o delimitador de cada informação
// o sinal de =
String linhaArray_1[] = linha.split("=");
// todos as informação passaram pelo if e com o comando trim,
// todos as espaços
// a direta e a esquerda serão retirados
if (linhaArray_1[0].trim().equals(chave)) {
resultado = String.format(linhaArray_1[1].trim(),
argumentos);
// Ira atribuir true a arquivoExiste
arquivoExiste = true;
}
}
// verifica a variável booleana, que se for false, sera jogada uma
// exceção
if (arquivoExiste == false) {
throw new IllegalArgumentException();
}

// para fechar o arquivo se estiver aberto
fr.close();
br.close();

} catch (IOException ex) {
ex.printStackTrace();
}

return resultado;
}

public MeuEnvioMensagens(String arquivoEntrada) {
// ira receber o arquivoEntrada e atribuir seu valor a arquivoNova
this.arquivoNovo = arquivoEntrada;
// a variável arquivo ira receber o arquivo de entrada de oblerArquivo
File arquivo = oblerArquivo(arquivoEntrada);
// Verificara se o arquivo tem um formato valido
verificaFormato(arquivo);
}

private File oblerArquivo(String arquivo) {
File resultado = null;

// verificara se o arquivo é nulo para lançar uma exceção
if (arquivo == null) {
throw new IllegalArgumentException();
// se não ele joga a informação do arquivo em resultado
} else {
resultado = new File(arquivo);
// e resultado vai para verificarArquivo antes de retornar
verificarArquivo(resultado);
}
return resultado;
}

// ira verificar se o arquivo tem uma formatação correta "chave=argumento"
private void verificaFormato(File arquivoTeste) {
// FileReader exige estar em um try/catch
try {
// FileReader recebe aruivoTeste para identifica-lo como arquivo
FileReader fr = new FileReader(arquivoTeste);
// BufferedReader le as informações do FileReader para ler suas
// linhas
BufferedReader br = new BufferedReader(fr);

// o Array recebe as informações de leitura do de linha sendo que
// seu delimitador é o caracter =
String linhaArray_2[] = br.readLine().split("=");
// neste if, se tiver mais de dois elementos sera lançado uma
// exceção
if (linhaArray_2.length != 2) {
throw new IllegalArgumentException();
}
} catch (IOException e) {
e.printStackTrace();
}
}

//
private void verificarArquivo(File arquivo) {
// Este if, verifica se o arquivo é nulo
if (arquivo == null) {
throw new IllegalArgumentException();
}
// Este if, verifica se arquivo não existir
// ! arquivo exist()
// não arquivo existe
if (!arquivo.exists()) {
throw new IllegalArgumentException();
}
// Este if, verifica se arquivo não é um file
// ! arquivo isFile()
// não arquivo é arquivo
if (!arquivo.isFile()) {
throw new IllegalArgumentException();
}
// Este if, verifica se arquivo
// ! arquivo canRead()
// não arquivo pode ler
if (!arquivo.canRead()) {
throw new IllegalArgumentException();
}
}

}