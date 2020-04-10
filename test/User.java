package com.ning.test;

public class User {
    private String name = "小红";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setName("zhangsan");
        System.out.println(user1.getName());
//        user2=user1;
        user2.setName("lisi");
        System.out.println(user2.getName());

        System.out.println(user1.getName());
        System.out.println(user3.getName());
    }
}
