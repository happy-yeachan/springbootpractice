package com.example.springbootpractice.repository;

import com.example.springbootpractice.domain.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, String>{

}
