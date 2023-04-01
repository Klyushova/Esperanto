package com.example.esperanto;

import java.util.ArrayList;
import java.util.Objects;

public class familio {
    private final ArrayList<familio> wordF = new ArrayList<>();
    private String name;
    private String descrip;


    public familio(String name, String descrip) {
        this.name = name;
        this.descrip = String.valueOf(descrip);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return descrip;
    }

    public void setDescription(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        familio that = (familio) o;
        return name.equals(that.name) && descrip.equals(that.descrip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, descrip);
    }
}
