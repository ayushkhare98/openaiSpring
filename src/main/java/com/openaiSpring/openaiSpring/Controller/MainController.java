package com.openaiSpring.openaiSpring.Controller;

import com.openaiSpring.openaiSpring.Model.ChatCompletionRequest;
import com.openaiSpring.openaiSpring.Model.ChatCompletionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
@Autowired
    RestTemplate restTemplate;


@PostMapping("/openaiapi")
    public String getOpenaiResponse(@RequestBody String prompt)
    {
        ChatCompletionRequest chatCompletionRequest= new ChatCompletionRequest("gpt-3.5-turbo",prompt);
        ChatCompletionResponse response =restTemplate.postForObject("https://api.openai.com/v1/chat/completions",chatCompletionRequest,ChatCompletionResponse.class);

return response.getChoices().get(0).getMessage().getContent();

    }

}
