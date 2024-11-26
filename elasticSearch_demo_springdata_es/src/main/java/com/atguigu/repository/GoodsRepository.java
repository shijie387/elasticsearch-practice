package com.atguigu.repository;

import com.atguigu.model.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 操作ES中商品索引库持久层接口
 * SpringDataES 启动自动扫描Repository子接口产生代理对象，自动根据映射产生索引
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Integer> {
}
