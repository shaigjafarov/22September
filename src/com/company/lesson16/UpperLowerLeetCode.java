package com.company.lesson16;

import java.util.List;

public class UpperLowerLeetCode {

    public static void main(String[] args) {


        String pattern = "FoBaT";
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        camelMatch(queries, pattern);


    }

    private static String[] patternToSringArray(String pattern) {

        String forSplit = "";
        for (char letter : pattern.toCharArray()) {
            if ((letter + "").matches("([A-Z])")) {
                forSplit = forSplit + "," + letter;
            } else {
                forSplit = forSplit + letter;
            }
        }
        String result = forSplit.replaceFirst(",", "");
        String[] patternArr = result.split(",");


        for (String prefix : patternArr
        ) {
            System.out.println(prefix);
        }
        return patternArr;


    }

    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        String forSplit = "";
        for (char letter : pattern.toCharArray()) {
            if ((letter + "").matches("([A-Z])")) {
                forSplit = forSplit + "," + letter;
            } else {
                forSplit = forSplit + letter;
            }
        }
        String result = forSplit.replaceFirst(",", "");
        String[] prefixes = result.split(",");

        Boolean[] resultArr = new Boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            forSplit="";
            for (char letter : queries[i].toCharArray()) {
                if ((letter + "").matches("([A-Z])")) {
                    forSplit = forSplit + "," + letter;
                } else {
                    forSplit = forSplit + letter;
                }
            }
            String[] separatedQueryArr = forSplit.replaceFirst(",", "").split(",");

            if (prefixes.length != separatedQueryArr.length) {
                resultArr[i] = false;
            } else {
                int count = 0;
                for (int j = 0; j < separatedQueryArr.length; j++) {
                    if (separatedQueryArr[j].startsWith(prefixes[j])) {
                        count++;
                    }
                }
                if (count == separatedQueryArr.length) {
                    resultArr[i] = true;
                } else resultArr[i] = false;
            }


        }

        for (Boolean a : resultArr) {
            System.out.print(a + " ");

        }
        return List.of(resultArr);
    }
}
