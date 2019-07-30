package com.jack.springboot.mapper;

import com.jack.springboot.model.Menu;
import com.jack.springboot.model.MenuExample;
import org.springframework.stereotype.Repository;

/**
 * MenuMapper继承基类
 */
@Repository
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}