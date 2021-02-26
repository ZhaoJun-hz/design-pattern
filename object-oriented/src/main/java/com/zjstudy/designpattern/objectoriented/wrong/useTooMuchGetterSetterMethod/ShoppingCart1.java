package com.zjstudy.designpattern.objectoriented.wrong.useTooMuchGetterSetterMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 简化后的购物车类
 */
public class ShoppingCart1 {
    /*
    itemCount和totalPrice 定义成私有属性, 但是提供了public的getter和setter方法,这和将这两个属性定义为public共有属性没有区别
    外部任何代码都可以随意调用setter方法, 来重新设置itemsCount, totalPrice属性的值,也会导致其跟items属性的值不一致
     */
    private int itemCount;
    private double totalPrice;
    /*
    items属性的getter方法, 返回的是一个List集合容器, 外部调用者拿到这个容器之后, 是可以操作容器内部数据的
    如果要查看购物车都买了啥,就必须提供getter方法了,可以通过java提供的Collections.unmodifiableList()返回一个不可被修改的unmodifiableList集合容器,这个容器类
    重写了跟修改数据相关的方法, 比如add,clear方法, 一旦我们调用这些修改数据的方法, 胆码就会抛出异常,但是还是有问题的
    虽然没办法修改容器中的数据,但可以修改容器中每个对象的数据
     */
    private List<ShoppingCartItem> items = new ArrayList<>();

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ShoppingCartItem> getItems() {
        return items;
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
        itemCount ++;
        totalPrice += item.getPrice();
    }
}
