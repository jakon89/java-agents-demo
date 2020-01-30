package tech.devolution;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.SuperMethodCall;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

public class TracerAgent {
    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("Starting TracerAgent");

        new AgentBuilder.Default()
                .type(ElementMatchers.any())
                .transform((builder, typeDescription, classLoader, module) -> builder
                        .method(ElementMatchers.isAnnotatedWith(Trace.class))
                        .intercept(MethodCall.call(() -> {
                            System.out.println("Supervised app called method annotated with @Trace");
                            return null;
                        }).andThen(SuperMethodCall.INSTANCE)))
                .installOn(instrumentation);
    }
}
