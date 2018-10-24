package com.bigdecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigDecCalc {

    class Sell{
        BigDecimal price;
        BigDecimal amount;

        public Sell(BigDecimal price, BigDecimal amount) {
            this.price = price;
            this.amount = amount;
        }
    }

    void process(BigDecimal total, List<Sell> sells) {
        for (Sell sell : sells){
            BigDecimal amount = total.divide(sell.price);
            total = amount.subtract(sell.amount).multiply(BigDecimal.valueOf(3));
            System.out.println(total);
        }

    }

    public static void main(String[] args) {
        BigDecimal total = BigDecimal.valueOf(100);

        ArrayList<Sell> sells = new ArrayList<>();
//        sells.add(new Sell(3, 1));

    }
}
