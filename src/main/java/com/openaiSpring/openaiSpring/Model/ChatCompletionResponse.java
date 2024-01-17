package com.openaiSpring.openaiSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatCompletionResponse {
//    public ChatCompletionResponse(List<Choice> choices) {
//        this.choices = choices;
//    }

    public List<Choice> getChoices() {
        this.setChoices(choices);
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    private List<Choice> choices;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Choice
    {
        public Choice(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        private int index;

        public ChatMessage getMessage() {
            return message;
        }

        public void setMessage(ChatMessage message) {
            this.message = message;
        }

        private ChatMessage message;

    }
}
