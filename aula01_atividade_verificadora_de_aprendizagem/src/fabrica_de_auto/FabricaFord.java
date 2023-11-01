package fabrica_de_auto;

public class FabricaFord implements FabricaDeAuto {

	@Override
	public Sedan criarSedan() {
		return new FiestaSedan();
	}

	@Override
	public Popular criarPopular() {
		return new Fiesta();
	}

	@Override
	public Onibus criarOnibus() {
		return new OnibusFord ();
	}

	@Override
	public Caminhao criarCaminhao() {
		return new CaminhaoFord();
	}

}
