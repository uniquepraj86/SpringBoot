package com.Praj.Spring;

import com.Praj.Spring.DI.Teacher;
import com.Praj.Spring.ioc.BubbleSort;
import com.Praj.Spring.ioc.InsertionSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        //IOC

        Teacher teacher = context.getBean("teacher", Teacher.class);
        teacher.show();

//DI
        BubbleSort bubbleSort = context.getBean("bubbleSort", BubbleSort.class);
        bubbleSort.sort();


        InsertionSort insertionSort = context.getBean("insertionSort", InsertionSort.class);
        insertionSort.sort();



    }

}
