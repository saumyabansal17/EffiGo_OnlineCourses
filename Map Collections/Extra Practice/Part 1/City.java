public class City {
    private String name;
    private String country;
    private long population;

    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public long getPopulation() {
        return population;
    }

    public void setName(String name) {
        if(name.isBlank() || name.equals(null)){
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public void setCountry(String country) {
        if(country.isBlank() || country.equals(null)){
            throw new IllegalArgumentException("Country cannot be null or blank.");
        }
        this.country = country;
    }

    public void setPopulation(long population) {
        if(population<=0){
            throw new IllegalArgumentException("Population must be greater than 0.");
        }
        this.population = population;
    }
}
