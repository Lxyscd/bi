package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xy.springbootinit.model.entity.User;
import generator.service.UserService;
import com.xy.springbootinit.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 25848
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-03-24 12:21:19
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




