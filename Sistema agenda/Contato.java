public class Contato {
    private String nome;
    private String numeroTelefone;
    private String email;

    public Contato(String nome, String numeroTelefone, String email){
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void ExibirContato(){
        System.out.println("Nome: " +nome);
        System.out.println("O email: " +email);
        System.out.println("Numero telefone: " +numeroTelefone);
    }
}