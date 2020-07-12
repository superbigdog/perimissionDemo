package com.lxp.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Payment.java
 * @Description TODO
 * @createTime 2020年07月11日 02:19:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
