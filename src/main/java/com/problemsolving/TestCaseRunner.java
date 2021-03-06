package com.problemsolving;

import com.problemsolving.company.zalando.Assassins;
import com.problemsolving.company.zalando.ReduceToZero;
import com.problemsolving.company.zalando.VisitCounter;
import com.problemsolving.company.zalando.ZalandoTestClass3;
import com.problemsolving.geeksforgeeks.NextGreaterElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCaseRunner {
    NextGreaterElement nextGreaterElement;
    Assassins assassins;
    ReduceToZero class1;
    VisitCounter class2;
    ZalandoTestClass3 class3;

    @BeforeEach
    void setup(){
            nextGreaterElement =new NextGreaterElement();
            assassins= new Assassins();
            class1=new ReduceToZero();
            class2=new VisitCounter();
            class3=new ZalandoTestClass3();
    }

    @DisplayName("Should Print Next Greater Element")
    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("simpleArrayParameters")
    void shouldPrintNextGreaterElement(int []array) {
        nextGreaterElement.printNGE(array);

    }

    @ParameterizedTest(name = "{index}: {0}: {1}")
    @MethodSource("stringMatrix")
    void shouldFindThePath(String []array, boolean expected) {
        boolean result= assassins.Solution(array);
        assertEquals(expected,result);
    }

    @ParameterizedTest(name = "{index}: {0}: {1}")
    @MethodSource("failingTestCase")
    void shouldFindThePath2(String []array, boolean expected) {
        boolean result= assassins.Solution(array);
        assertEquals(expected,result);
    }

    @ParameterizedTest(name = "{index}: {0}: {1}")
    @MethodSource("stringOperation")
    void shouldRunTestClass1(String value, int expected) {
        int result= class1.Solution(value);
        assertEquals(expected,result);
    }
    @ParameterizedTest(name = "{index}: {0}: {1}")
    @MethodSource("subArraySum")
    void shouldRunTestClass2(String []array, boolean expected) {
//        boolean result= class2.Solution(array);
//        assertEquals(expected,result);
    }
    @ParameterizedTest(name = "{index}: {0}: {1}")
    @MethodSource("subArraySum")
    void shouldRunTestClass3(String []array, boolean expected) {
//        boolean result= class3.Solution(array);
//        assertEquals(expected,result);
    }

    static Stream<Arguments> stringOperation() {
        return Stream.of(
                Arguments.of("011100", 7),
                Arguments.of("111", 5),
                Arguments.of("1111010101111", 22)
        );
    }
    static Stream<Arguments> subArraySum() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 20, 3, 10, 5}, new int[]{2,4}, 33)
        );
    }

    static Stream<Arguments> stringMatrix() {
        return Stream.of(
                Arguments.of(new String[]{"X.....>", "..v..X.", ".>..X..", "A......"}, false),
                Arguments.of(new String[]{"...Xv", "AX..^", ".XX.."}, true),
                Arguments.of(new String[]{"A.v","..."}, false),
                Arguments.of(new String[]{"...",">.A"}, false),
                Arguments.of(new String[]{"X.vX","...A","^^.."}, true)
                );
    }
    static Stream<Arguments> failingTestCase() {
        return Stream.of(
                Arguments.of(new String[]{"X.....>", "..v..X.", ".>..X..", "A......"}, false)
        );
    }

    static Stream<Arguments> simpleArrayParameters() {
        return Stream.of(
                Arguments.of(new int[]{
                                11, 13, 21, 3
                        }
                ),
                Arguments.of(new int[]{
                        4, 5, 2, 25
                        }
                )
        );
    }


}
