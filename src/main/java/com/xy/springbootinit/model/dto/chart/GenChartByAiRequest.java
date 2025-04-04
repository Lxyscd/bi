package com.xy.springbootinit.model.dto.chart;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传请求
 *
 * @author <a href="https://github.com/lixy">程序员鱼皮</a>
 * @from <a href="https://xy.icu">编程导航知识星球</a>
 */
@Data
public class GenChartByAiRequest implements Serializable {


    private String name;

    private String goal;

    private String chartType;

    private static final long serialVersionUID = 1L;
}