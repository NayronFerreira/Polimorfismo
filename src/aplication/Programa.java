package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceiro;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a quantidade de funcionários: ");
		int n = leia.nextInt();
		String nome = null;
		Double vp = null;
		Integer horas = 0;
		Double cadd = 0.0;
		List <Funcionario>listaFuncionario = new ArrayList<>();

		for (int cc = 1; cc <= n; cc++) {
			System.out.println("Informe os dados do funcionário: ");
			System.out.println("O funcionário é terceiro? s/n ");

			char resp = leia.next().charAt(0);
			leia.nextLine();
			if (resp == 's') {
				
				System.out.println("Nome: ");
				nome = leia.nextLine();
				System.out.println("Horas trabalhadas: ");
				horas = leia.nextInt();
				System.out.println("Valor por hora: ");
				vp = leia.nextDouble();
				System.out.println("Informe o custo adcional");
				cadd = leia.nextDouble();
				
				Funcionario terceiro =  new FuncionarioTerceiro(nome, horas, vp, cadd);
				
				listaFuncionario.add(terceiro);
				
			} else {
				System.out.println("Nome: ");
				nome = leia.nextLine();
				System.out.println("Horas trabalhadas: ");
				horas = leia.nextInt();
				System.out.println("Valor por hora: ");
				vp = leia.nextDouble();
				
				Funcionario funcionario = new Funcionario(nome, horas, vp);
				listaFuncionario.add(funcionario);
			}
		}
		
		for (Funcionario x :listaFuncionario) {
			String fun = x.getNome();
			Double salario = x.pagamento();
			System.out.println("Nome: "+fun+" R$ "+salario);
			
		}
		
	}

}
