package com.atguigu.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author: atguigu
 * @create: 2024-08-07 14:21
 */
@Data
@Document(indexName = "my_index_new")
public class Goods {
    @Id
    private Integer id;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;
    @Field(type = FieldType.Keyword, index = false)
    private String images;
    @Field(type = FieldType.Keyword)
    private String brand;
    @Field(type = FieldType.Integer)
    private int price;
}
