package encuesta.com.it.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



import encuesta.com.it.demo.entity.EstiloMusical;

import encuesta.com.it.demo.services.impl.EstiloMusicalServiceImpl;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;




@WebMvcTest
public class EstiloMusicalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EstiloMusicalServiceImpl estiloMusicalService;



    @Test
    void guardarEstiloMusical() throws Exception {
        EstiloMusical estiloMusical = new EstiloMusical();
        estiloMusical.setEstiloMusical("Rock");
        estiloMusical.setId(1L);

        given(estiloMusicalService.save(any(EstiloMusical.class)))
                .willAnswer((invocation) -> invocation.getArgument(0));

        // when
        ResultActions response
         = mockMvc.perform(get("/estiloMusical/guardar"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        MvcResult mvcResult = response.andReturn();
        String content = mvcResult.getResponse().getContentAsString();

        response.andDo((ResultHandler) status().isCreated());



    }

    @Test
    void testListarEstilosMusicales() throws Exception {
        List<EstiloMusical> estiloMusicalList = new ArrayList<>();
        // given
        EstiloMusical estiloMusical1 = new EstiloMusical();
        estiloMusical1.setEstiloMusical("Rock");
        EstiloMusical estiloMusical2 = new EstiloMusical();
        estiloMusical1.setEstiloMusical("Jazz");
        EstiloMusical estiloMusical3 = new EstiloMusical();
        estiloMusical1.setEstiloMusical("Blue");
        estiloMusicalList.add(estiloMusical1);
        estiloMusicalList.add(estiloMusical2);
        estiloMusicalList.add(estiloMusical3);

        given(estiloMusicalService.findAll()).willReturn(estiloMusicalList);

        // when
        ResultActions response = mockMvc.perform(get("/"));

        // then
        response.andExpect(status().isOk());

    }

   

}
