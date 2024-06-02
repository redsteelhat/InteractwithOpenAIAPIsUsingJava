package com.reveriex.demo.model;

import java.util.List;

public class ChatGPTResponse {
    private List<Choice> choices;

    // Getters and setters
    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public static class Choice {
        private Message message;

        // Getters and Setters

        public Message getMessage() {
            return message;
            //TIP Press <shortcut actionId="Run"/> to run the code
        }

        //TIP Press <shortcut actionId="Run"/> to run the code
        public void setMessage(Message message) {
            this.message = message;
            //TIP Press <shortcut actionId="Run"/> to run the code
        }

        public static class Message {
            private String role;
            private String content;

            // Getters and setters

            public String getRole() {
                return role;
                //TIP Press <shortcut actionId="Run"/> to run the code
            }

            //TIP Press <shortcut actionId="Run"/> to run the code

            public void setRole(String role) {
                this.role = role;
                //TIP Press <shortcut actionId="Run"/> to run the code
            }

            //TIP Press <shortcut actionId="Run"/> to run the code
            public String getContent() {
                return content;
                //TIP Press <shortcut actionId="Run"/> to run the code
            }

            //TIP Press <shortcut actionId="Run"/> to run the code

            public void setContent(String content) {
                this.content = content;
                //TIP Press <shortcut actionId="Run"/> to run the code
            }

        }
    }
}
