package com.example.springbootpractice.controlller;

import com.example.springbootpractice.dto.ItemDto;
import com.example.springbootpractice.dto.ResponseDto;
import com.example.springbootpractice.service.QuickService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class QuickController {

    @Autowired
    private QuickService quickService;

    @GetMapping("/test")
    public String test(){
        log.info("dummy");
        return "tessssssst";
    }

    @GetMapping("/member")
    public String getMember(@RequestParam("empNo") String empNo,
                            @RequestParam("year") int year){
        log.info("empNo: {}", empNo);
        log.info("year: {}", year);
        return "ok";
    }

    @GetMapping("/company/{id}")
    public String getCompany(@RequestParam("id") String id){
        log.info("id: {}", id);
        return "ok";
    }

    @PostMapping("/item")
    public ResponseDto registerItem(@RequestBody ItemDto item){
        log.info("item: {}", item);
        boolean b = quickService .registerItem(item);

        if (b ){
            ResponseDto responseDto = new ResponseDto();
            responseDto.setMessage("ok");
            return responseDto;
        }
        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("fail");
        return responseDto;
    }
}
