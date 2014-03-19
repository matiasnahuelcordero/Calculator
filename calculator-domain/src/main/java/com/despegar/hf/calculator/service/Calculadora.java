package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class Calculadora
    implements Calculator {
    BigDecimal resultado;

    // Arithmetic Operations
    BigDecimal add(BigDecimal t1, BigDecimal t2) {
        this.resultado = t1.add(t2);
        return this.resultado;
    }

    BigDecimal subtract(BigDecimal t1, BigDecimal t2) {
        this.resultado = t1.subtract(t2);
        return this.resultado;
    }

    BigDecimal divide(BigDecimal t1, BigDecimal t2) {
        if (!t2.equals(new BigDecimal("0"))) {
            this.resultado = t1.divide(t2);
            return this.resultado;
        }

    }

    BigDecimal multiply(BigDecimal t1, BigDecimal t2) {
        this.resultado = t1.multiply(t2);
        return this.resultado;
    }

    // Memory Operations
    void memoryClear() {
    }

    BigDecimal memoryRead() {
    }

    void memoryStore(BigDecimal value) {
    }

    void setMemory(Memory m);



}
