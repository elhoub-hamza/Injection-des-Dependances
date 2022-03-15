package dao;

public class DaoImpl implements IDao{

	@Override
	public double getdata() {
		/* version base de donnes */
		System.out.println("Version base de donnes :");
		double data=Math.random()*40;
		return data;
	}
}
