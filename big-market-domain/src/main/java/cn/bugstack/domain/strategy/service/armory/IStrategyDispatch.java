package cn.bugstack.domain.strategy.service.armory;

/**
 * 策略抽奖的调度
 */
public interface IStrategyDispatch {

    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}
