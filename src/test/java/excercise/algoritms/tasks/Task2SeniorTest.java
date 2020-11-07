package excercise.algoritms.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2SeniorTest {

    private Task2Senior task2Senior = new Task2Senior();

    @Test
    public void whatTimeIsConsumedInCaseOfMergeSort() {
        if (!"O(2n lgn)".equals(task2Senior.whatTimeIsConsumedInCaseOfMergeSort())) {
            fail("Wrong working time");
        }
    }
}