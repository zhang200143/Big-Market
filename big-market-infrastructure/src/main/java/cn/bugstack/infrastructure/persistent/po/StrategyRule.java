package cn.bugstack.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

@Data
public class StrategyRule {
    /** id */
    private Long id;
    /** strategy_id */
    private Long strategyId;
    /** award_id */
    private Integer awardId;
    /** rule_type */
    private Integer ruleType;
    /** rule_model */
    private String ruleModel;
    /** rule_value */
    private String ruleValue;
    /** rule_desc */
    private String ruleDesc;
    /** create_time */
    private Date createTime;
    /** update_time */
    private Date updateTime;
}
