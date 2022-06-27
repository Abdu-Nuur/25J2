package com.company;

public class City {
    private int code;
    private String name;
    private String Territory;
    private int population;

    public City(int code, String name, String territory, int population) {
        this.code = code;
        this.name = name;
        Territory = territory;
        this.population = population;
    }

    public  int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerritory() {
        return Territory;
    }

    public void setTerritory(String territory) {
        Territory = territory;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", Territory='" + Territory + '\'' +
                ", population=" + population +
                '}';
    }
}
