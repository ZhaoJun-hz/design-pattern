package com.zjstudy.designpattern.objectoriented.polymorphism.classextend;

public class Example {
    public static void test(DynamicArray dynamicArray) {
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        for(int i = 0; i < dynamicArray.size(); ++i) {
            System.out.println(dynamicArray.get(i));
        }
    }

    public static void main(String[] args) {
        SortedDynamicArray sortedDynamicArray = new SortedDynamicArray();
        test(sortedDynamicArray);
    }
}
