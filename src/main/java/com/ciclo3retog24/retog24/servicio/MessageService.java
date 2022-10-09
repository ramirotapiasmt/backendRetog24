package com.ciclo3retog24.retog24.servicio;

import com.ciclo3retog24.retog24.entidad.Gama;
import com.ciclo3retog24.retog24.repositorio.MessageRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    private List<Message>getMessages(){
        return repository.findAll();

    }
    public Message saveMessage(Message message){
        return repository.save(message);
    }
    public Message getMessage(long id){
       return repository.findById(id).orElse(null);
    }
    public Message updateMessage(Message messageUpd){
        Message messageOld = getMessage(messageUpd.getID());
        messageOld.getMessage();


        return repository.save(messageOld);

    }

    public void deleteMessage(long id) {

    }
}
