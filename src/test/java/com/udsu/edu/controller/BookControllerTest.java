package com.udsu.edu.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class BookControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void postSave() throws Exception{
        mvc.perform(MockMvcRequestBuilders.post("/saveBook").content("book1"))
                .andExpect(status().isOk())
                .andExpect((content().string(equalTo("{\"id\":1,\"name\":\"book1\"}"))));
    }
}
