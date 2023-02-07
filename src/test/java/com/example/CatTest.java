package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSound() {
        Cat cat = new Cat(new Feline());
        assertEquals(cat.getSound(), "Мяу");
    }

    @Test
    public void getFood() {
        Cat cat = new Cat(new Feline());
        try {
            assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}