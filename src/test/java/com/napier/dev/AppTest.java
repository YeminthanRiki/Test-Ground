package com.napier.dev;

import org.junit.jupiter.api.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
     private static final String DB_LOCATION = "localhost:33060";
     private static final int DB_DELAY = 30000;
     private static App app;

     @BeforeAll
     public static void setUpBeforeClass() {
         app = new App();
         app.connect(DB_LOCATION, DB_DELAY);
     }

     @AfterAll
     public static void tearDownAfterClass() {
         if (app.con != null) {
             app.disconnect();
         }
     }

    @Test
    void testConnect() {
        // app.connect(DB_LOCATION, DB_DELAY);
        Assertions.assertNotNull(app.con);
    }

    @Test
    void testGetCountryWorld() {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> countries = app.getCountryWorld();
        Assertions.assertNotNull(countries);
        Assertions.assertFalse(countries.isEmpty());
    }

//    @Test
//    void testGetCountryWorldException()
//    {
//        // Create an instance of App
//        App app = new App();
//
//        // Set a null connection to induce an SQLException in the getCountryWorld method
//        app.con = null;
//
//        // Call the getCountryWorld method and assert that it throws SQLException
//        assertThrows(SQLException.class, () -> app.getCountryWorld());
//    }


    @Test
    void testGetCountryCont() {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> countries = app.getCountryCont();
        Assertions.assertNotNull(countries);
        Assertions.assertFalse(countries.isEmpty());
    }

    @Test
    void testGetCountryRegion() {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> countries = app.getCountryRegion();
        Assertions.assertNotNull(countries);
        Assertions.assertFalse(countries.isEmpty());
    }

    @Test
    void testGetCityWorld() {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> cities = app.getCityWorld();
        Assertions.assertNotNull(cities);
        Assertions.assertFalse(cities.isEmpty());
    }

    @Test
    void testGetCitiesByCont()  {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> cities = app.getCitiesByCont();
        Assertions.assertNotNull(cities);
        Assertions.assertFalse(cities.isEmpty());
    }

    @Test
    void testGetCitiesByRegion()  {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> cities = app.getCitiesByRegion();
        Assertions.assertNotNull(cities);
        Assertions.assertFalse(cities.isEmpty());
    }

    @Test
    void testGetCitiesByCountry()  {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> cities = app.getCitiesByCountry();
        Assertions.assertNotNull(cities);
        Assertions.assertFalse(cities.isEmpty());
    }

    @Test
    void testGetCitiesByDistrict()  {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> cities = app.getCitiesByDistrict();
        Assertions.assertNotNull(cities);
        Assertions.assertFalse(cities.isEmpty());
    }

    @Test
    void testGetCapitalCityWorld()  {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> capitals = app.getCapitalCityWorld();
        Assertions.assertNotNull(capitals);
        Assertions.assertFalse(capitals.isEmpty());
    }

    @Test
    void testGetCapitalCityCont()  {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> capitals = app.getCapitalCityCont();
        Assertions.assertNotNull(capitals);
        Assertions.assertFalse(capitals.isEmpty());
    }

    @Test
    void testGetCapitalCityRegion()  {
        // app.connect(DB_LOCATION, DB_DELAY);
        ArrayList<World> capitals = app.getCapitalCityRegion();
        Assertions.assertNotNull(capitals);
        Assertions.assertFalse(capitals.isEmpty());
    }

    @Test
    void testPrintCyanMessage()
    {
        app.printCyanMessage(null);
    }
    @Test
    void testPrintCyanMessage2()
    {
        app.printCyanMessage("Test");
    }

    @Test
    void testCR2ArrayListsAreNotNull()
    {
        // Call the CR2 method
        app.CR2();

        // Assert that each array list is null
        assertNotNull(app.getCountryWorld());
        assertNotNull(app.getCountryCont());
        assertNotNull(app.getCountryRegion());
        assertNotNull(app.getCityWorld());
        assertNotNull(app.getCitiesByCont());
        assertNotNull(app.getCitiesByRegion());
        assertNotNull(app.getCitiesByCountry());
        assertNotNull(app.getCitiesByDistrict());
    }

    @Test
    void testCR3ArrayListsAreNotNull()
    {
        // Call the CR3 method
        app.CR3();

        assertNotNull(app.getCapitalCityWorld());
        assertNotNull(app.getCapitalCityCont());
        assertNotNull(app.getCapitalCityRegion());

    }

    @Test
    void testMainNull()
    {
        String[] args = {};
        App.main(args);
    }


//    @AfterEach
//    void tearDown()  {
//        if (app.con != null) {
//            app.disconnect();
//        }
//    }
}
