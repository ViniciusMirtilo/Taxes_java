package receitafederal;

public class Contribuinte {
    
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;
    private double irpf;
    
    public Contribuinte (String n, String c, String e, double s){
        nome =n;
        cpf=c;
        endereco=e;
        salario=s;
        irpf=0;
    }
    
    public void setNome(String n){
        nome=n;
    }
    public String getNome(){
        return nome;
    }
    
    public void setcpf(String c){
        cpf=c;
    }  
    public String getcpf(){
        return cpf;
    }
    
     public void setendereco(String e){
        endereco=e;
    }  
    public String getendereco(){
        return endereco;
    }
    
    public void setsalario(double s){
        salario=s;
    }  
    public double getsalario(){
        return salario;
    }
    
    
    public void calcularirpf(){
         if(salario <=1058)
        {
            irpf=0;
        }
        else
        {
            if (salario <=2100)
            {
                irpf=salario*0.15;
            }
            else
            {
               irpf=salario*0.275;
            }
         } 
    } 
    
    public void salliquido(){
        double x=0; 
        x = salario - irpf;
        imprimir();
        System.out.println("Salário líquido: " + x);
    }
    
    public void imprimir(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco);
        System.out.println(salario);
        System.out.println("Imposto de renda a ser cobrado: " +irpf);
    }  
}
