package com.bbb.service.impl;

import com.bbb.domain.User;
import com.bbb.dao.UserDao;
import com.bbb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author heima
 * @since 2022-10-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
