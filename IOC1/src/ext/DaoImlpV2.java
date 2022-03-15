package ext;

import dao.IDao;

public class DaoImlpV2 implements IDao {

	@Override
	public double getdata() {
		System.out.print("Version capteurs ");
		return 34;
	}

}
