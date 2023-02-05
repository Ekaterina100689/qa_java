package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void eatMeat() {
        Feline f = new Feline();
        try {
            assertEquals(f.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
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