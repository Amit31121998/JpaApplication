package com.amit;


import org.springframework.data.repository.CrudRepository;

import com.amit.entity.Book;

public interface BookRepo extends CrudRepository<Book,Integer>{

}
