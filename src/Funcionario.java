// Nao pode instanciar objetos dessa classe, pq e abstrata.
public abstract class Funcionario {

    private String nome;
    private String cpf;
    protected double salario;

    // metodo sem corpo, nao ha implementacao, vc tem que fazer a implementacao nos filhos.
    public abstract double getBonificacao();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
