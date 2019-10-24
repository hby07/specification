package com.dream.specification;

import com.dream.specification.domain.User;
import com.dream.specification.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println("测试mybatis-plus===start");
        //查询所有user信息
        List<User> list = userMapper.selectList(null);
        //添加断言
        Assert.assertEquals(6,list.size());
        list.forEach(System.out::println);
        User user = userMapper.selectById(2);
        System.out.println("\n"+user+"\n");
        user.setId(8l);
        user.setAge(25);
        user.setEmail("hanby0009@gmail.com");
        user.setName("一个小兵");
        userMapper.insert(user);
    }
}
