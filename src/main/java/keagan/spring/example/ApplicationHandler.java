package keagan.spring.example;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

@SuppressWarnings("deprecation")
public class ApplicationHandler extends SpringBootRequestHandler<String,String>{
}
