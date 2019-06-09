package model;

import java.util.*;

public class TechnologyC extends LegalP {
	private ArrayList<Poll> polls;

	private ArrayList<String> providedS;

	public TechnologyC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
			String nameLR, int qEmployees, double assets) {
		super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
		providedS = new ArrayList<String>();
		polls = new ArrayList<Poll>();
	}

	public ArrayList<String> getProvidedS() {
		return providedS;
	}

	public void setProvidedS(ArrayList<String> providedS) {
		this.providedS = providedS;
	}

	@Override
	public String toString() {
		return super.parcialToString() + " \nNo. de servicios prestados:    " + providedS.size() + "\n"
				+ "Promedio respuestas de encuestas de satisfaccion:  \n" + averagePolls() + "\n";
	}

	public ArrayList<Poll> getPolls() {
		return polls;
	}

	public void setPolls(ArrayList<Poll> polls) {
		this.polls = polls;
	}

	public String averagePolls() {
		String aPolls = "";
		double q1 = 0;
		double q2 = 0;
		double q3 = 0;
		double factor = polls.size();
		for (int i = 0; i < polls.size(); i++) {

			q1 += polls.get(i).getService();
			q2 += polls.get(i).getAnswerTime();
			q3 += polls.get(i).getRelationCB();

		}
		q1 = q1 / factor;
		q2 = q2 / factor;
		q3 = q3 / factor;
		aPolls += "Promedio de satisfaccion con el Servicio prestado: " + q1 + "\n"
				+ "Promedio de satisfaccion con el Tiempo de Respuesta: " + q2 + "\n"
				+ "Promedio de satisfaccion con la relacion costo/ beneficio del servicio adquirido: " + q3 + "\n";
		return aPolls;
	}

}
