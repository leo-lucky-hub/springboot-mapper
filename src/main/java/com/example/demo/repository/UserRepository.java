package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

@Repository
public interface UserRepository extends Mapper<User> {

    List<User> findAll();
}
