package com.problemsolving.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class DesignPDFViewer {
    public static void main(String[] args) {

        var list = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        var word= "abc";
        System.out.println(designerPdfViewer(list, word));
    }
    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;
        for (char ch : word.toCharArray()) {
            int height = h.get(ch-97);
            if (maxHeight < height) {
                maxHeight = height;
            }
        }
    return maxHeight*word.length();
    }
}
