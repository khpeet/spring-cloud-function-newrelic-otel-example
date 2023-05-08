package keagan.spring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import io.opentelemetry.api.OpenTelemetry;
//import io.opentelemetry.api.trace.Tracer;
//import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;

import java.util.function.Function;

@SpringBootApplication
public class Application {
	
//	//init otel sdk via OpentelmetryExample class
//	OpenTelemetry otel = OpentelemetryExample.initOpenTelemetry();
//
//	//Acquire a tracer
//	Tracer tracer = otel.getTracer(Application.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
    public Function<String, String> testFunction() {

    	//Example for changing existing span name or adding attributes when using the AWS Java SDK wrapper layer (non-manual instrumentation)
    	 Span.current().updateName("/testFunction"); //change span name
    	 Span.current().setAttribute("keagan", "test"); //add key-value pairs to this span


//    	//Example to start a span via SDK manually
//    	Span span = tracer.spanBuilder("/testFunction").startSpan();
//
//    	try {
//    		span.setAttribute("keagan", "test");
//    		return value -> new StringBuilder(value).reverse().toString();
//    	} finally {
//    		span.end();
//    	}

    	return value -> new StringBuilder(value).reverse().toString();

    }

}
