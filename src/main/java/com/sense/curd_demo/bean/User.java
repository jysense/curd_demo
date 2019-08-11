package com.sense.curd_demo.bean;

import lombok.Data;

@Data
public class User {
    /** 编号 */
    private int id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private int age;

    public User(){
    }

}
