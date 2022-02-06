package questao8;
import java.util.Scanner;
import java.util.ArrayList;
public class CriaFuncionarios{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario;
		String nome;
		
		ArrayList<Funcionario> nomelista = new ArrayList<Funcionario>();
		System.out.print("Digite a quantidade de funcionários: ");
		int tamanho = sc.nextInt();
		for(int i=0; i<tamanho;i++) {
			sc.nextLine();
			System.out.println("Digite o nome do funcionário: "); 
			nome=sc.nextLine();
			System.out.println("Digite o salário do funcionário: "); 
			salario=sc.nextDouble();
			nomelista.add(new Funcionario(nome, salario));
		}
		for(int i=0; i<tamanho;i++) {
			System.out.println("Funcionário: "+nomelista.get(i).getNome());
			System.out.println("Salário: "+nomelista.get(i).getSalario());
			if(nomelista.get(i).getSalario()>= 2000) {
				System.out.println("Desconto: "+nomelista.get(i).getBonus());
			}else {
				System.out.println("Bônus: "+nomelista.get(i).getBonus());
			}
			System.out.println("Salário liquido: "+nomelista.get(i).getLiquido()+"\n");	
		}
		sc.close();
	}
}