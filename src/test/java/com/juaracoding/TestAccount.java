package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestAccount {

    int acc_no;
    String name;
    double amount;

    @Test(groups = {"int", "double"})
    @Parameters({"a, n, amt"})
        public void insert(int a, String n, double amt) {
        int acc_no = a;
            name = n;
            amount = amt;
        Assert.assertEquals(acc_no, 7000.0);
        }

        @Test
        @Parameters({"amt, deposit"})
        public void deposit(double amt) {
           amount = amount + amt;
            System.out.println(amt + " deposited");
    Assert.assertEquals( name, 8000.0);
    }

    @Test
    @Parameters({"0"})
        public void withdraw() {

        double amt = 0;
        if (amount < amt) {
                System.out.println("Insufficient Balance");
            } else {
                amount = amount - amt;
                System.out.println(amt + " withdrawn");
Assert.assertEquals(amount, 9000.0);
            }
        }

        @BeforeClass
        @Test(groups = {"functest", "cheackintest"})
        public void checkBalance() {
            System.out.println("Balance is: " + amount);
Assert.assertEquals(amount, acc_no);
        }

        @AfterClass
        @Test(groups = {"functest", "cheackintest"})
        public void display() {
            System.out.println(acc_no + " " + name + " " + amount);
            Assert.assertEquals(name, amount);
        }
    }