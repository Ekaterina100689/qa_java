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
public class FelineTest {
    private final Feline feline;
    private final List<String> expectedFood;
    private final String expectedFamily;
    private final int expectedKittensWhenNoArgs;
    private final int kittensArg;
    private final int expectedKittensWhenOneArg;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { List.of("Животные", "Птицы", "Рыба"), "Кошачьи", 1, 2, 2 },
                { List.of("Животные", "Птицы", "Рыба"), "Кошачьи", 1, 5, 5 }
        });
    }

    public FelineTest(List<String> expectedFood, String expectedFamily, int expectedKittensWhenNoArgs, int kittensArg, int expectedKittensWhenOneArg) {
        this.feline = new Feline();
        this.expectedFood = expectedFood;
        this.expectedFamily = expectedFamily;
        this.expectedKittensWhenNoArgs = expectedKittensWhenNoArgs;
        this.kittensArg = kittensArg;
        this.expectedKittensWhenOneArg = expectedKittensWhenOneArg;
    }

    @Test
    public void eatMeat() {
        try {
            assertEquals(feline.eatMeat(), expectedFood);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getFamily() {
        assertEquals(feline.getFamily(), expectedFamily);
    }

    @Test
    public void getKittens() {
        assertEquals(feline.getKittens(), expectedKittensWhenNoArgs);
    }

    @Test
    public void testGetKittens() {
        assertEquals(feline.getKittens(kittensArg), expectedKittensWhenOneArg );
    }
}