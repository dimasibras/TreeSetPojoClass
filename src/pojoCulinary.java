import java.util.Comparator;

public class pojoCulinary {

    private String name;
    private String country;

    public pojoCulinary (String name, String country){
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class nameComparator implements Comparator<pojoCulinary>
{

    public int compare(pojoCulinary a, pojoCulinary b)
    {
        return a.getName().compareTo(b.getName());
    }
}
