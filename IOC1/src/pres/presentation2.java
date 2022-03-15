package pres;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import dao.IDao;
import metier.IMetier;

public class presentation2 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Scanner scanner=new Scanner(new File("config.txt"));
		String daoClassName=scanner.nextLine();
		Class<?> cDao=Class.forName(daoClassName);
		
		//IDao dao=(IDao)cDao.newInstance();
		IDao dao=(IDao)cDao.getDeclaredConstructor().newInstance();
		
		String metierClassname=scanner.nextLine();
		Class<?> cMetier=Class.forName(metierClassname);
		//IMetier metier=(IMetier)cMetier.newInstance();
		IMetier metier=(IMetier)cMetier.getDeclaredConstructor().newInstance();
		Method m = cMetier.getMethod("setDao", IDao.class);
		m.invoke(metier, dao);
		
		System.out.print("Resultats :"+metier.calcule());
	}
}
