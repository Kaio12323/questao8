package questao8;

public class Funcionario {
	private String nome;
	private double salario;
	private double bonus;
	private double liquido;
	
	public Funcionario(String nome, double salario){
		this.nome=nome;
		this.salario=salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public double getLiquido() {
		if (salario<1000.00) {
			bonus = salario*0.2;
			return liquido = salario + (bonus);
		}else if(salario>=1000 && salario<2000){
			bonus = salario*0.1;
			return liquido = salario + (bonus);
		}else {
			bonus = salario*0.1;
			return liquido = salario - bonus;
		}
	}
	public double getBonus() {
		if (salario<1000.00) {
			return bonus = salario*0.2;
		}else if(salario>=1000 && salario<2000){
			return bonus = salario*0.1;
		}else {
			return bonus = -(salario*0.1);
		}
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
