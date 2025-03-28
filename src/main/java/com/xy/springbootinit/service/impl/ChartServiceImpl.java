package com.xy.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xy.springbootinit.model.entity.Chart;
import com.xy.springbootinit.service.ChartService;
import com.xy.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 25848
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2025-03-24 12:21:19
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




