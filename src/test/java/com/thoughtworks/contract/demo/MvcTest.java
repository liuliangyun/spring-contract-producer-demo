package com.thoughtworks.contract.demo;

import com.thoughtworks.contract.demo.controller.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class MvcTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new UserController());
    }
}
