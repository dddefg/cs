package com.dk.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 板凳宽宽
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserTable {
    private String userName;
    private String passWord;
    private String userNick;
    private String userGender;
    private Integer phone;
}
