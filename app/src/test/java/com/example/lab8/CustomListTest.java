package com.example.lab8;


import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {


    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void getCountTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(1, list.getCount());
    }

    @Test
    public void deleteCitytest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        int listSize = list.getCount();
        list.deleteCity(new City("estevan", "sk"));
        listSize=list.getCount();
        assertEquals(0, listSize);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        boolean has = list.hasCity(new City("Estevan", "SK"));
        assertEquals(true, has);
        assertEquals(false, list.hasCity(new City("Edmonton", "Alberta")));
    }





}
