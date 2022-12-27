package tdd.chapterTwo;

import chapterTwo.Comparison;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest{


    @Test
    public void testThatMethodCanAddThreeIntegers() {
        //given
        Comparison comparison = new Comparison();
        //when
   int result = comparison.sumNumbers(2,2,2);
   //assert
    assertEquals(6, result);
    }
    @Test
    void addThreeIntegers() {
        //given6
        Comparison comparison = new Comparison();
        //when

        //variables
        assertEquals( 6, comparison.sumNumbers (1,2,3) );
    }
}
