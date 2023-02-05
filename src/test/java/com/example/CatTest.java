package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getSound() {
        Cat c = new Cat(new Feline());
        assertEquals(c.getSound(), "Мяу");
    }

    @Test
    public void getFood() {
        Cat c = new Cat(new Feline());
        try {
            assertEquals(c.getFood(), List.of("Животные", "Птицы", "Рыба"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}