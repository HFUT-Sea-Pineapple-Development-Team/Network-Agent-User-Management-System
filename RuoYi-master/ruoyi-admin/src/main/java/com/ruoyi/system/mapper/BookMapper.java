package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Book;

/**
 * 书籍列Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-17
 */
public interface BookMapper 
{
    /**
     * 查询书籍列
     * 
     * @param bookId 书籍列主键
     * @return 书籍列
     */
    public Book selectBookByBookId(Long bookId);

    /**
     * 查询书籍列列表
     * 
     * @param book 书籍列
     * @return 书籍列集合
     */
    public List<Book> selectBookList(Book book);

    /**
     * 新增书籍列
     * 
     * @param book 书籍列
     * @return 结果
     */
    public int insertBook(Book book);

    /**
     * 修改书籍列
     * 
     * @param book 书籍列
     * @return 结果
     */
    public int updateBook(Book book);

    /**
     * 删除书籍列
     * 
     * @param bookId 书籍列主键
     * @return 结果
     */
    public int deleteBookByBookId(Long bookId);

    /**
     * 批量删除书籍列
     * 
     * @param bookIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookByBookIds(String[] bookIds);
}
