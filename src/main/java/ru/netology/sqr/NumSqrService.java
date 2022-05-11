package ru.netology.sqr;

public class NumSqrService {

    public int sqrService(int lmin, int lmax) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if ((x >= lmin) && (x <= lmax)) {
                count++;

            }
        }

        return count;
    }
}