import java.util.ArrayList;

public class PastryBaker {

    private ArrayList<Pastry> pastries;
    private ArrayList<Baker> bakers;


    public PastryBaker(ArrayList<Pastry> pastries, ArrayList<Baker> bakers) {
        this.pastries = pastries;
        this.bakers = bakers;
    }


    public ArrayList<Pastry> getPastries() {
        return pastries;
    }

    public void setPastries(ArrayList<Pastry> pastries) {
        this.pastries = pastries;
    }

    public ArrayList<Baker> getBakers() {
        return bakers;
    }

    public void setBakers(ArrayList<Baker> bakers) {
        this.bakers = bakers;
    }

    public void addElements(Baker baker,Pastry pastry){

        pastries.add(pastry);
        bakers.add(baker);
    }

    public void returnInfo( ArrayList<PastryBaker> pastryBaker ){
        for (PastryBaker pb: pastryBaker) {
            System.out.println(pb.toString());

        }
    }

    public ArrayList<Pastry> pastries(int bakerId){

    }

}
