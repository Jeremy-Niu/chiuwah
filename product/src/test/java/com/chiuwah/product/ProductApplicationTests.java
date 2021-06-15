package com.chiuwah.product;

import com.chiuwah.product.entity.ItemEntity;
import com.chiuwah.product.service.ItemService;
import com.chiuwah.product.service.PreorderListService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductApplicationTests {

    @Autowired
    ItemService itemService;

    @Autowired
    PreorderListService preorderListService;

    @Test
    void contextLoads() {
        List<ItemEntity> itemEntities = itemService.listAllItems();
        System.out.print(itemEntities);
    }


    @Test
    void TestPreorderList(){

    }


}
