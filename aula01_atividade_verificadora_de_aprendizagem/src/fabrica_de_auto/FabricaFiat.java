package fabrica_de_auto;

public class FabricaFiat implements FabricaDeAuto {

	@Override
	public Sedan criarSedan() {
		return new Siena();
	}

	@Override
	public Popular criarPopular() {
		return new Palio();
	}

	@Override
	public Onibus criarOnibus() {
		return new OnibusFiat();
	}

	@Override
	public Caminhao criarCaminhao() {
		return new CaminhaoFiat();
	}

}
