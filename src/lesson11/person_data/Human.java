package lesson11.person_data;

public class Human {
    private String name;
    private String birthday;
    private String phone;
    private String country;
    private String city;
    private String address;


    public Human(String birthday) {
        this.birthday = birthday;
    }

    public Human(String firstName, String birthday, String phone, String country, String city, String address){
        this.name = firstName;
        this.birthday = birthday;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getBirthday() {return birthday;}
    public void setBirthday(String birthday) {this.birthday = birthday;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public void printInfo(){
        System.out.println("*********** Персональные данные ***********");
        System.out.printf("Имя: %s%n", this.name);
        System.out.printf("Дата рождения: %s%n", this.birthday);
        System.out.printf("Номер телефона: %s%n", this.phone);
        System.out.printf("Страна: %s%n", this.country);
        System.out.printf("Город: %s%n", this.city);
        System.out.printf("Домашний адрес: %s%n", this.address);
        System.out.println("===========================================");
    }

}
