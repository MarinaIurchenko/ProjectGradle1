package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCashbackHackService1000(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals (expected, actual);
    }
    @Test
    public void shouldCashbackHackService800(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals (expected, actual);
    }
    @Test
    public void shouldCashbackHackService0(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals (expected, actual);
    }
    @Test
    public void shouldCashbackHackServiceMinus(){
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = -50;

        int actual = cashbackHackService.remain(amount);
        int expected = 1050;

        assertEquals (expected, actual);
    }
}
