package com.reveriex.demo.model;

import java.util.List;

public class ChatGPTRequest {
    private String model;
    private List<Message> messages;

    // Getters and setters
    public String getModel() {
        return model;
        //TIP Press <shortcut actionId="Run"/> to run the code
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    //TIP Press <shortcut actionId="Run"/> to run the code
    public void setMessages(List<Message> messages) {
        this.messages = messages;
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

        public void setRole(String role) {
            this.role = role;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

    }
}
