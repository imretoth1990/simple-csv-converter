package com.imretoth.csvconverter.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ConverterMain implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        int argsLength = args.getSourceArgs().length;
        if(argsLength == 0) {
            System.out.println( "No input file defined" );
        } else {
            Arrays.stream( args.getSourceArgs(), 0, argsLength ).forEach( System.out::println );
        }
    }
}
