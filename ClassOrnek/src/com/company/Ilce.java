package com.company;

public class Ilce {
    private Long id;
    private String name;
    private Il il;

    public Ilce() {
    }

    public Ilce(Long id, String name, Il il) {
        this.id = id;
        this.name = name;
        this.il = il;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Il getIl() {
        return il;
    }

    public void setIl(Il il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return "Ilce{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", il=" + il +
                '}';
    }
}
