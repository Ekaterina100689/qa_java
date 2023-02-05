package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = Exception.class)
    public void whenInvalidSexThenThrownException() throws Exception {
        try {
            new Lion("Самец1", new Feline());
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Используйте допустимые значения пола животного - самей или самка");
            throw e;
        }
    }

    @Test
    public void getKittensMale() {
        Lion lion = null;
        try {
            lion = new Lion("Самец", new Feline());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void getKittensFemale() {
        Lion lion = null;
        try {
            lion = new Lion("Самка", new Feline());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void doesHaveManeMale() {
        Lion lion = null;
        try {
            lion = new Lion("Самец", new Feline());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(lion.doesHaveMane(), true);

    }

    @Test
    public void doesHaveManeFemale() {
        Lion lion = null;
        try {
            lion = new Lion("Самка", new Feline());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(lion.doesHaveMane(), false);

    }

    @Test
    public void getFoodMale() {
        Lion lion = null;
        try {
            lion = new Lion("Самец", new Feline());
            assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getFoodFemale() {
        Lion lion = null;
        try {
            lion = new Lion("Самка", new Feline());
            assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}