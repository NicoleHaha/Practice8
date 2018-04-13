package com.thoughtworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private int count;
    public void setCount(){
        System.out.println("请输入学生数：（回车键结束）");
        scanner.nextInt();
    }
    public void start(int count) {
        this.count = count;
    }

    public String isWhat(int num) {
        int flag = 0;
        String map = new String();
        String temp = String.valueOf(num);
        if (temp.contains("3")) {
            return "Fizz";
        }
        if (num % 3 == 0) flag += 1;
        if (num % 5 == 0) flag += 2;
        if (num % 7 == 0) flag += 4;
        switch (flag) {
            case 0:
                map = temp;
                break;
            case 1:
                map = "Fizz";
                break;
            case 2:
                map = "Buzz";
                break;
            case 3:
                map = "FizzBuzz";
                break;
            case 4:
                map = "Whizz";
                break;
            case 5:
                map = "FizzWhizz";
                break;
            case 6:
                map = "BuzzWhizz";
                break;
            case 7:
                map = "FizzBuzzWhizz";
                break;
            default:
                break;
        }
        return map;
    }
    public List<String> getResults() {
        IntStream.range(1,this.count+1).forEach(item->{
            results.add(isWhat(item));
        });
        return results;
    }
}


