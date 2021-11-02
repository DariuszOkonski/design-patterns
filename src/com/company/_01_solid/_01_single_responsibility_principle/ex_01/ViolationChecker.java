package com.company._01_solid._01_single_responsibility_principle.ex_01;

public class ViolationChecker {
    public static boolean isValid(Pair pair) {
        String first = pair.getFirst();
        String second = pair.getSecond();

        if(pair.getFirst() == null) {
            return false;
        }

        try {
            Integer.parseInt(first);
        } catch (NumberFormatException nfe) {
            return false;
        }

        if(second == null) {
            return false;
        }

        try {
            Integer.parseInt(second);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}
