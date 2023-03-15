package chapterTwo;

import java.util.Scanner;

public class TwelveDaysOfChristmas {




//        int days = 1;
//        while (days <= 12) {
        public static String getMessage(int days) {
            String message = "";
           switch (days) {
                case 1:
                    message = """
                            A partridge in a pear tree
                            """;
                    break;

                case 2:
                    message = """
                            A partridge in a pear tree
                            Two turtledoves And a partridge in a pear tree
                            """;
                    break;

                case 3:
                    message = """
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            """;
                    break;

                case 4:
                    message = """
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            """;
                    break;

                case 5:
                    message = """
                            Five gold rings
                            five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            """;
                    break;

                case 6:
                    message = """
                            Six geese a-laying
                            Five gold rings (five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                                    """;
                    break;

                case 7:
                    message = """
                           Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings (five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            """;
                    break;

                case 8:
                    message ="""
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings
                            five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            and a partridge in a pear tree
                            """;
                    break;

                case 9:
                    message = """
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings
                            five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            """;
                    break;

                case 10:
                    message = """
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings
                            five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            """;
                    break;

                case 11:
                    message = """
                            I sent eleven pipers piping
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings
                            five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            """;
                    break;

                case 12:
                    message = """
                            Twelve drummers drumming
                            "Eleven pipers piping
                            "Ten lords a-leaping
                            "Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings
                            five golden rings
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            And a partridge in a pear tree
                            """;
                    break;


            }
            return message;
        }
    }



