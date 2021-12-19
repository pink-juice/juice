package com.pink.juice.juicecommon.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuqingyu
 */
@Data
@ApiModel(value = "RedisParam")
public class RedisParam {
    @ApiModelProperty(value = "userId", required = true)
    @NotNull(message = "用户Id不能为空")
    public int userId;

    public String name;

    public int age;

    public List<Integer> weights = new ArrayList<>();
}
