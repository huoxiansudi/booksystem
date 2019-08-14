package com.hxsd.dao;

import com.hxsd.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;



public interface BookTypeDao extends JpaRepository<BookType,Integer>,JpaSpecificationExecutor< BookType>  {
	
	
	
	
}
