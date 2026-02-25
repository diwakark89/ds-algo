package com.data.structure.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
*
* Problem: Isomorphic Strings
Meaning (Plain English)

Two strings s and t are isomorphic if:

Each character in s can be mapped to exactly one character in t

The mapping is consistent

No two characters in s map to the same character in t

Order matters

Examples
Example 1
s = "egg"
t = "add"
→ true

Mapping:
e → a, g → d
----------------------------------
Example 2
s = "foo"
t = "bar"
→ false

o → a and o → r ❌ (inconsistent)
----------------------------------
Example 3
s = "paper"
t = "title"
→ true

p→t, a→i, e→l, r→e
----------------------------------
Example 4
s = "ab"
t = "aa"
→ false

a→a, b→a ❌ (two chars map to same char)
* */
public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("paper","title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (used.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                used.add(c2);
            }
        }
        return true;
    }
}
