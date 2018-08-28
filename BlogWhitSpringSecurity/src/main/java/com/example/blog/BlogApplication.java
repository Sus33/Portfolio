package com.example.blog;

import com.example.blog.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class BlogApplication extends WebMvcConfigurerAdapter {
    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable ();
    }

    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver ();
        bean.setViewClass (JstlView.class);
        bean.setPrefix ("/WEB-INF/");
        bean.setSuffix (".jsp");
        return bean;
    }

    public static void main(String[] args) {
        SpringApplication.run (BlogApplication.class, args);
    }


//    @Override
//    public void run(String... strings) throws Exception {
//        String email = "manager@mail.ru";
//        User oneByEmail = managerRepository.findOneByEmail (email);
//        if (oneByEmail == null) {
//            managerRepository.save (User.builder ()
//                    .email (email)
//                    .password (new BCryptPasswordEncoder ().encode ("123456"))
//                    .name ("Alex")
//                    .surname ("Smith")
//                    .age (30)
//                    .genderType (GenderType.MALE)
//                    .userType (UserType.MANAGER)
//                    .picture ("http://bestlifeonline.com/content/uploads/2017/05/shutterstock_529646395-500x333.jpg")
//                    .build ());
//        }
//    }
}
