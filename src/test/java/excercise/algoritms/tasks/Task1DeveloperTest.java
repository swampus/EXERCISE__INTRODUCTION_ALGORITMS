package excercise.algoritms.tasks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Task1DeveloperTest {

    private Task1Developer task1Developer = new Task1Developer();

    @Test
    public void sortArrayUsingBubbleSort() {
        List<Integer> intList = new ArrayList<>();


    }

    @Test
    public void whatTimeIsConsumedInCaseOfBubleSort() {
        if (!"o(n*n)".equals(task1Developer.whatTimeIsConsumedInCaseOfBubleSort())) {
            fail("Wrong working time");
        }
    }
}