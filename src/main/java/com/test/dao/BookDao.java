package com.test.dao;

import com.test.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    // 插入书籍数据
    void insert(Book book);

    // 根据ID删除书籍数据
    void deleteById(Integer id);

    // 根据ID查找书籍数据
    Book findById(Integer id);

    // 查询所有书籍数据
    List<Book> findAll();
}