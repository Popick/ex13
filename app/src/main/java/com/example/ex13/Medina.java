package com.example.ex13;

public class Medina {
    private String name;
    private String capital;
    private String anthem;
    private String population;
    private String language;

    public Medina(String name, String capital, String anthem, String population, String language) {
        this.name = name;
        this.capital = capital;
        this.anthem = anthem;
        this.population = population;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getAnthem() {
        return anthem;
    }

    public String getPopulation() {
        return population;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "medina{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", anthem='" + anthem + '\'' +
                ", population='" + population + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
