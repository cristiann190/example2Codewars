package com.company.test;

import com.company.DnaStrand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DnaStrandTest {

    private static void execute() {
        DnaStrand.makeComplement("ATAE");
        int i;
    }

    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }

    @Test
    public void testWrongCharacter() {
        assertThrows(RuntimeException.class, DnaStrandTest::execute);
    }
}