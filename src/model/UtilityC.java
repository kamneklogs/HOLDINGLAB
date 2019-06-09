package model;

import java.util.ArrayList;

public class UtilityC extends LegalP implements Taxes {
    static final String AL = "ALCANTARILLADO";
    static final String AN = "ENERGIA";
    static final String AC = "ACUEDUCTO";

    private double subscribersT;
    private double subscribers3456;
    private String serviceType;

    private ArrayList<Poll> polls;

    public UtilityC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
            String nameLR, int qEmployees, double assets, double subscribersT, double subscribers3456,
            int serviceType) {
        super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
        this.subscribersT = subscribersT;
        this.subscribers3456 = subscribers3456;
        if (serviceType == 1) {
            this.serviceType = AL;
        }
        if (serviceType == 2) {
            this.serviceType = AN;
        }
        if (serviceType == 3) {
            this.serviceType = AC;
        }
        polls = new ArrayList<Poll>();
    }

    @Override
    public String tProCultura() {
        String toReturn = " ";
        double tPro = 40 - ((subscribers3456 / subscribersT) * 100);

        if (tPro < 0) {
            toReturn += " Exhimido de pago ProCultura";
        } else {
            toReturn += " Valor a pagar por procutura: " + tPro + " %";
        }

        return toReturn;
    }

    public static String getAl() {
        return AL;
    }

    public static String getAn() {
        return AN;
    }

    public static String getAc() {
        return AC;
    }

    public double getSubscribersT() {
        return subscribersT;
    }

    public void setSubscribersT(double subscribersT) {
        this.subscribersT = subscribersT;
    }

    public double getSubscribers3456() {
        return subscribers3456;
    }

    public void setSubscribers3456(double subscribers3456) {
        this.subscribers3456 = subscribers3456;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ArrayList<Poll> getPolls() {
        return polls;
    }

    public void setPolls(ArrayList<Poll> polls) {
        this.polls = polls;
    }

    @Override
    public String toString() {
        return super.parcialToString() + "\nNo. de suscriptores en total:    " + subscribersT + "\n"
                + "No. de suscriptores de estacto 3, 4, 5 y 6:    " + subscribers3456 + "\n"
                + "Tipo de servicio prestado:     " + serviceType + "\n" + "Impuesto ProCultura:    " + tProCultura()
                + "\n" + "Promedio encuestas de respuestas de satisfaccion:    \n" + averagePolls();
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