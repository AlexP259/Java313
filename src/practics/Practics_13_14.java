package practics;



public class Practics_13_14 {
    public static void main(String[] args) {
        /*...........................................Задание 1......................................................*/
        Human human1 = new Human("Люся", "20.12.12", "+79043534757", "Йошкар-ола",
                "Россия", "ул.Трактовая, д.19, кв.64");
        human1.printInfo();
        human1.printInstanceCounter();
        Human.setInstanceCounter(4);
        human1.printInstanceCounter();
        /*...........................................Задание 2......................................................*/
//        City sykt = new City("Syktyvkar", "Komi Republic", "Russian",
//                600000, 22432, 8212);
//        sykt.displayInfo();
//        sykt.displayInfo(3);
    }
}


/*.............................................Класс к 1 заданию......................................................*/
class Human {
    private String name;
    private String dateBirthday;
    private String phoneNum;
    private String city;
    private String country;
    private String address;
    private static int instanceCounter;

    public Human(String name, String dateBirthday, String phoneNum, String city, String country, String address) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.phoneNum = phoneNum;
        this.city = city;
        this.country = country;
        this.address = address;
        instanceCounter++;
    }


    public void printInfo(){
        System.out.println("*********** Персональные данные ***********");
        System.out.printf("Имя: %s%n", this.name);
        System.out.printf("Дата рождения: %s%n", this.dateBirthday);
        System.out.printf("Номер телефона: %s%n", this.phoneNum);
        System.out.printf("Страна: %s%n", this.country);
        System.out.printf("Город: %s%n", this.city);
        System.out.printf("Домашний адрес: %s%n", this.address);
        System.out.println("===========================================");
    }

    public void printInstanceCounter() {
        System.out.println("Создано экземпляров класса " + this.getClass() + ": " + instanceCounter);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateBirthday() {
        return dateBirthday;
    }
    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public static int getInstanceCounter() {
        return instanceCounter;
    }


    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static void setInstanceCounter(int instanceCounter) {
        Human.instanceCounter = instanceCounter;
    }
}

/*.............................................Класс к 2 заданию......................................................*/
//class City{
//    private String cityName, regionName, countryName;
//    private int cityPopulation, postcode, cityPhoneCode;
//
//
//    City() {}
//
//    City(String cityName, String regionName, String countryName, int cityPopulation, int postcode, int cityPhoneCode) {
//        this.cityName = cityName;
//        this.regionName = regionName;
//        this.countryName = countryName;
//        this.cityPopulation = cityPopulation;
//        this.postcode = postcode;
//        this.cityPhoneCode = cityPhoneCode;
//    }
//
//
//
//    void displayInfo() {
//        System.out.println("Название города: " + getCityName());
//        System.out.println("Название региона: " + getRegionName());
//        System.out.println("Название страны: " + getCountryName());
//        System.out.println("Количество жителей: " + getCityPopulation());
//        System.out.println("Почтовый индекс города: " + getPostcode());
//        System.out.println("Телефонный код города: " + getCityPhoneCode() + "\n");
//    }
//
//
//    void displayInfo(int num) {
//        switch (num) {
//            case 1:
//                System.out.println("Название города: " + getCityName() + "\n");
//                break;
//            case 2:
//                System.out.println("Название города: " + getCityName());
//                System.out.println("Название региона: " + getRegionName() + "\n");
//                break;
//            case 3:
//                System.out.println("Название города: " + getCityName());
//                System.out.println("Название региона: " + getRegionName());
//                System.out.println("Название страны: " + getCountryName() + "\n");
//                break;
//            case 4:
//                System.out.println("Название города: " + getCityName());
//                System.out.println("Название региона: " + getRegionName());
//                System.out.println("Название страны: " + getCountryName());
//                System.out.println("Количество жителей: " + getCityPopulation() + "\n");
//                break;
//            case 5:
//                System.out.println("Название города: " + getCityName());
//                System.out.println("Название региона: " + getRegionName());
//                System.out.println("Название страны: " + getCountryName());
//                System.out.println("Количество жителей: " + getCityPopulation());
//                System.out.println("Почтовый индекс города: " + getPostcode() + "\n");
//                break;
//            case 6:
//                System.out.println("Название города: " + getCityName());
//                System.out.println("Название региона: " + getRegionName());
//                System.out.println("Название страны: " + getCountryName());
//                System.out.println("Количество жителей: " + getCityPopulation());
//                System.out.println("Почтовый индекс города: " + getPostcode());
//                System.out.println("Телефонный код города: " + getCityPhoneCode() + "\n");
//                break;
//            default:
//                System.out.println("Неверно" + "\n");
//        }
//    }
//
//
//
//    String getCityName() {
//        return this.cityName;
//    }
//    String getRegionName() {
//        return this.regionName;
//    }
//    String getCountryName() {
//        return this.countryName;
//    }
//    int getCityPopulation() {
//        return this.cityPopulation;
//    }
//    int getPostcode() {
//        return this.postcode;
//    }
//    int getCityPhoneCode() {
//        return this.cityPhoneCode;
//    }
//
//
//    void setCityName(String cityName) {
//        this.cityName = cityName;
//    }
//    void setRegionName(String regionName) {
//        this.regionName = regionName;
//    }
//    void setCountryName(String countryName) {
//        this.countryName = countryName;
//    }
//    void setCityPopulation(int cityPopulation) {
//        this.cityPopulation = cityPopulation;
//    }
//    void setPostcode(int postcode) {
//        this.postcode = postcode;
//    }
//    void setCityPhoneCode(int cityPhoneCode) {
//        this.cityPhoneCode = cityPhoneCode;
//    }
//}


