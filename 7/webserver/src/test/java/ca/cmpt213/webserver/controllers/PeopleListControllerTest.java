package ca.cmpt213.webserver.controllers;

import ca.cmpt213.webserver.models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PeopleListControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private PeopleListController peopleListController;

    @BeforeAll
    static void setUp() {
        System.out.println("Runs before each test");
    }

    @Test
    void contextLoads() {
        assertThat(peopleListController).isNotNull();
        assertThat(mockMvc).isNotNull();
    }

    @Test
    void testAddAndGetPeople() throws Exception {
        Person p1 = new Person("jenny", 23);
        Person p2 = new Person("john", 23);
        this.mockMvc.perform(
                post("/person")
                        .content(new ObjectMapper().writeValueAsString(p1))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"pid\":4,\"name\":\"jenny\",\"age\":23}")
        );
        this.mockMvc.perform(
                        post("/person")
                                .content(new ObjectMapper().writeValueAsString(p2))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"pid\":5,\"name\":\"john\",\"age\":23}")
        );
        this.mockMvc.perform(
                get("/person")
                        .param("name", "bob")
                        .param("age", "23"))
                .andExpect(status().isOk()
        );


    }
}