package strategy;

public class Motorista {
	
	private Veiculo veiculo;
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public void comecarAndar() {
		this.veiculo.andar();
	}
}
