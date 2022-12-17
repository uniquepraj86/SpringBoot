package com.Praj.Spring.Config;


import com.Praj.Spring.DI.Principle;
import com.Praj.Spring.DI.Teacher;
import com.Praj.Spring.ioc.BubbleSort;
import com.Praj.Spring.ioc.InsertionSort;
import com.Praj.Spring.ioc.SortingTechnique;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public Principle principle(){
        return new Principle();
    }

    @Bean
    public Teacher teacher(){
        Teacher teacher = new Teacher();
        teacher.setPrinciple(principle());
        return teacher;
    }

    @Bean
    public Teacher getTeacher(){
        return new Teacher();
    }

    @Bean
    public SortingTechnique insertionSort(){
        return new InsertionSort();
    }

    @Bean
    public SortingTechnique bubbleSort(){
        return new BubbleSort();
    }

}
