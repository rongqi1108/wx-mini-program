package com.rong;

import com.rong.mapper.VideosMapperCustom;
import com.rong.pojo.Users;
import com.rong.pojo.vo.VideosVO;
import com.rong.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RegistTest {

    @Autowired
    private UserService userService;

    @Test
    public void regist() {
        String username="rongqi";
        String password="123456";
//        Users user = new Users();
//        user.setPassword(password);
//        user.setUsername(username);
//        userService.saveUser(user);
        System.out.println(userService.queryUsernameIsExist(username));
    }

    @Autowired
    private VideosMapperCustom videosMapperCustom;
    @Test
    public void sqlTest(){
        List<VideosVO> videosVOS = videosMapperCustom.queryAllVideos("", "1001");
        System.out.println(videosVOS);
    }
}
