public class AlunoCadastro{
    private String nome;
    private String endereco;
    private String uF;
    private int matricula;
    private String email;
    private String senha;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setUF(String uF){
        this.uF = uF;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getUF(){
        return uF;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    
    public String toString(){
        return "nome: "+nome+"\nendereço: "+endereco+"\nUF: "+uF+"\nMatricula: "+matricula+"\nemail: "+email+"\nsenha: "+senha;
    }
}
