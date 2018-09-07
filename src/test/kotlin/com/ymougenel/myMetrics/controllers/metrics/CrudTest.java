package com.ymougenel.myMetrics.controllers.metrics;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ymougenel.myMetrics.controllers.impl.MetricController;
import com.ymougenel.myMetrics.models.Metric;
import com.ymougenel.myMetrics.persistence.MetricsDAO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.is;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@ContextConfiguration
@WebAppConfiguration
@WebMvcTest(controllers = MetricController.class)
public class CrudTest {

   /* private final String JSON_UTF8 = MediaType.APPLICATION_JSON_UTF8_VALUE;

    @MockBean
    private MetricsDAO metricsDAO;

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;


    private ObjectMapper jsonMapper = new ObjectMapper();

    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();

        Metric metric = new Metric(1L, "something", null, 42);

        try {
            mvc.perform(post("/metrics/")
                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                    .content(jsonMapper.writeValueAsBytes(metric)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void create_succeed() throws Exception {
        Metric metric = new Metric(3L, "something", null, 42);

        mvc.perform(post("/metrics/")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(jsonMapper.writeValueAsBytes(metric)))
                .andExpect(status().isCreated());

        ResultActions perform = mvc.perform(get("/metrics/2")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
//                .andExpect(jsonPath("$.id", is(1)));
        System.out.println("toto");

    }

    // TODO test create
    @Test
    public void create_fail() throws Exception {
        assert (false);
    }

    // TODO test getByID
    @Test
    public void getByID_succeed() throws Exception {
        mvc.perform(get("/metrics/1")
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)));
    }

    // TODO test getByID
    @Test
    public void getByID_fail() throws Exception {
        mvc.perform(get("/metrics/-1")
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isNotFound());
    }

    // TODO test update
    @Test
    public void update_succeed() throws Exception {
        Metric m = new Metric(1L, "two", LocalDateTime.now(), 42);

        mvc.perform(get("/metrics/1")
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)));
    }

    // TODO test update
    @Test
    public void update_fail() throws Exception {
        assert (false);
    }

    // TODO test delete
    @Test
    public void delete_succeed() throws Exception {
        assert (false);
    }

    // TODO test delete
    @Test
    public void delete_fail() throws Exception {
        assert (false);
    }*/

}
