package hospital;

public class Medico {
    
    private String CRM;
    private String nome;
    private int idade;
    private double salario;
    protected boolean aposentado;
    protected double valorApos;
    
    public Medico(String CRM, String nome, int idade, double salario){
        this.CRM = CRM;
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
        medicoAposentado();
        if(this.aposentado){
            valorAposentadoria();
        }else{
            this.valorApos = 0;
        }
    }
    
    // Getters
    public String getCRM() {
        return this.CRM;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }
    
    public boolean getAposentado(){
        return this.aposentado;
    }
    
    public double getValorApos() {
        return this.valorApos;
    }
    
    // Setters
    public void medicoAposentado() {
        this.aposentado = this.idade > 55;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void valorAposentadoria() {
        this.valorApos = this.salario * 0.8;
    }
    
    public String verDados(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nCRM: " + 
                this.CRM + "\nSalário: R$" + this.salario + "\nAposentado: " +
                this.aposentado + "\nValor da Aposentadoria: " + this.valorApos;
    }
}