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
    private int uCode;
    private String uName;
    private String uPwd;
    private int uType;
    private String uMemo;

}
