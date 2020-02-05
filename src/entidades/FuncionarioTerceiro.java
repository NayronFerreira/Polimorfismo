package entidades;

public class FuncionarioTerceiro extends Funcionario{
	
	private Double cuustoAdd;
	
	public FuncionarioTerceiro () {
		
	}

	public FuncionarioTerceiro(String nome, Integer horas, Double valorPorHora, Double cuustoAdd) {
		super(nome, horas, valorPorHora);
		this.cuustoAdd = cuustoAdd;
	}

	public Double getCuustoAdd() {
		return cuustoAdd;
	}

	public void setCuustoAdd(Double cuustoAdd) {
		this.cuustoAdd = cuustoAdd;
	}

	@Override
	public Double pagamento() {
		// TODO Auto-generated method stub
		return super.pagamento()+((this.cuustoAdd/100)*110);
	}

	
	
	
	
	
}
