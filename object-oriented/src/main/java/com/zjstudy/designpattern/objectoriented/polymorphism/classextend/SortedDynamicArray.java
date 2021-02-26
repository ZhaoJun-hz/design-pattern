package com.zjstudy.designpattern.objectoriented.polymorphism.classextend;

public class SortedDynamicArray extends DynamicArray{
    @Override
    public void add(Integer e) {
        ensureCapacity();
        // 保证数组中的数据有序
        int i;
        for (i = size - 1; i >= 0; --i) {
            if (elements[i] > e) {
                elements[i + 1] = elements[i];
            }else {
                break;
            }
        }
        elements[i + 1] = e;
        ++ size;
    }
}
