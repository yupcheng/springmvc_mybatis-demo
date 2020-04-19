package com.springapp.mvc.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author yupcheng
 * @version 1.0.0
 * @ClassName DateVO.java
 * @Description TODO
 * @createTime 2020年04月19日 09:54:00
 */
@Getter
@Setter
public class DateVO {
    @DateTimeFormat(pattern =  "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
}
