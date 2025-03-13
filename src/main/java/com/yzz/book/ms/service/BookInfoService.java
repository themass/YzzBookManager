package com.yzz.book.ms.service;

import com.yzz.book.ms.model.BookInfo;

import java.util.List;
import java.util.Map;

public interface BookInfoService {
    Integer getCount();

    List<BookInfo> queryBookInfos();

    BookInfo queryBookInfoById(Integer bookid);

    Integer getSearchCount(Map<String, Object> params);

    List<BookInfo> searchBookInfosByPage(Map<String, Object> params);

    Integer addBookInfo(BookInfo bookInfo);

    Integer deleteBookInfo(BookInfo bookInfo);

    Integer deleteBookInfos(List<BookInfo> bookInfos);

    Integer updateBookInfo(BookInfo bookInfo);
}
