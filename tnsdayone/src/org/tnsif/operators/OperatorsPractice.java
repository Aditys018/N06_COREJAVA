//Given the meal price (base cost of a meal), tip percent (the percentage of the meal 
//price being added as tip), and tax percent (the percentage of the meal price being added as tax) 
//for a meal,find and print the meal's total cost. Round the result to the nearest integer.


import java.io.*;
		import java.math.*;
		import java.security.*;
		import java.text.*;
		import java.util.*;
		import java.util.concurrent.*;
		import java.util.function.*;
		import java.util.regex.*;
		import java.util.stream.*;
		import static java.util.stream.Collectors.joining;
		import static java.util.stream.Collectors.toList;

package org.tnsif.operators;

public class OperatorsPractice {

	public class Solution {
		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

		        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

		        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

		        Result.solve(meal_cost, tip_percent, tax_percent);

		        bufferedReader.close();
		    }
		}


	}


