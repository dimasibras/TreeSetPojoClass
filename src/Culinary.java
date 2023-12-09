import java.util.TreeSet;

public class Culinary {
    public static void main(String[] args) {
        TreeSet<pojoCulinary> culinary = new TreeSet<pojoCulinary>(new nameComparator());

        culinary.add(new pojoCulinary("Spaghetti", "Italy"));
        culinary.add(new pojoCulinary("Udon", "Japan"));
        culinary.add(new pojoCulinary("Rendang", "Indonesia"));
        culinary.add(new pojoCulinary("Tom Yum", "Thailand"));
        culinary.add(new pojoCulinary("Dumpling", "China"));

        for(pojoCulinary list: culinary)
        {
            System.out.println(list.getName()+" is a cuisine from "+list.getCountry());
        }
    }
}
