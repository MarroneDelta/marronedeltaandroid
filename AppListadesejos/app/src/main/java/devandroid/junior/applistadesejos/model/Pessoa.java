package devandroid.junior.applistadesejos.model;

public class Pessoa {

    // Apos cirar a Classe precisamos de um Construtor;
    // Criar construtor;
    //Atributos estao relacionados a Objetos da Classe Pessoa; como se fosse um template


    private String primeiroNome;
    private String sobreNome;
    private String nomedoCurso;
    private String telefonedeContato;

    // Criaremos os metodos de acesso aos atributos criados:
    // Metodos de acesso: Get(permite pegar o que esta salvo naquele atributo)
    // Set(permite atribuir algum valor para aquele atributo)




    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNomedoCurso() {
        return nomedoCurso;
    }

    public void setNomedoCurso(String nomedoCurso) {
        this.nomedoCurso = nomedoCurso;
    }

    public String getTelefonedeContato() {
        return telefonedeContato;
    }

    public void setTelefonedeContato(String telefonedeContato) {
        this.telefonedeContato = telefonedeContato;
    }

    public Pessoa(){


    }

}
