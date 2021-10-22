package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BookMapper;
import com.ruoyi.system.domain.Book;
import com.ruoyi.system.service.IBookService;
import com.ruoyi.common.core.text.Convert;

/**
 * 书籍列Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-17
 */
@Service
public class BookServiceImpl implements IBookService 
{
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询书籍列
     * 
     * @param bookId 书籍列主键
     * @return 书籍列
     */
    @Override
    public Book selectBookByBookId(Long bookId)
    {
        return bookMapper.selectBookByBookId(bookId);
    }

    /**
     * 查询书籍列列表
     * 
     * @param book 书籍列
     * @return 书籍列
     */
    @Override
    public List<Book> selectBookList(Book book)
    {
        return bookMapper.selectBookList(book);
    }

    /**
     * 新增书籍列
     * 
     * @param book 书籍列
     * @return 结果
     */
    @Override
    public int insertBook(Book book)
    {
        return bookMapper.insertBook(book);
    }

    /**
     * 修改书籍列
     * 
     * @param book 书籍列
     * @return 结果
     */
    @Override
    public int updateBook(Book book)
    {
        return bookMapper.updateBook(book);
    }

    /**
     * 批量删除书籍列
     * 
     * @param bookIds 需要删除的书籍列主键
     * @return 结果
     */
    @Override
    public int deleteBookByBookIds(String bookIds)
    {
        return bookMapper.deleteBookByBookIds(Convert.toStrArray(bookIds));
    }

    /**
     * 删除书籍列信息
     * 
     * @param bookId 书籍列主键
     * @return 结果
     */
    @Override
    public int deleteBookByBookId(Long bookId)
    {
        return bookMapper.deleteBookByBookId(bookId);
    }
}
