package com.buuth.appspringboot.service.query.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class BaseListContentDto<T extends QueryItem> {

    private List<T> content;

    private Long total;
}
