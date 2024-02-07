package com.napier.dev;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void displayCountryTestNull()
    {
        app.displayCountry(null);
    }

    @Test
    void displayCountryTestEmpty()
    {
        ArrayList<World> country = new ArrayList<>();
        app.displayCountry(country);
    }

    /**
     *
     */
    @Test
    void displayCountryTestContainsNull()
    {
        ArrayList<World> country = new ArrayList<>();
        country.add(null);
        app.displayCountry(country);
    }
}