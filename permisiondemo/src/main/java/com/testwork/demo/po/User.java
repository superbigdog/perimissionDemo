package com.testwork.demo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    /*
    id
dept_id
username
password
realname
sex
tel
email
avatar
job_title
status
sort
del_flag
create_by
update_time
create_time

     */
    
    private Integer id;
    private Integer deptId;
    private String username;
    private String password;
    private String realname;
    private String sex;
    private String tel;
    private String email;
    private String avatar;
    private String jobTile;
    private Integer status;
    private Integer sort;
    private Integer delFlag;
    private Integer createBy;
    private Date updateTime;
    private Date createTime;
}
