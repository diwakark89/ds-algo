package com.problemsolving.company.zalando;

import java.util.Optional;

public class UserStats {
    private Optional<Long> visitCount;

    public UserStats(Long count){
        visitCount= Optional.ofNullable(count);
    }

    public Optional<Long> getVisitCount() {
        return visitCount;
    }
}
