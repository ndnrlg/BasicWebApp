package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            if (query.toLowerCase().contains("your")) {
                return "NNCKHR";
            }
            return "MyTeam";
        }
        if (query.toLowerCase().contains("class")) {
            return "17213";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            Integer i = Integer.parseInt(parts[2]) + Integer.parseInt(parts[4]);
            return i.toString();
        }
        if (query.toLowerCase().contains("multiplied")) {
            String[] parts = query.split(" ");
            Integer i = Integer.parseInt(parts[2]) * Integer.parseInt(parts[5]);
            return i.toString();
        }
        if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split(" ");

            int[] nums = {Integer.parseInt(parts[8].substring(0, parts[8].length()-1)),  Integer.parseInt(parts[9].substring(0,parts[9].length()-1)), Integer.parseInt(parts[10].substring(0, parts[10].length()-1)),  Integer.parseInt(parts[11])};
            int max = Integer.MIN_VALUE;
            for (int i =0; i < nums.length; i++){
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            Integer m = new Integer(max);
            return m.toString();
        }
        return "";
    }
}
