package com.problemsolving.leetcode.comptetive;

import com.problemsolving.company.zalando.Assassins;
import com.problemsolving.geeksforgeeks.NextGreaterElement;
import com.problemsolving.leetcode.comptetive.t286.FindArrayDifference;
import com.problemsolving.leetcode.comptetive.t286.MinDeletionInArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComptetiveTestCaseRunner {
    NextGreaterElement nextGreaterElement;
    Assassins assassins;
    FindArrayDifference difference;
    MinDeletionInArray minDeletionInArray;
    @BeforeEach
    void setup(){
            nextGreaterElement =new NextGreaterElement();
            assassins= new Assassins();
            difference=new FindArrayDifference();
        minDeletionInArray=new MinDeletionInArray();
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
    @MethodSource("arrayOfArrayParameters")
    void findDifference(int []array1, int []array2,int [][]result) {
        System.out.println(difference.findDifference(array1,array2)) ;
    }

    @ParameterizedTest(name = "{index}: {0}: {1}")
    @MethodSource("arrayWithCountParameters")
    void beautifullArray(int []array1, int expected) {
        int result=minDeletionInArray.minDeletion(array1) ;
        assertEquals(expected,result);
    }

    static Stream<Arguments> arrayWithCountParameters() {
        return Stream.of(
//                Arguments.of(new int[]{
//                        1,1,2,3,5
//                        },1),
                Arguments.of(new int[]{
                        1,1,2,2,3,3
                        },2)
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

    static Stream<Arguments> arrayOfArrayParameters() {
        return Stream.of(
//                Arguments.of(new int[]{
//                                1, 2, 3
//                        }, new int[]{
//                                2, 4, 6
//                        }, new int[][]{{1, 3}, {4, 6}}
//                ),
//                Arguments.of(new int[]{
//                                1, 2, 3, 3
//                        }, new int[]{
//                                1, 1, 2, 2
//                        }, new int[][]{{3}, {}}
//                ),
                Arguments.of(new int[]{
                        -80,-15,-81,-28,-61,63,14,-45,-35,-10
                        }, new int[]{
                        -1,-40,-44,41,10,-43,69,10,2
                        }, new int[][]{{3}, {}}
                )
        );
    }

    static Stream<Arguments> simpleArrayParameters() {
        return Stream.of(
                Arguments.of(new int[]{
                                11, 13, 21, 3
                        },1
                ),
                Arguments.of(new int[]{
                        4, 5, 2, 25
                        },1
                )
        );
    }


}
