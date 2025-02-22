package com.example.springbootpractice.controlller;

import com.example.springbootpractice.dto.ItemDto;
import com.example.springbootpractice.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class QuickController {
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
        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("ok");
        return responseDto;
    }
}
