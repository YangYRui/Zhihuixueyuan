package com.zhihuixueyuan.search.dto;

import com.zhihuixueyuan.base.model.PageResult;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @description TODO
 */
@Data
@ToString
public class SearchPageResultDto<T> extends PageResult {

    //大分类列表
    List<String> mtList;
    //小分类列表
    List<String> stList;

    public SearchPageResultDto(List<T> items, long counts, long page, long pageSize) {
        super(items, counts, page, pageSize);
    }

}
