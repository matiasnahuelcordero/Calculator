package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class Memoria
    implements Memory {

    Memory m = new Memoria();
    BigDecimal mem;

    @Override
    public void clear() {
        this.mem = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal read() {
        return this.mem;
    }

    @Override
    public void store(BigDecimal value) {
        this.mem = value;

    }


}
