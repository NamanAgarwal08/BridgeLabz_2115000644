package com.services;

import org.junit.jupiter.api.*;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount();
    }

    @Test
    public void testDeposit() {
        account.deposit(100);
        Assertions.assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.deposit(100);
        Assertions.assertTrue(account.withdraw(50));
        Assertions.assertFalse(account.withdraw(100));
    }
}
