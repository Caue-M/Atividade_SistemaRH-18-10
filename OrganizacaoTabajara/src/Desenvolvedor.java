public class Desenvolvedor extends  Funcionario{
    public Desenvolvedor(String nome){
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 5000;
    }

    @Override
    public String descreverResponsabilidades() {
        return "Desenvolver várias coisas";
    }
}
