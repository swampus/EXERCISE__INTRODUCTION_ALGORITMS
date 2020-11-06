package excercise.algoritms.tasks;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Task0JuniorUnitTest {

    private Task0Junior task0Junior = new Task0Junior();


    @Test
    public void getBiggestIntFromArray() {
        int[] some = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            some[i] = i;
        }
        Collections.shuffle(Arrays.asList(some));
        some[876874] = 10000009;
        int result = task0Junior.getBiggestIntFromArray(some);
        if (result != 10000009) {
            fail("You found a wrong number: " + result + " is not the biggest one!");
        }
    }

    @Test
    public void checkDoValueExistsInArray() {
        int[] some = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            some[i] = i;
        }
        Collections.shuffle(Arrays.asList(some));

        int[] forCompare = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            forCompare[i] = i;
        }

        long startExp = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            if (forCompare[i] == 1) {
                //....
            }
        }
        long timeForCompare = System.nanoTime() - startExp;


        long start = System.nanoTime();
        assertTrue(task0Junior.checkDoValueExistsInSortedArray(some, 678560));
        long time = System.nanoTime() - start;


        System.out.println("timeForCompare: " + timeForCompare + " --- time: " + time);

        if (time * 3 > (timeForCompare)) {
            fail("Algorithm working too slow, try binary search");
        }
    }

    @Test
    public void whatTimeIsConsumedInCaseOfTaskOne() {
        if (!"o(n)".equals(task0Junior.whatTimeIsConsumedInCaseOfTaskOne())) {
            fail("Wrong working time");
        }
    }

    @Test
    public void whatTimeIsConsumedInCaseOfTaskTwo() {
        if (!"o(log n)".equals(task0Junior.whatTimeIsConsumedInCaseOfTaskTwo())) {
            fail("Wrong working time");
        }
    }
}