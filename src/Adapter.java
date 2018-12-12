
public class Adapter implements graficInterface {
	private StarijaVerzija Sver;
	
	public Adapter(StarijaVerzija Sver) {
		this.Sver=Sver;
	}
	@Override
	public void ispisGrafike() {
		// TODO Auto-generated method stub
		Sver.plotGraphics();
	}
	

}
