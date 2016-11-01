package com.learn.springboot.repository;

import com.learn.springboot.eneity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yimeng on 2016/11/1.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{
    List<Book> findByReader(String reader);
}
