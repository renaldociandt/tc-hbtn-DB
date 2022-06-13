
public class Cliente {

    private Integer id;
    private String nome;
    private Integer idade;
    private String cpf;
    private String RG;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, Integer idade, String cpf, String RG) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.RG = RG;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRg(String rg) {
        this.RG = rg;
    }
}
