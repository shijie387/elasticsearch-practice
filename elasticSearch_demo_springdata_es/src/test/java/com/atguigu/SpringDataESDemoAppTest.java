package com.atguigu;

import com.atguigu.model.Goods;
import com.atguigu.repository.GoodsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringDataESDemoAppTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void testDocument(){
        //Goods goods = new Goods();
        //goods.setId(1);
        //goods.setTitle("小米手机15最新款");
        //goods.setImages("xiaomi.png");
        //goods.setBrand("小米");
        //goods.setPrice(6000);
        //elasticsearchTemplate.save(goods);

        //elasticsearchTemplate.delete("1", Goods.class);
    }


    @Autowired
    private GoodsRepository goodsRepository;


    @Test
    public void testRepository(){
        //Goods goods = new Goods();
        //goods.setId(1);
        //goods.setTitle("小米手机15最新款666");
        //goods.setImages("xiaomi.png");
        //goods.setBrand("小米");
        //goods.setPrice(6000);
        //goodsRepository.save(goods);


        Optional<Goods> optional = goodsRepository.findById(1);
        System.out.println(optional.get());


        Iterable<Goods> all = goodsRepository.findAll();
        System.out.println(all);
    }


}
