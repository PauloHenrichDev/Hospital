package hospital;

public class MedicoCirurgiao extends Medico{
    
    public MedicoCirurgiao(String CRM, String nome, int idade, double salario){
        super(CRM, nome, idade, salario);
        medicoAposentado();
        if(this.aposentado){
            valorAposentadoria();
        }else{
            this.valorApos = 0;
        }
    }
    
    @Override
    public void medicoAposentado(){
        this.aposentado = getIdade() >= 50;
    }
    
    @Override
    public void valorAposentadoria() {
        this.valorApos = getSalario() * 0.8 + 800;
    }
}
