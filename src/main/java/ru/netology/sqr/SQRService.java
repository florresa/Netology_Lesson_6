package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int numFrom, int numTo) {
        int iterationsCounter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > numFrom && i * i < numTo) {
                iterationsCounter++;
            }
        }
        return iterationsCounter;
    }
}
