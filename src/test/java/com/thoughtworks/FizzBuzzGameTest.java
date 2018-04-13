package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzGameTest {
    private FizzBuzzGame game;

    @Before
    public void setup() {
        game = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        assertThat(game.isWhat(3)).isEqualTo("Fizz");
        assertThat(game.isWhat(13)).isEqualTo("Fizz");
        assertThat(game.isWhat(35)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_have_5() {
        assertThat(game.isWhat(10)).isEqualTo("Buzz");
        assertThat(game.isWhat(50)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Whizz_when_have_7() {
        assertThat(game.isWhat(14)).isEqualTo("Whizz");
        assertThat(game.isWhat(77)).isEqualTo("Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_have_3and5() {
        assertThat(game.isWhat(15)).isEqualTo("FizzBuzz");
        assertThat(game.isWhat(45)).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_when_have_3and7() {
        assertThat(game.isWhat(21)).isEqualTo("FizzWhizz");
        assertThat(game.isWhat(84)).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_have_5and7() {
        assertThat(game.isWhat(70)).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_have_357() {
        assertThat(game.isWhat(105)).isEqualTo("FizzBuzzWhizz");
    }
}