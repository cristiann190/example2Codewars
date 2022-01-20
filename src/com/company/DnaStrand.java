package com.company;

public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder complementDna = new StringBuilder();
        for (char letter : dna.toCharArray()) {
            complementDna.append(changeLetter(letter));
        }
        return complementDna.toString();
    }

    private static char changeLetter(char letter) {
        if (letter == 'A') {
            return 'T';
        }
        if (letter == 'T') {
            return 'A';
        }
        if (letter == 'C') {
            return 'G';
        }
        if (letter == 'G') {
            return 'C';
        }
        throw new RuntimeException("wrong character");
    }


    public static String makeComplementOptimized(String dna) {
        char[] chars = dna.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }

        return new String(chars);
    }

    private static char getComplement(char c) {
        switch(c) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
        }
        return c;
    }
}