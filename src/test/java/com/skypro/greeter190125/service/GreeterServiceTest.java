package com.skypro.greeter190125.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterServiceTest {
    private final GreeterService greeterService = new GreeterService(new HelloService());
    /*?сколько в данном тесте создается обьектов GreeterService
    Ответ: В данном тестовом классе GreeterServiceTest
    создается один объект класса GreeterService, который инициализируется в этой  строке:
    Этот объект будет использоваться во всех тестовых методах (whenNameCorrect, whenNameIsBlank, whenNameNull).
    Если бы вы создавали новый объект GreeterService в каждом тестовом методе, то количество объектов увеличивалось бы, но в текущей реализации это не так.*/

    @Test
    @DisplayName("Позитивный сценарий метода greet whenNameCorrect")
    public void whenNameCorrect() {
        String result = greeterService.greet("Johan");
        Assertions.assertEquals("Hello, Johan",result);
    }
    @Test
    @DisplayName("Негативный сценарий метода greet whenNameIsBlank")
    public void whenNameIsBlank() {
        String result = greeterService.greet(" ");
        Assertions.assertEquals("Hello, Anonimus",result);
    }
    @Test
    @DisplayName("Негативный сценарий метода greet whenNameNull")
    public void whenNameNull() {
        String result = greeterService.greet(null);
        Assertions.assertEquals("Hello, Anonimus",result);
    }
}
