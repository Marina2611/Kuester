package uebung4.flow;

public interface IModel {

	/**
	 * Anmelden einer View.
	 * 
	 * @param view
	 */
	public void anmelden(IView view);

	/**
	 * Abmelden einer View.
	 * 
	 * @param view
	 */
	public void abmelden(IView view);
	
	
	/**
	 * Abfragen des Semesters.
	 * 
	 * @return
	 */
	public int getSemester();
	public int getNumber();

}