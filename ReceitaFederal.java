package receitafederal;
public class ReceitaFederal {

    public static void main(String[] args) {
        
        Contribuinte c1;
        c1 = new Contribuinte("Nome: Maria","CPF: 222222-22","Endereço: Rua A, 151", 1000);
        c1.calcularirpf();
        c1.salliquido();   
    }  
}
