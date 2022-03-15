package metier;
import dao.IDao;

public class MetierImpl implements IMetier{
	//couplage faible
	private IDao deo;
	
	
	@Override
	public double calcule() {
		double temp=deo.getdata();
		double res=temp*Math.PI*230;
		return res;
	}


	// pour injecter dans la variable deo un objets d'une class qui implement linterface IDao
	public void setDao(IDao deo) {
		this.deo = deo;
	}
	
	

}
