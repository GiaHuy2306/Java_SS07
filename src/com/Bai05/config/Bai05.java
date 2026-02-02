package com.Bai05.config;

import com.Bai05.config.Config;

public class Bai05 {
    public static void main(String[] args) {
        int score = 80;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm KHÔNG hợp lệ!");
        }

        // Config.MAX_SCORE = 200;
    }
}
