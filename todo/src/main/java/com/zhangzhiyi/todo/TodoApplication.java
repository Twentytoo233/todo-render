package com.zhangzhiyi.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
        System.out.println(
                " ___________                  _____________                  ___________    \n" +
                        "(___        \\________       //     /^\\     \\\\       ________/        ___)   \n" +
                        "   (____             \\_____//     //^\\\\     \\\\_____/             ____)      \n" +
                        "       (____              //\\__  // * \\\\  __/\\\\              ____)          \n" +
                        "            (__           ||   \\//_____\\\\/   ||           __)               \n" +
                        "               (__        ||   //       \\\\   ||       ___)                  \n" +
                        "                  (__     \\\\  //         \\\\  //    ___)                     \n" +
                        "                     (____ \\\\//_AEROSMITH_\\\\// ____)                        \n" +
                        "                          (_\\\\_____________//_)                             \n" +
                        "                          /__\\_/\\_/\\/\\_/\\_/__\\                              "
        );
    }
}