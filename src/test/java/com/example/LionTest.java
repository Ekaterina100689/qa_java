package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LionTest {

    private final Feline feline;
    private final String sex;
    private final int expectedKittensCount;
    private final boolean expectedHaveMane;
    private final List<String> expectedFood;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Самец", 1, true, List.of("Животные", "Птицы", "Рыба") },
                { "Самка", 1, false, List.of("Животные", "Птицы", "Рыба") }
        });
    }

    public LionTest(String sex, int kittensCount, boolean haveMane, List<String> food) {
        this.feline = new Feline();
        this.sex = sex;
        this.expectedKittensCount = kittensCount;
        this.expectedHaveMane = haveMane;
        this.expectedFood = food;
    }

    @Test(expected = Exception.class)
    public void whenInvalidSexThenThrownException() throws Exception {
        try {
            new Lion("Самец1", feline);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Используйте допустимые значения пола животного - самей или самка");
            throw e;
        }
    }

    @Test
    public void getKittens() {
        Lion lion = null;
        try {
            lion = new Lion(sex, feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(lion.getKittens(), expectedKittensCount);
    }

    @Test
    public void doesHaveMane() {
        Lion lion = null;
        try {
            lion = new Lion(sex, feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(lion.doesHaveMane(), expectedHaveMane);

    }

    @Test
    public void getFood() {
        Lion lion = null;
        try {
            lion = new Lion(sex, feline);
            assertEquals(lion.getFood(), expectedFood);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}