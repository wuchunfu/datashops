package com.bigdata.datashops.model.pojo.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.bigdata.datashops.model.pojo.BaseModel;

import lombok.Data;

@Data
@TableName(value = "t_sys_operation")
public class SysOperation extends BaseModel {
    private String operator;

    private String ip;

    private Integer code;

    private String method;

    private String path;

    private Integer spend;
}
