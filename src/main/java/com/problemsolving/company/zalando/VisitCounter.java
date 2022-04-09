package com.problemsolving.company.zalando;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VisitCounter {
    public static void main(String[]args){
        VisitCounter ts1=new VisitCounter();
        UserStats userStats =new UserStats(1L);
        UserStats userStats1=new UserStats(null);
        Map<String, UserStats> userStatMap=new HashMap<>();
        userStatMap.put("1",userStats);
        userStatMap.put("sfd",userStats);

        Map<String, UserStats> userStatMap1=new HashMap<>();
        userStatMap1.put(null,null);

        Map<String, UserStats> userStatMap2=new HashMap<>();
        userStatMap2.put("1",new UserStats(0L));
        userStatMap2.put("2",new UserStats(0L));


        Map<String, UserStats>[] mapArray=new Map[4];
        mapArray[0]=userStatMap;
        mapArray[1]=userStatMap1;
        mapArray[2]=userStatMap2;
        mapArray[3]=null;

        System.out.println(ts1.count(mapArray));
        System.out.println(ts1.count(mapArray));
    }

    Map<Long, Long> count(Map<String, UserStats>... visits) {

        if(null==visits){
            return Collections.EMPTY_MAP;
        }
        Map<Long,Long> totalVisit=new HashMap<>();
        for(Map<String, UserStats> userVisit:visits){
            if(null!=userVisit) {
                userVisit.forEach((key, value) -> {
                    try {
                        Long userId = Long.parseLong(key);
                        Long count = value.getVisitCount().orElse(0L);
                        if (totalVisit.containsKey(userId)) {
                            totalVisit.put(userId, totalVisit.get(userId) + count);
                        } else if(count!=0) {
                            totalVisit.put(userId, count);
                        }

                    } catch (Exception ignored) {
                    }
                });
            }
        }

        return totalVisit;
    }

}
