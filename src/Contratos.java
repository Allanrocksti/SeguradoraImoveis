
public class Contratos {

	Clientes cliente;
	private float valorImovel;
	private boolean tipoConta; // 1 - residencial 2 - empresarial

	public float getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}

	public boolean isTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(boolean tipoConta) {
		this.tipoConta = tipoConta;
	}

}
