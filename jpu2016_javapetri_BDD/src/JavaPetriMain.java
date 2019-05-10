import jpu2016.javapetri.controller.JavaPetriController;
import jpu2016.javapetri.dao.DAOJavaPetri;

public abstract class JavaPetriMain {

	public static void main(final String[] args) {
		//new JavaPetriController().start();
		DAOJavaPetri dao = new DAOJavaPetri();
		dao.open();
		dao.close(); 
	}
}



