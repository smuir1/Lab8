package com.example.lab8;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        City obj1 = (City) obj;

        // Compare both name and province fields
        return city.equalsIgnoreCase(obj1.getCityName()) &&
                province.equalsIgnoreCase(obj1.getProvinceName());
    }

    // Override hashCode to be consistent with equals
    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}
