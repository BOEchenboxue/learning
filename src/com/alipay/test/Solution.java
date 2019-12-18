package com.alipay.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        int len = 0;
        for(int i=0; i<paths.length; i++) {
            if ("..".equals(paths[i])) {
                len = Math.max(--len, 0);
            } else if (!"".equals(paths[i]) && !".".equals(paths[i])) {
                paths[len++] = paths[i];
            }
        }
        StringBuilder sb = new StringBuilder("/");
        for(int i=0; i<len; i++) {
            sb.append(paths[i]);
            if (i<len-1) {
                sb.append("/");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = solution.simplifyPath("/a/b/..a/a/.b");

        System.out.println(s);
    }
}
