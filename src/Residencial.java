
public class Residencial extends Contratos {

	private String endereco;
	private String zonaImovel;
	private boolean tipoResidencia; // 1 - casa 2 - apt

	public String getZonaImovel() {
		return zonaImovel;
	}

	public void setZonaImovel(String zonaImovel) {
		this.zonaImovel = zonaImovel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isTipoResidencia() {
		return tipoResidencia;
	}

	public void setTipoResidencia(boolean tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

}
