package hospital;

public class Hospital {

    public static void main(String[] args) {
        
        Medico medico = new Medico("001", "Roberto", 34, 6500);
        MedicoAuxiliar medicoAux = new MedicoAuxiliar("002", "Otto", 62, 4300);
        MedicoCirurgiao medicoCir = new MedicoCirurgiao("001", "Mateus", 50, 6500);
        
        System.out.println("Olá! Vamos conhecer alguns dos nossos médicos?\n");
        System.out.println(medico.verDados() + "\n");
        System.out.println(medicoAux.verDados() + "\n");
        System.out.println(medicoCir.verDados() + "\n");
    }
    
}
