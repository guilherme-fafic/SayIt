package com.sayit.data;

public class Message {

    private Contact receiverProfile;
    private boolean sendByMe;
    private byte[] content;
    private MessageType type;

    public Message(Contact receiverProfile, boolean sendByMe, byte[] content, MessageType type) {
        this.receiverProfile = receiverProfile;
        this.sendByMe = sendByMe;
        this.content = content;
        this.type = type;
    }

    public Contact getReceiverProfile() {
        return receiverProfile;
    }

    public void setReceiverProfile(Contact receiverProfile) {
        this.receiverProfile = receiverProfile;
    }

    public boolean isSendByMe() {
        return sendByMe;
    }

    public void setSendByMe(boolean sendByMe) {
        this.sendByMe = sendByMe;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Message{}";
    }
}
