package com.testwork.demo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Dept implements Serializable {
    /*
    id
parent_id
name
type
sort
status
update_time
cretate_by
create_time

     */

    private Integer id;
    private Integer parentId;
    private String name;
    private Integer type;
    private Integer sort;
    private Integer status;
    private Integer createBy;
    private Date updateTime;
    private Date createTime;
}
