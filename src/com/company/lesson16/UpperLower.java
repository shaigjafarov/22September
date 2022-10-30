package com.company.lesson16;

public class UpperLower {

    public static void main(String[] args) {
        String  asd="AbCdAAA";
        String forSplit="";

        for (char aa:asd.toCharArray()) {
            if((aa+"").matches("([A-Z])")){
                    forSplit=forSplit+","+aa;
            }
            else{
                forSplit=forSplit+aa;
            }




        }
        String result= forSplit.replaceFirst(",","");

        String[] at=result.split(",") ;

        for (String asde:at
             ) {

            System.out.println(asde);


        }

    }
}
