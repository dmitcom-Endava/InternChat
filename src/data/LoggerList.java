package data;

import model.Message;

import java.util.ArrayList;
import java.util.List;


public  class LoggerList {
    public static List <String> loggerTextlist = new ArrayList();
    public static List <Message> loggerMessagelist = new ArrayList();


    public LoggerList() {
    }

    public static List<String> getLoggerList() {
        return loggerTextlist;
    }

    public void setLoggerList(List<String> loggerList) {this.loggerTextlist = loggerList;
    }

    public static void addTextLog(String message){
        loggerTextlist.add(message);
    }
    public static void addMessageLog(Message message){
        loggerMessagelist.add(message);
    }

}
