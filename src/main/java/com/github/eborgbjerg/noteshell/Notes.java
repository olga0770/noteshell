package com.github.eborgbjerg.noteshell;


import java.util.Map;
import java.util.Properties;

import static java.lang.System.out;


public class Notes {


    public static void main(String[] args) {

        if (args.length == 0) {
            out.println("Notes: missing sub command");
            out.println("Try 'Notes help' for more information");
            System.exit(0);
        }

        // we have at least one argument.

        if ("env".equals(args[0])) {
            // print the JVM's environment.
            printMap(System.getenv());
        }
        else if ("sys".equals(args[0])) {
            // print the JVM's System properties.
            printProps(System.getProperties());
        }

        // ... todo   more subcommands
        //  add-category <category>
        //  list-categories
        //  add-note
        //  list-notes
        //
        //  select-category <category-name>
        //  help [subcommand]
    }

    private static void printProps(Properties properties) {
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private static void printMap(Map<String, String> env) {
        for (Map.Entry<String, String> entry : env.entrySet()) {
            out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

}
