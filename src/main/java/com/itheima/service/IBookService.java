package com.itheima.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

import java.util.List;

public interface IBookService extends IService<Book> {
    public IPage<Book> getPage(int currentPage, int pageSize);
    public IPage<Book> getPage(int currentPage, int pageSize, Book book);

}