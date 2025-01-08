package com.example.calculator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Integration test that starts the Spring application context
 * and tests the CalculatorController endpoints via HTTP calls.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddEndpoint() throws Exception {
        mockMvc.perform(get("/add")
                .param("num1", "10")
                .param("num2", "20"))
               .andExpect(status().isOk())
               .andExpect(content().string("30.0"));
    }

    @Test
    public void testSubtractEndpoint() throws Exception {
        mockMvc.perform(get("/subtract")
                .param("num1", "15")
                .param("num2", "5"))
               .andExpect(status().isOk())
               .andExpect(content().string("10.0"));
    }

    @Test
    public void testMultiplyEndpoint() throws Exception {
        mockMvc.perform(get("/multiply")
                .param("num1", "4")
                .param("num2", "5"))
               .andExpect(status().isOk())
               .andExpect(content().string("20.0"));
    }

    @Test
    public void testDivideEndpoint() throws Exception {
        mockMvc.perform(get("/divide")
                .param("num1", "20")
                .param("num2", "4"))
               .andExpect(status().isOk())
               .andExpect(content().string("5.0"));
    }

    @Test
    public void testDivideByZeroEndpoint() throws Exception {
        mockMvc.perform(get("/divide")
                .param("num1", "10")
                .param("num2", "0"))
               .andExpect(status().isOk())  // By default, the controller doesn't change HTTP status
               .andExpect(result -> {
                   // We expect an ArithmeticException thrown
                   // so let's check the cause
                   Throwable exception = result.getResolvedException();
                   if (exception == null) {
                       throw new AssertionError("Expected an exception but got none");
                   }
                   if (!(exception instanceof ArithmeticException)) {
                       throw new AssertionError("Expected ArithmeticException but got: " + exception.getClass());
                   }
               });
    }
}
