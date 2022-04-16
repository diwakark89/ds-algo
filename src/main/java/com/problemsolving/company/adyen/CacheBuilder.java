package com.problemsolving.company.adyen;

import java.util.*;

public class CacheBuilder {
    public static void main(String[]args){
        CacheBuilder ts=new CacheBuilder();
        List<BinRange> binRangeList=List.of(
                new BinRange("400000000000","400000000005","B"),
                new BinRange("400000000006","400000000010","C"),
                new BinRange("400000000011","400000000013","D"));
        CardTypeCache typeCache= CacheBuilder.buildCache(binRangeList);
        System.out.println(typeCache.get("4111111111111111888888"));

    }
    static final class BinRange {
        final String start;
        final String end;
        final String cardType;

        BinRange(String start, String end, String cardType) {
            this.start = start;
            this.end = end;
            this.cardType = cardType;
        }
    }
    interface CardTypeCache {
        /**
         * @param cardNumber 12 to 23 digit card number.
         *
         * @return the card type for this cardNumber or null if the card number does not
         *      fall into any valid bin ranges.
         */
        String get(String cardNumber);

    }

    public static CardTypeCache buildCache(List<BinRange> binRanges) {
        return new CardTypeCacheImpl(binRanges);
    }

    static class CardTypeCacheImpl implements CardTypeCache{

        Map<Long, BinRange> cardTypeCache;
        NavigableMap<Long, BinRange> nmap  = new TreeMap<>();

        public CardTypeCacheImpl(List<BinRange> binRanges){
            cardTypeCache=new HashMap<>();
            buildCache(binRanges);
        }

        @Override
        public String get(String cardNumber) {
            if(cardNumber== null  || cardNumber.length()<12){
                return null;
            }

            long cardBin=Long.parseLong(cardNumber.substring(0,12));

            Set<Long> keySet= cardTypeCache.keySet();
            BinRange binRange;
            for (Long currentKey:keySet){
                if(cardBin>=currentKey){
                    binRange= cardTypeCache.get(currentKey);
                    if(cardBin<=Long.parseLong(binRange.end)){
                        return binRange.cardType;
                    }
                }
            }
            return null;

        }
        private void buildCache(List<BinRange> binRanges){
            for (BinRange binRange:binRanges){
                cardTypeCache.put(Long.valueOf(binRange.start),binRange);
                nmap.put(Long.valueOf(binRange.start),binRange);
            }
        }
    }

}
