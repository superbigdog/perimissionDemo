package com.testwork.demo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Role implements Serializable {
    /*
    id
name
parent_id
type
remarks
create_by
create_time
update_time

     */
    private Integer id;
    private String name;
    private Integer parentId;
    private Integer type;
    private String remarks;
    private Integer create_by;
    private Integer createBy;
    private Date updateTime;
    private Date createTime;

}
