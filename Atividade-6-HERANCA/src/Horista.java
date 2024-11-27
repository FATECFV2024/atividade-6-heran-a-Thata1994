// Classe Horista que herda da classe Empregado
public class Horista extends Empregado {
    private int horas;


    public Horista(String nome, String endereco, int horas){
        super(nome, endereco);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

 // Método que calcula o salário do horista com base na quantidade de horas trabalhadas
    public void calcularSalario(){
        salario = horas * 50;
    }
}
