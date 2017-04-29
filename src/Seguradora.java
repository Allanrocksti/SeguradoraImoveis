
public class Seguradora {
	
	public float calcularSeguro(Contratos contrato) {
		
		float valorSeguro = 0.0f;
		
			if(contrato.isTipoConta())
				valorSeguro = calculaSeguroResidencial(contrato);
			else
				valorSeguro = calculaSeguroEmpresarial(contrato);
		
		return valorSeguro;
		
	}

	private float calculaSeguroEmpresarial(Contratos contrato) {
	
		Residencial res = new Residencial();
		float total = contrato.getValorImovel();
		
		total += (total * 0.02);
		
		if (res.getZonaImovel() == "Zona Urbana")
			total += (total * 0.01);
		else if(res.getZonaImovel() == "Zona Suburbana")
			total += (total * 0.005);
		
		if(res.isTipoResidencia())
			total += (total * 0.005);
			
		return total;
		
	}

	private float calculaSeguroResidencial(Contratos contrato) {
	
		Empresarial emp = new Empresarial();
		float total = contrato.getValorImovel();
		
		total += (total * 0.04);
		
		total += (int)( emp.getQtdFuncionarios() / 10 ) + (total * 0.02);
		
		total += (int)( emp.getQtdVisitasDiarias() / 200 ) + (total * 0.03);
		
		if(emp.getRamo() == "Industria")
			total += (total * 0.01);
		else if(emp.getRamo() == "Comércio")
			total += (total * 0.005);
			
		return total;
		
	}
}

