public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Cláudio");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Geovane");

        System.out.println("Nome do gerente: ");
        System.out.println(gerente.getNome());
        System.out.println("Salário do gerente: R$");
        System.out.println(gerente.calcularSalario());
        System.out.println("Responsabilidades do gerente: ");
        System.out.println(gerente.descreverResponsabilidades());
        System.out.println("====================================");
        System.out.println("Nome do desenvolvedor: ");
        System.out.println(desenvolvedor.getNome());
        System.out.println("Salário do desenvolvedor: R$");
        System.out.println(desenvolvedor.calcularSalario());
        System.out.println("Responsabilidades do desenvolvedor: ");
        System.out.println(desenvolvedor.descreverResponsabilidades());


    }
}
