package com.testwork.demo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Menu implements Serializable {
    /*
    id
parent_id
name
url
permission
type
icon
status
sort
create_by
create_time

     */

    private Integer id;
    private Integer parentId;
    private String name;
    private String url;
    private String permission;
    private Integer status;
    private Integer sort;
    private Integer type;
    private Integer createBy;
    private Date updateTime;
    private Date createTime;
}
