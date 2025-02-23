package com.example.springbootpractice.service;

import com.example.springbootpractice.domain.ItemEntity;
import com.example.springbootpractice.dto.ItemDto;
import com.example.springbootpractice.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QuickService  {

    @Autowired
    private ItemRepository itemRepository;

      public boolean registerItem(ItemDto itemDto) {
          // TODO: db insert
          ItemEntity itemEntity= new ItemEntity();
          itemEntity.setId(itemDto.getId());
          itemEntity.setName(itemDto.getName());
          itemRepository.save(itemEntity);
          return true;
      }

      public ItemDto getItemById(String id) {
          ItemEntity itemEntity = itemRepository.findById(id).get();
          ItemDto itemdto = new ItemDto();
          itemdto.setId(itemEntity.getId());
          itemdto.setName(itemEntity.getName());

          return itemdto;
      }

}
