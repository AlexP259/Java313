package lesson18.collection8.cities;

public class City implements Comparable<City>{
    private String name;
    private int codeCity;

    public City(String name, int code) {
        this.name = name;
        this.codeCity = code;
    }


    public String getName() {
        return name;
    }

    public int getCodeCity() {
        return codeCity;
    }

    @Override
    public String toString() {
        return "name: '" + getName() + "', code: '" + getCodeCity() + "';";
    }

    @Override
    public int compareTo(City o) {
        return o != null ? this.getName().compareTo(o.getName()) : 0; // Если o не равен 0, то сравниваем строковые переменные как обычно. Если равен, то вернет 0
    }


}
