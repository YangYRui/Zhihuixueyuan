package com.zhihuixueyuan.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 通用的分页查询结果
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {

    //数据列表
    private List<T> items;
    //总记录数
    private long counts;
    //当前页码
    private long page;
    //每页记录数
    private long pageSize;
}
