package me.whiteship.chapter01.item01;

import java.util.*;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    // EnumSet, EnumMap을 쓰는 이유
    /*
    * 1. Enum은 단일객체(싱글톤패턴)이기 때문에 해싱작업이 필요가 없다.
    *   - 일반적으로 Set<Enum>, Map<Enum, ?>의 경우 해싱작업이 필요하다
    * 2. 순서가 보장된다.(TreeMap의 장점을 가지고 있다.)
    *   - Enum에 명시한 순서가 보장이 된다.
    * 3. 빠르다.
    * */
    public static void main(String[] args) {
        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
    }
}
