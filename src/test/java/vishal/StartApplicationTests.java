package com.vishal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class StartApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIndexEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.model().attribute("title", " Spring boot application using Maven"))
                .andExpect(MockMvcResultMatchers.model().attribute("msg", "Tech: Minikube, ArgoCD, GithubActions, HelmChart, Jenkins, SonarQube, Docker"));
    }

    @Test
    public void testStaticContent() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/css/main.css"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void contextLoads() {
        // This test ensures the Spring context loads successfully.
    }
}