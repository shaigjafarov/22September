package com.company.lesson16;

public class UpperLower {

    public static void main(String[] args) {
        String pattern = "FoBaT";  //{Fo , Ba, T} {Foo, Bar}
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String[] prefixes = patternToStringArray(pattern);
        Boolean[] resultArr = new Boolean[queries.length];


        for (int i = 0; i < queries.length; i++) {
            String[] separatedQueryArr = patternToStringArray(queries[i]);
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
            System.out.print(a+" ");

        }

    }

    private static String[] patternToStringArray(String pattern) {
        String forSplit = "";
        for (char letter : pattern.toCharArray()) {
            if ((letter + "").matches("([A-Z])")) {
                forSplit = forSplit + "," + letter;
            } else {
                forSplit = forSplit + letter;
            }
        }
        String[] patternArr = forSplit.replaceFirst(",", "").split(",");

        for (String prefix : patternArr) {
            System.out.println(prefix);
        }
        return patternArr;


    }
}
