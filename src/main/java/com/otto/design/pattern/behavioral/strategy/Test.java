package com.otto.design.pattern.behavioral.strategy;

import org.apache.commons.lang.StringUtils;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-25 19:50
 **/
public class Test {
//    public static void main(String[]args){
//        /** 在618的时候，我们使用立减的策略 */
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        /** 在618的时候，我们使用反现的策略 */
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

//    public static void main(String[]args){
//        PromotionActivity promotionActivity = null;
//
//        /** 我们来创建一个promotionKey */
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey, "LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }//......
//        promotionActivity.executePromotionStrategy();
//    }

        public static void main(String[]args){

            /** 我们来创建一个promotionKey */
            String promotionKey = "LIJIAN";

            PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
            promotionActivity.executePromotionStrategy();
        }

}