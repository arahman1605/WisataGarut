package com.ngodingcoding.wisatagarut;

/**
 * Created by Lenovo on 22/01/2017.
 */

public class Wisata {
    private String name;
    private String wilWisata;

    private int thumbnail;

    public Wisata() {
    }

    public Wisata(String name, String wilWisata, int thumbnail) {
        this.name = name;
        this.wilWisata = wilWisata;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWilWisata() {
        return wilWisata;
    }

    public void setWilWisata(String wilWisata) {
        this.wilWisata = wilWisata;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
