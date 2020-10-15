package com.atguigu.gulimall.product.exception;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.atguigu.common.exception.BizCodeEnume;
import com.atguigu.common.utils.R;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 集中处理所有异常
 * @author Kite
 * @date 2020/10/15
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.atguigu.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {
    /**
     * 捕获校验异常
     * @param e 检验捕获所有异常
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e){
     log.error("数据校验出现问题{}，异常类型：{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String,String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            //获得错误内容
            String defaultMessage = fieldError.getDefaultMessage();
            //获得错误的属性名
            String field = fieldError.getField();
            map.put(field,defaultMessage);
        });

        return R.error(BizCodeEnume.VAILD_EXCEPTION.getCode(),BizCodeEnume.VAILD_EXCEPTION.getMsg()).put("data",map);
    }


    /**
     * 捕获其他所有异常
     * @param throwable 所有异常
     * @return
     */
    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        System.out.println(throwable);
        return R.error(BizCodeEnume.UNKNOW_EXCEPTION.getCode(),BizCodeEnume.UNKNOW_EXCEPTION.getMsg());
    }
}
