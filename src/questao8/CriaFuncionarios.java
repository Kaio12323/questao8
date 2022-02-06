package questao8;
import java.util.Scanner;
import java.util.ArrayList;
public class CriaFuncionarios{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario;
		String nome;
		
		ArrayList<Funcionario> nomelista = new ArrayList<Funcionario>();
		System.out.print("Digite a quantidade de funcion�rios: ");
		int tamanho = sc.nextInt();
		for(int i=0; i<tamanho;i++) {
			sc.nextLine();
			System.out.println("Digite o nome do funcion�rio: "); 
			nome=sc.nextLine();
			System.out.println("Digite o sal�rio do funcion�rio: "); 
			salario=sc.nextDouble();
			nomelista.add(new Funcionario(nome, salario));
		}
		for(int i=0; i<tamanho;i++) {
			System.out.println("Funcion�rio: "+nomelista.get(i).getNome());
			System.out.println("Sal�rio: "+nomelista.get(i).getSalario());
			if(nomelista.get(i).getSalario()>= 2000) {
				System.out.println("Desconto: "+nomelista.get(i).getBonus());
			}else {
				System.out.println("B�nus: "+nomelista.get(i).getBonus());
			}
			System.out.println("Sal�rio liquido: "+nomelista.get(i).getLiquido()+"\n");	
		}
		sc.close();
	}
}