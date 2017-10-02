package model;

import java.time.LocalDateTime;

public class Message {
    private Human messageSender, messageReceiver;
    private String message;
    private LocalDateTime localDateTime =  LocalDateTime.now();
    private StateMessage stateMessage=StateMessage.UNCHEKED;

    public Message(Human messageSender, Human messageReceiver, String message, StateMessage stateMessage) {
        this.messageSender = messageSender;
        this.messageReceiver = messageReceiver;
        this.message = message;
        this.stateMessage=stateMessage;
    }

    public Human getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(Human messageSender) {
        this.messageSender = messageSender;
    }

    public Human getMessageReceiver() {
        return messageReceiver;
    }

    public void setMessageReceiver(Human messageReceiver) {
        this.messageReceiver = messageReceiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public StateMessage getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(StateMessage stateMessage) {
        this.stateMessage = stateMessage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageSender=" + messageSender +
                ", messageReceiver=" + messageReceiver +
                ", message='" + message + '\'' +
                ", localDateTime=" + localDateTime.toString() +
                ", stateMessage=" + stateMessage +
                '}';
    }
}
