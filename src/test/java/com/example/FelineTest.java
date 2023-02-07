package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat() {
        Feline feline = new Feline();
        try {
            assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(), 1);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(5), 5 );
    }
}