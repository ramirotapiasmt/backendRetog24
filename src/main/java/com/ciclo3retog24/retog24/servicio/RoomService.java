package com.ciclo3retog24.retog24.servicio;

import com.ciclo3retog24.retog24.entidad.Room;
import com.ciclo3retog24.retog24.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepository repository;

    public List<Room> getRooms(){
        return repository.findAll();

    }
    public Room saveRoom(Room room){
        return repository.save(room);
    }
}
