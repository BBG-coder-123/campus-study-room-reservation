package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("pricing_rule")
public class PricingRule {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String ruleName;
    private BigDecimal unitPrice;
    private BigDecimal discount;
    private String description;
    private String startTime;
    private String endTime;
    private Integer enabled;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
