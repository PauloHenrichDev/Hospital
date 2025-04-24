package hospital;

public class MedicoAuxiliar extends Medico{

    public MedicoAuxiliar(String CRM, String nome, int idade, double salario){
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
        this.aposentado = getIdade() >= 60;
    }
    
    @Override
    public void valorAposentadoria() {
        super.valorAposentadoria();
    }
}