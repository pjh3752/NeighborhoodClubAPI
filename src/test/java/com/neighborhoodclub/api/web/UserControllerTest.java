package com.neighborhoodclub.api.web;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    /*@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(springSecurity())
                .build();
    }

    @Test
    @WithMockUser(roles="USER")
    public void 유저정보_조회() throws Exception {

        String url = "http://localhost:" + port + "/user/me";
        String token = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0IiwiaWF0IjoxNTkwMTIwNjMxLCJleHAiOjE1OTA5ODQ2MzF9.OltvmcR7avhKU8XVTyNQvlUBzgtgySYTj19B_1oPn7Qr8v53Lj5Fx8OtEDc3rg8hlMW2wbTwj66NgRkjyTNvNw";
        mvc.perform(get(url).header("Authorization", token))
                .andExpect(status().isOk());
    }*/
}