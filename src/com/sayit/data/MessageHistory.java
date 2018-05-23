package com.sayit.data;

import java.util.Date;
import java.util.List;

public class MessageHistory {

    private Contact contact;
    private List<Message> messageList;
    private String lastMessage;
    private Date lastMessageDate;

    public MessageHistory(Contact contact) {
        this.contact = contact;
    }

    /**
     * Adiciona uma mensagem à lista de mensagens.
     *
     * @param message
     */
    public void addMessage(Message message) {
        //TODO Djan addMessage
    }


    public Contact getContact() {
        return contact;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public Date getLastMessageDate() {
        return lastMessageDate;
    }
}