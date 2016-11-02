package com.learn.springboot.repository;

import com.learn.springboot.eneity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yimeng on 2016/11/2.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {

}
