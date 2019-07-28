package pl.md.webjsonreducer.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(InputController.class)
public class InputControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private String exampleJson;
    private final static String expectedOutput = "{ \"agentVersion\": \"0.1.0\", \"howManyAlerts\": 2, \"architecture\": \"x64\", \"collector\": \"Test_Collector\", \"cpuModel\": \"Intel(R) Xeon(R) CPU E5-2673 v3 @ 2.40GHz\", \"description\": \"Auriga Test Device\", \"discoveryDate\": \"2019-05-21\", \"externalIp\": \"144.0.1.163\" }";
    private ResultActions workResult;

    @Test
    public void whenExampleInputGiven() throws Exception {
//        given
        inputAsInInstructions();
//        when
        useController();
//        then
        assertStatusOk();
        assertOutputMatchesExpected();
    }

    private void inputAsInInstructions() {
        exampleJson = "[\n" +
                "    {   \"2b727991-5ddb-4a42-82eb-13bbb2876a28\": {\n" +
                "            \"agentVersion\": \"0.1.0\",\n" +
                "            \"alertIds\": [\"0a45fa06-87ad-4ef7-ae30-f05d42beca22\", \"16597623-a5d1-4a21-8304-58c458aefd3b\"],\n" +
                "            \"architecture\": \"x64\",\n" +
                "            \"collector\": {\n" +
                "                \"tenantId\": \"496e3cfd-672c-47ae-9dfb-0d840b0aed80\",\n" +
                "                \"collectorId\": \"5316b276-18cc-4692-b89b-26ae22a0c4ef\",\n" +
                "                \"collectorName\": \"Test_Collector\"\n" +
                "            },\n" +
                "            \"cpuModel\": \"Intel(R) Xeon(R) CPU E5-2673 v3 @ 2.40GHz\",\n" +
                "            \"cpuNumber\": 1,\n" +
                "            \"description\": \"Auriga Test Device\",\n" +
                "            \"deviceId\": \"2b727991-5ddb-4a42-82eb-13bbb2876a28\",\n" +
                "            \"discoveryDate\": \"2019-05-21T16:02:56.819\",\n" +
                "            \"externalIp\": \"144.0.1.163\",\n" +
                "            \"externalIpCordLat\": \"52.35\",\n" +
                "            \"externalIpCordLong\": \"4.9167\",\n" +
                "            \"externalIpDateUpdated\":\n" +
                "            \"2019-06-10T09:33:07.932\",\n" +
                "            \"ipAddresses\": [{\n" +
                "                \"ipAddress\": \"1.0.0.4\",\n" +
                "                \"ipFamily\": \"IPv4\",\n" +
                "                \"macAddress\": \"01:1d:3a:20:da:2d\"\n" +
                "            }],\n" +
                "            \"isAgentConnected\": true,\n" +
                "            \"lastSeenDate\": \"2019-06-10T09:46:00.176Z\",\n" +
                "            \"name\": \"AurigaDC01\",\n" +
                "            \"osCode\": \"Windows_NT\",\n" +
                "            \"platform\": \"win32\",\n" +
                "            \"registeredDate\": \"2019-05-21T16:02:56.819\",\n" +
                "            \"release\": \"6.3.9600\",\n" +
                "            \"updatesScriptLastRun\": \"2019-06-10T09:24:10\"\n" +
                "        }\n" +
                "    }\n" +
                "]\n" +
                "    ";
    }

    private void useController() throws Exception {
        workResult = mockMvc.perform(post("/filter").contentType(MediaType.APPLICATION_JSON).content(exampleJson));
    }

    private ResultActions assertStatusOk() throws Exception {
        return workResult.andExpect(status().isOk());
    }

    private void assertOutputMatchesExpected() throws Exception {
        workResult.andExpect(content().json(expectedOutput));
    }
}