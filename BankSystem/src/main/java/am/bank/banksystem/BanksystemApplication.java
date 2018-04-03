package am.bank.banksystem;

import am.bank.banksystem.model.GenderType;
import am.bank.banksystem.model.User;
import am.bank.banksystem.model.UserType;
import am.bank.banksystem.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@SpringBootApplication
public class BanksystemApplication  extends WebMvcConfigurerAdapter implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BanksystemApplication.class, args);
	}

	    @Autowired
    private ManagerRepository managerRepository;


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/");
        bean.setSuffix(".jsp");
        return bean;
    }
	@Override
	public void run(String... strings) throws Exception {
		String email = "admin@mail.com";
        User oneByEmail = managerRepository.findOneByEmail(email);
        if (oneByEmail == null) {
            managerRepository.save(User.builder()
                    .email(email)
                    .password(new BCryptPasswordEncoder().encode("123456"))
                    .name("admin")
                    .surname("admin")
                    .age(18)
                    .genderType(GenderType.MALE)
                    .userType(UserType.MANAGER)
                    .build());
        }
	}
}

