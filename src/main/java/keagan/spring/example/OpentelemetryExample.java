package keagan.spring.example;

//import io.opentelemetry.api.OpenTelemetry;
//import io.opentelemetry.api.common.Attributes;
//import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
//import io.opentelemetry.sdk.OpenTelemetrySdk;
//import io.opentelemetry.sdk.resources.Resource;
//import io.opentelemetry.sdk.trace.SdkTracerProvider;
//import io.opentelemetry.sdk.trace.SpanLimits;
//import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
//import io.opentelemetry.semconv.resource.attributes.ResourceAttributes;
//
//
////This class is just for manually configuring the SDK - an AWS managed layer or agent are much easier to manage
//public class OpentelemetryExample {
//	
//	public static final String OTLP_ENDPOINT = "https://otlp.nr-data.net:4317";
//	public static final String LICENSE_KEY = "<my_key>";
//	public static final String SERVICE_NAME = "my-otel-service";
//	
//	
//	static OpenTelemetry initOpenTelemetry() {
//		
//	    // Configure resource
//	    Resource resource =
//	            Resource.getDefault()
//	                .merge(Resource.create(Attributes.of(ResourceAttributes.SERVICE_NAME, SERVICE_NAME)));
//
//		//Configure trace provider
//		SdkTracerProvider sdkTracerProvider = SdkTracerProvider.builder()
//				.setResource(resource)
//				.setSpanLimits(SpanLimits.builder()
//				.setMaxAttributeValueLength(4095).build()) //NR has a 4096 char limit
//				  .addSpanProcessor(BatchSpanProcessor.builder(OtlpGrpcSpanExporter.builder()
//						  .setEndpoint(OTLP_ENDPOINT)
//						  .addHeader("api-key", LICENSE_KEY)
//						  .setCompression("gzip")
//						  .build()).build())
//				  .build();
//
//		//register otel instance
//		OpenTelemetry openTelemetry = OpenTelemetrySdk.builder()
//				  .setTracerProvider(sdkTracerProvider)
//				  .buildAndRegisterGlobal();
//		
//		
//		return openTelemetry;
//	}
//}
