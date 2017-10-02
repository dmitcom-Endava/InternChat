package service;

import data.LoggerList;
import model.*;

import java.time.LocalDateTime;
import java.util.List;

public class Sender  implements MessageSendeble {
    List loggerList= LoggerList.getLoggerList();


    @Override
    public void sendMessage(Message message) {
        LoggerList.addTextLog(message.toString());
        System.out.println(message.toString());
        LoggerList.addMessageLog(message);
    }


}
